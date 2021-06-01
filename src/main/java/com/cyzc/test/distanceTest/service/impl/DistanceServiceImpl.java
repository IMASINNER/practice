package com.cyzc.test.distanceTest.service.impl;

import com.cyzc.test.distanceTest.entity.Candidate;
import com.cyzc.test.distanceTest.entity.Company;
import com.cyzc.test.distanceTest.entity.CompanyInfo;
import com.cyzc.test.distanceTest.entity.CompanyLocation;
import com.cyzc.test.distanceTest.entity.ConfInfo;
import com.cyzc.test.distanceTest.entity.ConfLocation;
import com.cyzc.test.distanceTest.entity.Result;
import com.cyzc.test.distanceTest.service.DistanceService;
import com.cyzc.test.jpa.dao.CandidateDao;
import com.cyzc.test.jpa.dao.CompanyDao;
import com.cyzc.test.jpa.dao.CompanyInfoDao;
import com.cyzc.test.jpa.dao.ConfInfoDao;
import com.cyzc.test.jpa.dao.ResultDao;
import com.cyzc.test.utils.GeoUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DistanceServiceImpl implements DistanceService {


    @Autowired
    private ConfInfoDao confInfoDao;

    @Autowired
    private CompanyInfoDao companyInfoDao;

    @Autowired
    private ResultDao resultDao;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private CandidateDao candidateDao;

    private static final int CORE_SIZE = 20;
    private static final int MAX_SIZE = 60;


    @Override
    public void getDistance() {

        List<String> ids = Arrays.asList("1", "2", "3", "4", "5", "6");

        //List<ConfInfo> confInfoList = confInfoDao.findAll(ids);
        List<ConfInfo> confInfoList = confInfoDao.findAll();

        //List<CompanyInfo> companyInfoList = companyInfoDao.findAllById(ids);
        List<CompanyInfo> companyInfoList = companyInfoDao.findAll();
        log.info("startTime" + System.currentTimeMillis());
        double companyLongitude;
        double companyLatitude;
        double confLongitude;
        double confLatitude;
        double distance;

        for (CompanyInfo companyInfo : companyInfoList) {
            for (ConfInfo confInfo : confInfoList) {
                companyLongitude = companyInfo.getCompanyLongitude();
                companyLatitude = companyInfo.getCompanyLatitude();
                confLongitude = confInfo.getConfLongitude();
                confLatitude = confInfo.getConfLatitude();
                distance = GeoUtils.GetDistance(companyLongitude, companyLatitude, confLongitude,
                        confLatitude);
                if (distance > 301) {
                    continue;
                }
                Result result = new Result();
                result.setId(UUID.randomUUID().toString());
                result.setDate(companyInfo.getDate());
                result.setConfName(confInfo.getName());
                result.setCompanyName(companyInfo.getName());
                result.setProvince(confInfo.getProvince());
                result.setDistance(distance);
                result.setCompanyLongitude(companyLongitude);
                result.setCompanyLatitude(companyLatitude);
                result.setConfLongitude(confLongitude);
                result.setConfLatitude(confLatitude);
                result.setRegisterAddress(companyInfo.getRegisterAddress());
                resultDao.save(result);
            }
        }
        System.out.println("11111111111111111111111111111");
    }

    @Override
    public void getDistanceBetweenConfAndCompany() {

        //getDistance();
    }


    private Double getDistance(CompanyLocation companyLocation, ConfLocation confLocation) {

        return GeoUtils.GetDistance(companyLocation.getLongitude(), companyLocation.getLatitude(),
                confLocation.getLongitude(), confLocation.getLatitude());


    }

    @Override
    public void getDistance2() {

        long companyStart = System.currentTimeMillis();
        final List<Company> companyList = companyDao.findAll();
        long companyEnd = System.currentTimeMillis();
        log.info("get company consume       ========" + (companyEnd - companyStart));

        long getCandidateStart = System.currentTimeMillis();

        final List<Candidate> candidateList = candidateDao.findAll();
        long getCandidateEnd = System.currentTimeMillis();

        log.info(
                "get candidate consume     ==============" + (getCandidateEnd - getCandidateStart));

    }


    public void testCompany(List<Company> companyList) {
/*

        TimeUnit unit;
        BlockingQueue workQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_SIZE, MAX_SIZE,60 , TimeUnit.SECONDS, workQueue);
*/

        Executor executor = Executors.newCachedThreadPool();
        Collection collection;
        CountDownLatch countDownLatch = new CountDownLatch(companyList.size());
        for (int i = 0; i < companyList.size(); i++) {
            final int index = i;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        new Thread().sleep(1000);
                        //模拟耗时操作
                        System.out
                                .println("[1]" + Thread.currentThread().getName() + "----" + index);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            };
            executor.execute(run);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[1] done!");
      //  executor.shutdown();


    }

}
package com.cyzc.test.mybatis.service.serviceimpl;

import com.cyzc.test.Entity.CompanyLocation;
import com.cyzc.test.Entity.ConfLocation;
import com.cyzc.test.mybatis.service.DistanceService;
import com.cyzc.test.utils.GeoUtils;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {

    @Override
    public void getDistanceBetweenConfAndCompany() {


        //getDistance();
    }


    private Double getDistance(CompanyLocation companyLocation, ConfLocation confLocation){

       return GeoUtils.GetDistance(companyLocation.getLongitude(),companyLocation.getLatitude(),confLocation.getLongitude(),confLocation.getLatitude());

    }

}

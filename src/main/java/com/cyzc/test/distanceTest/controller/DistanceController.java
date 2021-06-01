package com.cyzc.test.distanceTest.controller;

import com.cyzc.test.distanceTest.service.DistanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-03-21
 */
@RestController
@RequestMapping("/distance")
@Slf4j
public class DistanceController {

    @Autowired
    private DistanceService distanceService;


    @PostMapping("/getDistance")
    public void getDistance() {
        distanceService.getDistance();
    }

    @PostMapping("/getDistance2")
    public void getDistance2() {
        log.info("进入接口===========================================");
        distanceService.getDistance2();
    }


}
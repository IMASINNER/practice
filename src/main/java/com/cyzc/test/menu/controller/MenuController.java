package com.cyzc.test.menu.controller;

import com.cyzc.test.menu.MenuService;
import com.cyzc.test.menu.model.Menu;
import com.cyzc.test.web.resolve.Response;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-05-28
 */
@RestController
@RequestMapping("/menu")
@Slf4j
public class MenuController {

    @Resource
    private MenuService menuService;

    @RequestMapping(value = "/findTree",method = RequestMethod.POST)
    public Response create(@RequestBody(required = false) Menu menu) {
        log.info("111111111111111111111111111111111");
        List<Menu> list = menuService.findAll(menu);
        return Response.success(list);
    }


}
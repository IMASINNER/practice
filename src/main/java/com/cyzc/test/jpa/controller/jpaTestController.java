package com.cyzc.test.jpa.controller;

import com.cyzc.test.jpa.entity.PersonPojo;
import com.cyzc.test.jpa.dao.PersonResponsitory;
import com.cyzc.test.web.resolve.Response;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Cyzc
 * @Date: 2020/8/31
 * @Description:
 */
@RestController
@RequestMapping(value = "testJPA")
public class jpaTestController {

    @Resource
    private PersonResponsitory personResponsitory;

    /**
     * 前端表单提交数据
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "addPerson")
    public Response getPerson(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "age", required = true) int age) {
        PersonPojo personPojo = new PersonPojo();
        personPojo.setId(id);
        personPojo.setName(name);
        personPojo.setAge(age);
        personResponsitory.save(personPojo);
        return Response.success();
    }

    /**
     * 前端使用json传输数据
     *
     * @param personPojo
     * @return
     */
    @PostMapping(value = "add")
    public Response addPerson(@RequestBody PersonPojo personPojo) {
        personResponsitory.save(personPojo);
        return Response.success();
    }

    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Long id) {
        personResponsitory.deleteById(id);
    }
}

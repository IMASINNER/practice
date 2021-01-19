package com.cyzc.test.mybatis.controller;

import com.cyzc.test.mybatis.entity.Student;
import com.cyzc.test.mybatis.service.StudentService;
import com.cyzc.test.web.resolve.Response;
import com.cyzc.test.web.resolve.ResponseCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(value = "Student")
@Api(value = "测试swagger接口",tags = "StudentController",description = "测试相关")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "getStudent")
    @ApiOperation(value = "获取学生信息",notes = "获取学生信息")
    @ApiImplicitParam(name = "id",value = "学生id",required = true,paramType = "query")
    public Response getStudent(@RequestParam("id") Long id){

        if (id==null){
            return Response.error(ResponseCode.SERVER_ERROR);
        }
        Student s=studentService.getStudent(id);
        if (s==null){
            return Response.error(ResponseCode.SERVER_ERROR);
        }
        return Response.success(s);
    }

    @ApiIgnore
    @RequestMapping(value = "addStudent")
    public Response addStudent(){
        //int result=studentService.addStudent(student);
        List l=new ArrayList();



        Student s=new Student();
        s.setId(60L);
        s.setsName("文在寅");
        s.setsClass(12);
        s.setsSex(1);
        int result=studentService.addStudent(s);
        if (result==1){
            return Response.success();
        }else {
            return Response.error(ResponseCode.SERVER_ERROR);
        }

    }
    @ApiIgnore
    @RequestMapping(value = "deleteStudent")
    public Response deleteStudent(@RequestParam("id") Long id){
        int result=studentService.deleteStudent(id);

        return Response.success(result);


    }
    @ApiIgnore
    @RequestMapping(value = "updateStudent")
    public Response updateStudent(@RequestBody Student student){

        studentService.updateStudent(student);


        return Response.success();

    }
}

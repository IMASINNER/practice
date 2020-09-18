package com.cyzc.test.Controller;

import com.cyzc.test.Entity.Student;
import com.cyzc.test.service.StudentService;
import com.cyzc.test.web.resolve.Response;
import com.cyzc.test.web.resolve.ResponseCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

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
        s.setSname("文在寅");
        s.setSclass(12);
        s.setSsex(1);
        int result=studentService.addStudent(s);
        if (result==1){
            return Response.success();
        }else return Response.error(ResponseCode.SERVER_ERROR);

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

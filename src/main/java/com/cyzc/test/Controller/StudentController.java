package com.cyzc.test.Controller;

import com.cyzc.test.Entity.Student;
import com.cyzc.test.service.StudentService;
import com.cyzc.test.web.resolve.Response;
import com.cyzc.test.web.resolve.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getStudent")
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

    @RequestMapping(value = "addStudent")
    public Response addStudent(){
        //int result=studentService.addStudent(student);

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

    @RequestMapping(value = "deleteStudent")
    public Response deleteStudent(@RequestParam("id") Long id){
        int result=studentService.deleteStudent(id);

        return Response.success(result);


    }

    @RequestMapping(value = "updateStudent")
    public Response updateStudent(@RequestBody Student student){

        studentService.updateStudent(student);


        return Response.success();

    }
}

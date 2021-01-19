package com.cyzc.test.mybatis.service.serviceimpl;

import com.cyzc.test.mybatis.entity.Student;
import com.cyzc.test.mybatis.dao.StudentMapper;
import com.cyzc.test.mybatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private  StudentMapper studentMapper;


    @Override
    public Student getStudent(Long id) {
        Student s=studentMapper.getStudent(id);
        if (null==s){
            return new Student();
        }
        return s;

    }

    @Override
    public int addStudent(Student student) {

        Student student1=studentMapper.getStudent(student.getId());
        if (student1!=null){
            student.setId(student.getId()+1);
        }
        if (null==student){return 0;}
        int result=studentMapper.addStudent(student);
        if (result==1){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int deleteStudent(Long id) {
        int result=studentMapper.deleteStudentById(id);

        return result;
    }

    @Override
    public int updateStudent(Student student) {

        Student s=new Student();
        s.setId(student.getId());
        s.setsName("丘吉尔");
        s.setsSex(0);
        s.setsClass(24);
        int result= studentMapper.updateStudentById(s);
        return result;
    }
}

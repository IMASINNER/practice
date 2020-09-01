package com.cyzc.test.service.serviceimpl;

import com.cyzc.test.Entity.Student;
import com.cyzc.test.Dao.StudentMapper;
import com.cyzc.test.service.StudentService;
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
        s.setSname("丘吉尔");
        s.setSsex(0);
        s.setSclass(24);

        int result= studentMapper.updateStudentById(s);
        return result;
    }
}

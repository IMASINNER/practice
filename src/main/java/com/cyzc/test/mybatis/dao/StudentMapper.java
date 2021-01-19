package com.cyzc.test.mybatis.dao;

import com.cyzc.test.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {

    //根据id获取学生信息
    Student getStudent(@Param("id") Long id);

    int addStudent(Student student);

    int deleteStudentById(@Param("id") Long id);

    int updateStudentById(Student student);
}

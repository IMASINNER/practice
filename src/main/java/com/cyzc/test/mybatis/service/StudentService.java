package com.cyzc.test.mybatis.service;

import com.cyzc.test.mybatis.entity.Student;

public interface StudentService {

    Student getStudent(Long id);

    int addStudent(Student student);

    int deleteStudent(Long id);

    int updateStudent(Student student);
}

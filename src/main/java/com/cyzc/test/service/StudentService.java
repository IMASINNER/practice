package com.cyzc.test.service;

import com.cyzc.test.Entity.Student;

public interface StudentService {

    Student getStudent(Long id);

    int addStudent(Student student);

    int deleteStudent(Long id);

    int updateStudent(Student student);
}

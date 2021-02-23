package com.example.demo.query_by_page1.service;

import com.example.demo.query_by_page1.dao.po.Student;

import java.util.List;

public interface StudentManageService {
    List<Student> queryAllStudents();
    List<Student> queryAllStudentsByPage();
}

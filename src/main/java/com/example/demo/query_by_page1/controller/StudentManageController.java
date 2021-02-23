package com.example.demo.query_by_page1.controller;

import com.example.demo.query_by_page1.dao.po.Student;
import com.example.demo.query_by_page1.service.StudentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentManageController {
    @Autowired
    StudentManageService studentManageService;

    @GetMapping("/queryAllStudents")
    List<Student> queryAllStudents(){
        return studentManageService.queryAllStudents();
    }
}

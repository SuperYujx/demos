package com.example.demo.query_by_page1.service.impl;

import com.example.demo.query_by_page1.dao.mapper.extend.StudentExtendMapper;
import com.example.demo.query_by_page1.dao.po.Student;
import com.example.demo.query_by_page1.service.StudentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManageServiceImpl implements StudentManageService {
    @Autowired
    StudentExtendMapper studentExtendMapper;

    @Override
    public List<Student> queryAllStudents() {
        return studentExtendMapper.selectAllStudents();
    }

    @Override
    public List<Student> queryAllStudentsByPage() {
        return null;
    }
}

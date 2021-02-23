package com.example.demo.query_by_page1.dao.mapper.extend;

import com.example.demo.query_by_page1.dao.po.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentExtendMapper {
    List<Student> selectAllStudents();
    List<Student> selectAllStudentsByPage();
}

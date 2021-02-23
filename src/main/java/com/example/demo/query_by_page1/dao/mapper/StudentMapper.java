package com.example.demo.query_by_page1.dao.mapper;

import com.example.demo.query_by_page1.dao.po.Student;
import com.example.demo.query_by_page1.dao.po.StudentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectOneByExample(StudentExample example);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int batchInsert(@Param("list") List<Student> list);

    int batchInsertSelective(@Param("list") List<Student> list, @Param("selective") Student.Column ... selective);
}
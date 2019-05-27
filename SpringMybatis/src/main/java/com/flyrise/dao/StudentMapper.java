package com.flyrise.dao;

import com.flyrise.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}
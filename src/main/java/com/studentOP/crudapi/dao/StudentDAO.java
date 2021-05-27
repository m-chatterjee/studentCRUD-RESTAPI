package com.studentOP.crudapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentOP.crudapi.models.Student;

public interface StudentDAO extends JpaRepository<Student,Long> {

}

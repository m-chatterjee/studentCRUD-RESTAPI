package com.studentOP.crudapi.services;

import java.util.List;

import com.studentOP.crudapi.models.Student;

public interface CrudService {

	List<Student> getAllStudents();

	Student getSingleStudent(long rollNo);

	void createStudent(Student student) throws Exception;

	void updateStudent(Student student);

	void deleteStudent(long rollNo);

}

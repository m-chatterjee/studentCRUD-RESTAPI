package com.studentOP.crudapi.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentOP.crudapi.dao.StudentDAO;
import com.studentOP.crudapi.models.Student;

@Service
public class CrudServiceImpl implements CrudService {
	
	@Autowired
	private StudentDAO studentDAO;
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.findAll();
	}

	
	@Override
	public Student getSingleStudent(long rollNo) {
		return studentDAO.findById(rollNo).get();
	}

	@Override
	public void createStudent(Student student) throws Exception {
		try{
			Student temp=studentDAO.findById(student.getRollNo()).get();
			throw new Exception();
		}
		catch(NoSuchElementException e) {
			studentDAO.save(student);
		}
		
		
	}

	@Override
	public void updateStudent(Student student) {
		studentDAO.save(student);
		
	}

	@Override
	public void deleteStudent(long rollNo) {
		studentDAO.deleteById(rollNo);
		
	}

}

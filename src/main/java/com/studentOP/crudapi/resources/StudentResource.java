package com.studentOP.crudapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentOP.crudapi.models.Student;
import com.studentOP.crudapi.services.CrudService;

@RestController
public class StudentResource {
	@Autowired
	private CrudService crudService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.crudService.getAllStudents();
	}
	@GetMapping("/students/{rollNo}")
	public Student getStudent(@PathVariable String rollNo) {
		return this.crudService.getSingleStudent(Long.parseLong(rollNo));
	}
	
	@PostMapping("/students")
	public ResponseEntity<HttpStatus> createNewStudent(@RequestBody Student student){
		try {
			crudService.createStudent(student);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/students")
	public ResponseEntity<HttpStatus> updateStudent(@RequestBody Student student){
		try {
			crudService.updateStudent(student);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/students/{rollNo}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String rollNo){
		try {
			crudService.deleteStudent(Long.parseLong(rollNo));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}

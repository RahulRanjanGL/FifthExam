package com.swagger.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.swagger.demo.dao.StudentRepo;
import com.swagger.demo.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	//Select all Student Details
		@GetMapping(path="/student")
		 public List<Student> getStudent(){

			return repo.findAll();

		 }
		
		//Select a particular student based on student-Id
		@GetMapping("/student/{sId}")
		 public Optional<Student> getAlien(@PathVariable("sId")int sId) {

			return repo.findById(sId);

		 }
		
		//Insert a Student record in the table
		 @PostMapping(path="/student",consumes= {"application/json"})
		 public Student addCustomer(@RequestBody Student stud){

			 repo.save(stud);
			 
			 return stud;
		 }
		 
		 //Update the student details in the table
		 @PutMapping(path="/student",consumes= {"application/json"})
		 public Student saveOrUpdateStudent(@RequestBody Student stud){

			 repo.save(stud);
		
			 return stud;

		 }
		 
		 //Delete a student based on student-Id
		@SuppressWarnings("deprecation")
		@DeleteMapping("/student/{sId}")
		 public String deleteCustomer(@PathVariable int sId){
		
			 Student stu = repo.getOne(sId);
			 repo.delete(stu);

			 return "Student record deleted Successfully!!";

		 }
}

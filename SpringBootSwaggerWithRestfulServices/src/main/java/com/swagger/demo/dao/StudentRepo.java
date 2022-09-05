package com.swagger.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.swagger.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}

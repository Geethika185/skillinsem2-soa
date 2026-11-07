package com.klu.demo;
import org.springframework.web.bind.annotation.*;
import java.util.*;

	@RestController
	public class StudentController {

	    @GetMapping("/students")
	    public List<Student> getStudents() {

	        List<Student> students = new ArrayList<>();

	        students.add(new Student(101, "John"));
	        students.add(new Student(102, "Mary"));

	        return students;
	    }
	}


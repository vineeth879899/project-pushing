package com.major_project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.major_project.demo.modal.StudentDataEntity;
import com.major_project.demo.repositary.StudentRepositary;

@RestController
@RequestMapping("/student")  

public class StudentController {
	@Autowired
	private StudentRepositary studentRepositary;
	
	@RequestMapping(value = "/std",method = RequestMethod.POST)
	public StudentDataEntity getMethod() {
		StudentDataEntity studentDataEntity=new StudentDataEntity(1,"vineeth","dev",2,32);
		return studentDataEntity;
	}

}

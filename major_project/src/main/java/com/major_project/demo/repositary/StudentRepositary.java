package com.major_project.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major_project.demo.modal.StudentDataEntity;

public interface StudentRepositary extends JpaRepository<StudentDataEntity, Integer> {

}

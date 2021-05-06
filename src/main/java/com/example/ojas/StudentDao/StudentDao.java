package com.example.ojas.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ojas.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}

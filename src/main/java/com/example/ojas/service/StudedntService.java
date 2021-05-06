package com.example.ojas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.ojas.Student;
import com.example.ojas.StudentDao.StudentDao;
@Service
public class StudedntService {
	@Autowired
	public StudentDao studentdao;
	
	public Student addStudent(Student student) {
		return studentdao.save(student);
		 
	}
	public List<Student> getAllStudents(Integer pageNo, Integer pagesize){
		org.springframework.data.domain.Pageable paging = PageRequest.of(pageNo,pagesize);
		Page<Student> pageresult = studentdao.findAll(paging);
		if(pageresult.hasContent()) {
			return pageresult.getContent();
			
		}
		else
		{
			return new ArrayList<Student>();
		}
		
		
	}

}

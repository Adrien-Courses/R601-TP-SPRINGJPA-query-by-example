package fr.adriencaubel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adriencaubel.entity.Student;
import fr.adriencaubel.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> searchStudents() {
	        return null;
	}
}

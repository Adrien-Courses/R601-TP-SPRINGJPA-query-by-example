package fr.adriencaubel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adriencaubel.entity.Student;
import fr.adriencaubel.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired 
	private StudentService studentService;
	
	@GetMapping("/search")
    public List<Student> searchStudents(
    ) {
        return null;
    }
}

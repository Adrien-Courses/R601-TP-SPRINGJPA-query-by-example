package fr.adriencaubel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import fr.adriencaubel.entity.Student;
import fr.adriencaubel.entity.University;
import fr.adriencaubel.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> searchStudents(
	        String firstName,
	        String lastName,
	        String lastNameStartsWith,
	        Integer year,
	        String city,
	        String universityName
	    ) {
	        Student probe = new Student();
	        probe.setFirstName(firstName);
	        probe.setLastName(lastName);
	        probe.setYear(year);
	        probe.setCity(city);
	        
	        University university = new University();
	        university.setName(universityName);
	        probe.setUniversity(university);

	        ExampleMatcher matcher = ExampleMatcher.matching()
	            .withMatcher("lastName", m -> m.startsWith())
	            .withMatcher("university.name", m->m.startsWith());

	        Example<Student> example = Example.of(probe, matcher);
	        List<Student> results = studentRepository.findAll(example);


	        return results;
	    }
}

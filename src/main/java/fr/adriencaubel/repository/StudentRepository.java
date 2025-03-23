package fr.adriencaubel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adriencaubel.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

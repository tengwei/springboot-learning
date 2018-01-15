package org.tw.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tw.data.jpa.domain.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}

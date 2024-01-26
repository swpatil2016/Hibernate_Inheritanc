package com.swpatil.Database.Inheritance.SuperClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("sc_StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}

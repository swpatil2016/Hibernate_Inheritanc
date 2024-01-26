package com.swpatil.Database.Inheritance.JoinTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}

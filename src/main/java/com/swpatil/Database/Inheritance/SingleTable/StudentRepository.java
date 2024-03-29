package com.swpatil.Database.Inheritance.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Without this repository tables of models will not be created.
}

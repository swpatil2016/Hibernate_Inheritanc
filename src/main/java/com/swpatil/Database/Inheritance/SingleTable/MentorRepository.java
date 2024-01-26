package com.swpatil.Database.Inheritance.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_MentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
}

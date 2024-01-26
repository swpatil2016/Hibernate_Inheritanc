package com.swpatil.Database.Inheritance.Table_Per_Class;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaRepository extends JpaRepository<TA, Long> {
}
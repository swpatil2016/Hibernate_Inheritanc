package com.swpatil.Database.Inheritance.Table_Per_Class;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.swpatil.Database.Inheritance.Table_Per_Class;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_UserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}

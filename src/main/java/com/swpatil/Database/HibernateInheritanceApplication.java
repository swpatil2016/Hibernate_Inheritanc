package com.swpatil.Database;

import com.swpatil.Database.Inheritance.SingleTable.Student;
import com.swpatil.Database.Inheritance.SingleTable.StudentRepository;
import com.swpatil.Database.Inheritance.SuperClass.Mentor;
import com.swpatil.Database.Inheritance.SuperClass.MentorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateInheritanceApplication{
	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceApplication.class, args);
	}
}

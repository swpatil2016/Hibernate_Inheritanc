package com.swpatil.Database;

import com.swpatil.Database.Inheritance.SingleTable.Student;
import com.swpatil.Database.Inheritance.SingleTable.StudentRepository;
import com.swpatil.Database.Inheritance.SuperClass.Mentor;
import com.swpatil.Database.Inheritance.SuperClass.MentorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateInheritanceApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceApplication.class, args);
	}

	StudentRepository studentRepository;

	public HibernateInheritanceApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setBatch("oct11");
		student.setPsp(24.3);
		student.setId(40L);
		student.setName("Parth");
		student.setEmail("Parth@gmail.com");
		studentRepository.save(student);

	}
}

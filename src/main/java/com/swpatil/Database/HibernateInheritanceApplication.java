package com.swpatil.Database;

import com.swpatil.Database.Inheritance.SingleTable.Student;
import com.swpatil.Database.Inheritance.SingleTable.StudentRepository;
import com.swpatil.Database.Inheritance.SuperClass.Mentor;
import com.swpatil.Database.Inheritance.SuperClass.MentorRepository;
import com.swpatil.Database.Inheritance.Table_Per_Class.TA;
import com.swpatil.Database.Inheritance.Table_Per_Class.TaRepository;
import com.swpatil.Database.Inheritance.Table_Per_Class.User;
import com.swpatil.Database.Inheritance.Table_Per_Class.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateInheritanceApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceApplication.class, args);
	}

	TaRepository taRepository;
	UserRepository userRepository;

	public HibernateInheritanceApplication(TaRepository taRepository, UserRepository userRepository) {
		this.taRepository = taRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		TA ta = new TA();
		ta.setEmail("ta@gami.com");
		ta.setId(45L);
		ta.setName("Prabhas");
		ta.setEndTime("12.00");
		ta.setStartTime("1.00");

		taRepository.save(ta);

		User user= new User();
		user.setId(30L);
		user.setEmail("user@gamil.com");
		user.setName("user");

		userRepository.save(user);
	}
}


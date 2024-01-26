package com.swpatil.Database.Inheritance.JoinTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_student")
public class Student extends User {
    private String batch;
    private double psp;
}

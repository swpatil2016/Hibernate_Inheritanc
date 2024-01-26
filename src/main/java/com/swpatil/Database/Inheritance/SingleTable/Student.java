package com.swpatil.Database.Inheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_student")
public class Student extends User {
    private String batch;
    private double psp;
}

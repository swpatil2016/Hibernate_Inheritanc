package com.swpatil.Database.Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_student")
public class Student extends User {
    private String batch;
    private double psp;
}

package com.swpatil.Database.Inheritance.SuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends User{
    private String batch;
    private double psp;
}

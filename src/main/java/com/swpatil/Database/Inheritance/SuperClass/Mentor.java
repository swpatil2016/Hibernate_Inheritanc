package com.swpatil.Database.Inheritance.SuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mentor extends User{
    private Long salary;
}

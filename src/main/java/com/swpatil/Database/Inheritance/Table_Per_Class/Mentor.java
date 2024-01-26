package com.swpatil.Database.Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_mentor")
public class Mentor extends User {
    private Long salary;
}

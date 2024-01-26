package com.swpatil.Database.Inheritance.SuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TA extends User {
    private String startTime;
    private String endTime;

}

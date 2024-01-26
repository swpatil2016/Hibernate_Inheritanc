package com.swpatil.Database.Inheritance.JoinTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_ta")
public class TA extends User {
    private String startTime;
    private String endTime;

}

package com.swpatil.Database.Inheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_ta")
public class TA extends User {
    private String startTime;
    private String endTime;

}

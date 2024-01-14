package com.example.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String firstname;
    private String lastname;
    private String department;
    private Integer salary;

}

package com.example.simple_web_server;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    //List of employees
    @JsonProperty("Employees")
    private List<Employee> employeeList;

    //Constructor
    public Employees(){
        employeeList = new ArrayList<Employee>();
    }

    //Getter Method
    public List<Employee> getEmployeeList(){
        return employeeList;
    }
}

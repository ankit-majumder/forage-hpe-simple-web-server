package com.example.simple_web_server;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
    //initialize an employee list
    private static Employees employees = new Employees();

    //add employees for testing
    static{
        employees.getEmployeeList().add(new Employee("Ankit", "Majumder", "1", "am@gmail.com", "Software Engineering Intern"));
        employees.getEmployeeList().add(new Employee("Jake", "Smith", "2", "js@gmail.com", "Senior Web Developer"));
        employees.getEmployeeList().add(new Employee("Vince", "Parker", "3", "vp@gmail.com", "Vice President"));
    }

    public Employees getEmployees(){
        return employees;
    }
    public void addEmployee(Employee employee){
        employees.getEmployeeList().add(employee);
    }
}

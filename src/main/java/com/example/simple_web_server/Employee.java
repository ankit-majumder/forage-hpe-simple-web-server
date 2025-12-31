package com.example.simple_web_server;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "employee_id",
        "first_name",
        "last_name",
        "email",
        "title"
})

public class Employee {
    //Employee Fields
    private String first_name;
    private String last_name;
    private String employee_id;
    private String email;
    private String title;

    //Constructors
    public Employee(){}
    public Employee(String f, String l, String eid, String e, String t){
        this.first_name = f;
        this.last_name = l;
        this.employee_id = eid;
        this.email = e;
        this.title = t;
    }

    //Getter Methods
    @JsonProperty("first_name")
    public String getFirstName(){
        return this.first_name;
    }
    @JsonProperty("last_name")
    public String getLastName(){
        return this.last_name;
    }
    @JsonProperty("employee_id")
    public String getEmployeeId(){
        return this.employee_id;
    }
    public String getEmail(){
        return this.email;
    }
    public String getTitle(){
        return this.title;
    }


}

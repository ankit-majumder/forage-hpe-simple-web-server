package com.example.simple_web_server;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@JsonPropertyOrder({
        "employee_id",
        "first_name",
        "last_name",
        "email",
        "title"
})
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Employee {
    //Employee Fields
    private String firstName;
    private String lastName;
    private String employeeId;
    private String email;
    private String title;

    //Constructors
    public Employee(){}
    public Employee(String f, String l, String eid, String e, String t){
        this.firstName = f;
        this.lastName = l;
        this.employeeId = eid;
        this.email = e;
        this.title = t;
    }

    //Getter Methods
    @JsonProperty("first_name")
    public String getFirstName(){
        return this.firstName;
    }
    @JsonProperty("last_name")
    public String getLastName(){
        return this.lastName;
    }
    @JsonProperty("employee_id")
    public String getEmployeeId(){
        return this.employeeId;
    }
    public String getEmail(){
        return this.email;
    }
    public String getTitle(){
        return this.title;
    }


}

package com.springrest.rest.dao;

import org.springframework.stereotype.Repository;

import com.springrest.rest.model.Employee;
import com.springrest.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Dash", "Dasher", "dash@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Joker", "Phoenix", "batman@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Beckham", "Manunited@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}

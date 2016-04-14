package com.group4.controllers;

import com.group4.entities.Employee;
import com.group4.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */

@RestController
@CrossOrigin(origins = "http://localhost:9000")
//@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;


    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }


  @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public @ResponseBody List<Employee> getEmployeeList() {
        return employeeService.getAllEmployees();
    }


    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public @ResponseBody Employee getEmployeeById(@PathVariable("id")int id) {
        return employeeService.getEmployeeById(id);
    }


}

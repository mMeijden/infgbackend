package com.group4.services;

import com.group4.entities.CustomerOrder;
import com.group4.entities.Employee;
import com.group4.repository.CustomerOrderRepository;
import com.group4.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
@NoArgsConstructor
@AllArgsConstructor
@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired

    private CustomerOrderRepository customerOrderRepository;


    public List<Employee> getAllEmployees() {

        CustomerOrder co = customerOrderRepository.findById(1);
        System.out.println(co);
        return this.employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {


        return this.employeeRepository.findById(1);
    }

}
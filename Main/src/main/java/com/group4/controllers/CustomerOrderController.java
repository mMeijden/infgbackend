package com.group4.controllers;

import com.group4.entities.CustomerOrder;
import com.group4.services.CustomerOrderService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
@RestController
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@CrossOrigin(origins = "http://localhost:9000")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping(value = "/customerorders")
    public List<CustomerOrder> getAllCustomerOrders(){
        return customerOrderService.getAllCustomerOrders();
    }
}

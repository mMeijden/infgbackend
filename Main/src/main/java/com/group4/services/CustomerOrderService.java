package com.group4.services;

import com.group4.entities.CustomerOrder;
import com.group4.repository.BookingRepository;
import com.group4.repository.CustomerOrderRepository;
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
public class CustomerOrderService {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;



    public List<CustomerOrder> getAllCustomerOrders(){
        return customerOrderRepository.findAll();
    }


    public CustomerOrder getCustomerOrderById(int id) {
        return customerOrderRepository.findById(id);
    }

}

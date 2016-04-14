package com.group4.services;


import com.group4.entities.Booking;
import com.group4.entities.Customer;
import com.group4.entities.CustomerOrder;
import com.group4.entities.Travel;
import com.group4.repository.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
@NoArgsConstructor
@AllArgsConstructor
@Service
@Transactional
public class TravelService{

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TravelRepository travelRepository;

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @Autowired
    private OrderMethodRepository orderMethodRepository;

    @Autowired
    private OrderStatusRepository orderstatusRepository;

    @Autowired
    private CustomerRepository customerRepository;



    public void createTravel(Travel[] travels){

        Travel travel = travels[0];
    Booking booking = new Booking();
    booking.setCancellationInsurance("F");
    booking.setDate(Timestamp.valueOf(LocalDateTime.now()));
    booking.setPayed("F");
    booking.setTravel(travel);

    CustomerOrder customerOrder = new CustomerOrder();
    customerOrder.setOrderDate(Timestamp.valueOf(LocalDateTime.now()));

    customerOrder.setOrderMethod(orderMethodRepository.findOne(5));
    customerOrder.setOrderStatus(orderstatusRepository.findOne(1));

   // booking.setCustomerOrder(customerOrder);
    Customer customer = customerRepository.findById(1);


   // customer.setCustomerOrder(customerOrder);

    bookingRepository.save(booking);

    }

    public List<Travel> getAllTravels() {
        return this.travelRepository.findAll();
    }

    public Travel getTravelById(final int id){
        Travel travel = travelRepository.findOne(id);
        return travel;
    }
}
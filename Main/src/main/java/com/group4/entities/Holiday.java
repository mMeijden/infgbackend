package com.group4.entities;

import entities.rest.*;
import entities.rest.CustomerOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
@Getter
@Setter
@Builder
public class Holiday {


    private Booking booking;
    private List<Excursion> excursions;
    private Travel travel;
    private Hotel hotel;
    private CustomerOrder customerOrder;
    private Customer customer;




    public void collectInfo(int bookingId){

    }

}

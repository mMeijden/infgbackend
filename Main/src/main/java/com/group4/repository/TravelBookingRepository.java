package com.group4.repository;

import com.group4.entities.Employee;
import com.group4.entities.TravelBooking;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
public interface TravelBookingRepository extends JpaRepository<TravelBooking, Integer> {

   // TravelBooking findById(final int id);
}

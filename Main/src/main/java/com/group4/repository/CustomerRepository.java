package com.group4.repository;

import com.group4.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by @author Matthijs van der Meijden on 14-4-2016.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findById(final int id );
}

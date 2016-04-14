package com.group4.repository;

import com.group4.entities.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Integer>{

    CustomerOrder findById(final int id);
}

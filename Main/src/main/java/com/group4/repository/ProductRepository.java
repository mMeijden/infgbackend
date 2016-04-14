package com.group4.repository;

import com.group4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by @author Matthijs van der Meijden on 14-4-2016.
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {
}

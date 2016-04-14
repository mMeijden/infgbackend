package com.group4.services;

import com.group4.entities.CustomerOrder;
import com.group4.entities.Employee;
import com.group4.entities.Product;
import com.group4.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 14-4-2016.
 */
@NoArgsConstructor
@AllArgsConstructor
@Service
@Transactional
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return this.productRepository.findAll();
    }
}

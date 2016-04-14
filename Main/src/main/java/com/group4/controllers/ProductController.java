package com.group4.controllers;

import com.group4.entities.Employee;
import com.group4.entities.Product;
import com.group4.services.EmployeeService;
import com.group4.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 14-4-2016.
 */

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@CrossOrigin(origins = "http://localhost:9000")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Product> getEmployeeList() {
        return productService.getAllProducts();

    }
}


package com.group4.controllers;

import com.group4.entities.CustomerOrder;
import com.group4.entities.Travel;
import com.group4.entities.TravelBooking;
import com.group4.services.CustomerOrderService;
import com.group4.services.TravelService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
public class TravelController {


    @Autowired
    private TravelService travelService;

    @RequestMapping(value = "/travels")
    public List<Travel> getAllTravels(){
        return travelService.getAllTravels();
    }

    @RequestMapping(value = "/travels/{id}")
    public Travel getTravelById(@PathVariable("id")final int id){
        return travelService.getTravelById(id);
    }


    @RequestMapping(value = "/travels/post", method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody final Travel[] travel){
        travelService.createTravel(travel);
        return null;
    }

}


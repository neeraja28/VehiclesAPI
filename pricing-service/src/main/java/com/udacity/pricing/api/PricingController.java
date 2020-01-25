package com.udacity.pricing.api;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceList;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Implements a REST-based controller for the pricing service.
 */
@RestController
@RequestMapping("/services/price")
public class PricingController {

    /**
     * Gets the price for a requested vehicle.
     * @param vehicleId ID number of the vehicle for which the price is requested
     * @return price of the vehicle, or error that it was not found.
     */
    @GetMapping("/{vehicleId}")
    public ResponseEntity<Price> get(@PathVariable("vehicleId") Long vehicleId) throws PriceException {
        return new ResponseEntity<Price>(PricingService.getPrice(vehicleId), HttpStatus.OK);
    }

    /*
    * Get the price for all the vehicles
    */
    @GetMapping("/list")
    public ResponseEntity<PriceList> get() throws PriceException {
        return new ResponseEntity<PriceList>(PricingService.getPriceList(), HttpStatus.OK);
    }
}


package springboot.microservices.msscbrewery.web.controller;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.microservices.msscbrewery.web.model.CustomerDto;
import springboot.microservices.msscbrewery.web.services.CustomerService;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
**/

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
  
  private CustomerService customerService;
  
  public CustomerController(CustomerService customerService) {
    super();
    this.customerService = customerService;
  }



  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){
    return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    
  }
  
  

}

package springboot.microservices.msscbrewery.web.services;

import java.util.UUID;
import springboot.microservices.msscbrewery.web.model.CustomerDto;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
**/

public interface CustomerService {

  CustomerDto getCustomerById(UUID customerId);
  

}

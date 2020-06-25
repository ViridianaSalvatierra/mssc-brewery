package springboot.microservices.msscbrewery.web.services.imp;

import java.util.UUID;
import org.springframework.stereotype.Service;
import springboot.microservices.msscbrewery.web.model.CustomerDto;
import springboot.microservices.msscbrewery.web.services.CustomerService;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
 **/

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID customerId) {

    return CustomerDto.builder().id(UUID.randomUUID()).name("Joe Buck").build();
  }

}

package springboot.microservices.msscbrewery.web.services;

import java.util.UUID;
import springboot.microservices.msscbrewery.web.model.BeerDto;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
**/

public interface BeerService {

  BeerDto getBeerById(UUID beerId);

  BeerDto saveNewBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);
  
  

}

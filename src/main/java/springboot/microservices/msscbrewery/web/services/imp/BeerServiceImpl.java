package springboot.microservices.msscbrewery.web.services.imp;

import java.util.UUID;
import org.springframework.stereotype.Service;
import springboot.microservices.msscbrewery.web.model.BeerDto;
import springboot.microservices.msscbrewery.web.services.BeerService;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
**/

@Service
public class BeerServiceImpl implements BeerService{

  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder().id(UUID.randomUUID())
        .beerName("GalaxyCat")
        .beerStyle("Pale Ale")
        .build();
  }

  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder().id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    // TODO Auto-generated method stub
    
  }

}

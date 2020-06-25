package springboot.microservices.msscbrewery.web.controller;

import java.util.UUID;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.microservices.msscbrewery.web.model.BeerDto;
import springboot.microservices.msscbrewery.web.services.BeerService;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
**/

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
  
  private final BeerService beerService;
  
  public BeerController(BeerService beerService) {
    super();
    this.beerService = beerService;
  }



  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
    return new ResponseEntity<> (beerService.getBeerById(beerId), HttpStatus.OK);
    
  }
  
  @PostMapping
  public ResponseEntity handlePost(BeerDto beerDto) {
    BeerDto savedDto = beerService.saveNewBeer(beerDto);
    HttpHeaders headers = new HttpHeaders();
    headers.add("location", "/api/v1/beer/" + savedDto.getId().toString());
    return new ResponseEntity(headers, HttpStatus.CREATED);
  }
  
  @PutMapping("/{beerId}")
  public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, BeerDto beerDto) {
    
    beerService.updateBeer(beerId,beerDto);
    
    return new ResponseEntity(HttpStatus.NO_CONTENT);
    
  }

}

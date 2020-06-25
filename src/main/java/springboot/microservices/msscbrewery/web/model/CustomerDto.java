package springboot.microservices.msscbrewery.web.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Viridiana Salvatierra.
 * 
 * SpringBoot Microservices Course.
 * 
**/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

  private UUID id;
  private String name;
  
}

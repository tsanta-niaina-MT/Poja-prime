package com.t.base.endpoint.rest.controller;

import com.t.base.service.event.PrimeService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class PrimeController {
  private final PrimeService service;

  @GetMapping("/new-prime")
  public String getPrime() {
    return service.newPrime();
  }

  @GetMapping("/generated-primes")
  public List<String> getGenerated() {
    return service.generatedPrimes();
  }
}

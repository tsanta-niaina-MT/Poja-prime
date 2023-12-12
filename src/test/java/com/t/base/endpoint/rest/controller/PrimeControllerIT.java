package com.t.base.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.t.base.conf.FacadeIT;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {
  @Autowired PrimeController controller;

  @Test
  public void probably_prime() {
    String number = controller.getPrime();
    assertTrue(new BigInteger(number).isProbablePrime(100));
  }

  @Test
  public void get_generated_primes() {
    List<String> primes = controller.getGenerated();
    assertTrue(10 >= primes.size());
  }
}

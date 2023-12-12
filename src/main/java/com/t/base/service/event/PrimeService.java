package com.t.base.service.event;

import com.t.base.repository.PrimeRepository;
import com.t.base.repository.model.Prime;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimeService {
  private PrimeRepository repository;

  public static BigInteger createPrime() {
    final int BIT_LENGTH = 100;
    return BigInteger.probablePrime(BIT_LENGTH, new Random());
  }

  public String newPrime() {
    final Prime prime= new Prime();
    final String value = createPrime().toString();
    prime.setValue(value);
    prime.setCreationDatetime(LocalDateTime.now());
    repository.save(prime);
    return value;
  }

  public List<String> generatedPrimes() {
    return repository.findFirst10ByOrderByCreationDatetimeDesc().stream()
        .map(Prime::getValue)
        .toList();
  }
}

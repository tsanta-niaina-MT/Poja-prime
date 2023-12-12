package com.t.base.repository;

import com.t.base.repository.model.Prime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimeRepository extends JpaRepository<Prime, Integer> {
  List<Prime> findFirst10ByOrderByCreationDatetimeDesc();
}

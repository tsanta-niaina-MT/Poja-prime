package com.t.base.repository.model;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Prime {
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column private String value;
  @Column private LocalDateTime creationDatetime;
}

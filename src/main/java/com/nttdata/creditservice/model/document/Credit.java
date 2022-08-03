package com.nttdata.creditservice.model.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import reactor.core.publisher.Flux;

/**
 * Class for Credit.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "credits")
public class Credit {

  @Id
  private String creditId;

  private String clientId;
  private String type;
  private String maintenance;
  private String amountLimit;
  private String payDate;
  private Flux<Transaction> transactions;

}

package com.nttdata.creditservice.model.service;


import com.nttdata.creditservice.model.document.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Class for CreditService.
 */
public interface CreditService {
  Flux<Credit> getAll();

  Mono<Credit> save(Credit credit);

  Mono<Credit> findById(String id);

  Mono<Boolean> existsById(String id);

  Mono<Credit> update(Credit credit);

  void delete(String id);
}

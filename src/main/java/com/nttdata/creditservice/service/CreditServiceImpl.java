package com.nttdata.creditservice.service;

import com.nttdata.creditservice.model.document.Credit;
import com.nttdata.creditservice.model.repository.CreditRepository;
import com.nttdata.creditservice.model.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Class for CreditServiceImpl.
 */
@Service
public class CreditServiceImpl implements CreditService {
  @Autowired
  private CreditRepository creditRepository;

  @Override
  public Flux<Credit> getAll() {
    return this.creditRepository.findAll();
  }

  @Override
  public Mono<Credit> save(Credit credit) {
    return this.creditRepository.save(credit);
  }

  @Override
  public Mono<Credit> findById(String id) {
    return this.creditRepository.findById(id);
  }

  @Override
  public Mono<Boolean> existsById(String id) {
    return this.creditRepository.existsById(id);
  }

  @Override
  public Mono<Credit> update(Credit credit) {
    return this.creditRepository.save(credit);
  }

  @Override
  public void delete(String id) {
    this.creditRepository.deleteById(id);
  }
}

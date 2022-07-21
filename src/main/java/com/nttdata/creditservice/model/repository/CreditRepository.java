package com.nttdata.creditservice.model.repository;

import com.nttdata.creditservice.model.document.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {
}

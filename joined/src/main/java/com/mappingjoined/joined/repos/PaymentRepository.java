package com.mappingjoined.joined.repos;

import com.mappingjoined.joined.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}

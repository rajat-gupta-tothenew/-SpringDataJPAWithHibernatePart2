package com.mappingtableperclass.tableperclass.repos;

import com.mappingtableperclass.tableperclass.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}

package com.interfacemapping.MappingUdemy.repos;

import com.interfacemapping.MappingUdemy.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment , Integer> {

}

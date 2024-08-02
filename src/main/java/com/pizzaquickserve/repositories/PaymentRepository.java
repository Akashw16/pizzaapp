package com.pizzaquickserve.repositories;

import com.pizzaquickserve.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

package ru.pirozhkov.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pirozhkov.crm.entities.Payment;
import ru.pirozhkov.crm.entities.Product;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

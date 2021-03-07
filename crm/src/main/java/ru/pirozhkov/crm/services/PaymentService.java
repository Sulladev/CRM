package ru.pirozhkov.crm.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pirozhkov.crm.entities.Payment;
import ru.pirozhkov.crm.entities.Product;
import ru.pirozhkov.crm.repositories.PaymentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PaymentService   {

    private PaymentRepository paymentRepository;

    public Optional<Payment> findById(Long id) {
        return paymentRepository.findById(id);
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public void deleteById(Long id) {
        paymentRepository.deleteById(id);
    }

    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

}

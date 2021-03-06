package ru.pirozhkov.crm.services;

import ru.pirozhkov.crm.entities.Customer;
import ru.pirozhkov.crm.entities.Product;
import ru.pirozhkov.crm.repositories.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer addProduct(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer update(Customer customer) {
        customerRepository.save(customer);
        return customerRepository.getOne(customer.getId());
    }
}

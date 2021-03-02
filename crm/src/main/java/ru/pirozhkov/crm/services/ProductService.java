package ru.pirozhkov.crm.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import ru.pirozhkov.crm.entities.Product;
import ru.pirozhkov.crm.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product update(Product product) {
        productRepository.save(product);
        return productRepository.getOne(product.getId());
    }
}

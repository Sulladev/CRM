package ru.pirozhkov.crm.data;

import com.sun.istack.NotNull;
import ru.pirozhkov.crm.entities.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

public class ProductData {

    private Long id;

    private String name;

    private BigDecimal price;

    private Customer customer;

    public ProductData() {
    }

    public ProductData(Long id, String name, BigDecimal price, Customer customer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ProductData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}

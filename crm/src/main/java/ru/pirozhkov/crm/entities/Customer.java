package ru.pirozhkov.crm.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(length = 32, name = "first_name")
    private String firstName;

    @Column(length = 32, name = "last_name")
    private String lastName;

    @Column(length = 32, name = "email")
    private String email;

    @Column(length = 128, nullable = false)
    private String password;

    @OneToMany(mappedBy = "customers")
    private List<Product> productList = new ArrayList<>();

    @OneToMany(mappedBy = "customers")
    private List<Contract> contractList = new ArrayList<>();

    @OneToMany(mappedBy = "customers")
    private List<Payment> paymentList = new ArrayList<>();

    public Customer(Long id, String name, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}

package ru.pirozhkov.crm.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "payments")
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "status", length = 32)
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}

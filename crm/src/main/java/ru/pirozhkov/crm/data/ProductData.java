package ru.pirozhkov.crm.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.pirozhkov.crm.entities.Customer;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductData {

    private Long id;

    private String name;

    private BigDecimal price;

    private Customer customer;
}

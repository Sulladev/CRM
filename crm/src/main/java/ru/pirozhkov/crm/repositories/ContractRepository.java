package ru.pirozhkov.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pirozhkov.crm.entities.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
}

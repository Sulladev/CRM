package ru.pirozhkov.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pirozhkov.crm.entities.Role;
import ru.pirozhkov.crm.repositories.RoleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public void save(Role role) {
        roleRepository.save(role);
    }


    public List<Role> findAll() {
        return roleRepository.findAll();
    }


    public Optional<Role> findById(Long id) {
        return roleRepository.findById(id);
    }


    public void delete(Long id) {
        roleRepository.deleteById(id);
    }
}

package ru.pirozhkov.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pirozhkov.crm.data.UserData;
import ru.pirozhkov.crm.entities.User;
import ru.pirozhkov.crm.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();

    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(UserData userData) {
        User user = new User();
        user.setId(userData.getId());
        user.setName(userData.getName());
        user.setFirstName(userData.getFirstName());
        user.setLastName(userData.getLastName());
        user.setPassword(user.getPassword());
        user.setRoles(userData.getRoles());
        user.setContractList(userData.getContractList());
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}

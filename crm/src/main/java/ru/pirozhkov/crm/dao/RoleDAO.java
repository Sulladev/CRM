package ru.pirozhkov.crm.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.pirozhkov.crm.entities.Role;
import ru.pirozhkov.crm.mapper.RoleMapper;

import java.util.List;

@RequiredArgsConstructor
public class RoleDAO {

    private final JdbcTemplate jdbcTemplate;

    public List<Role> getAll() {
        return jdbcTemplate.query("SELECT * FROM Roles", new RoleMapper());
    }

    public Role getRoleById(int id) {
        return jdbcTemplate.query("SELECT * FROM Roles WHERE id=?", new Object[]{id}, new RoleMapper())
                .stream().findAny().orElse(null);
    }

}

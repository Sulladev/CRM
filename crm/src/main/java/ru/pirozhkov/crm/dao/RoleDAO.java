package ru.pirozhkov.crm.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.pirozhkov.crm.entities.Role;
import ru.pirozhkov.crm.mapper.RoleMapper;

import java.util.List;

@RequiredArgsConstructor
@Component
public class RoleDAO {

    private final JdbcTemplate jdbcTemplate;
    private final RoleMapper roleMapper;

    public List<Role> getAll() {
        return jdbcTemplate.query("SELECT * FROM Roles", roleMapper);
    }

    public Role getRoleById(int id) {
        return jdbcTemplate.query("SELECT * FROM Roles WHERE id=?", new Object[]{id}, roleMapper)
                .stream().findAny().orElse(null);
    }

}

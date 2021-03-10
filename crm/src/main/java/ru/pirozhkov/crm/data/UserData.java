package ru.pirozhkov.crm.data;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;
import ru.pirozhkov.crm.entities.Contract;
import ru.pirozhkov.crm.entities.Role;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@ToString
public class UserData {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    private Set<Role> roles;

    private List<Contract> contractList = new ArrayList<>();

    private String firstName;

    private String lastName;

}

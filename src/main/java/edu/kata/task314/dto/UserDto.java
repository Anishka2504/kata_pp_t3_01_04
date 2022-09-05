package edu.kata.task314.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
public class UserDto{

    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String login;

    @NotNull
    private String password;

    private String lastName;

    private String middleName;

    private Set<RoleDto> roles;

    public String roleList() {
        StringBuilder rolesString = new StringBuilder();
        roles.forEach(item -> rolesString.append(item.getName().toLowerCase()).append(", "));
        rolesString.setLength(rolesString.length() - 2);
        return rolesString.toString();
    }
}

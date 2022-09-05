package edu.kata.task314.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RoleDto {

    private Long id;

    @NotNull
    private String name;
}

package com.italo.users.dto.response;

import com.italo.users.entity.User;

public class UserResponseDTO {

    private Long id;

    private String name;

    private String cpf;

    private Integer age;
    public UserResponseDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.age = user.getAge();
    }

}

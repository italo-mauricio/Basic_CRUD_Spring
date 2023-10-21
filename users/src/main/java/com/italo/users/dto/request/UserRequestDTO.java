package com.italo.users.dto.request;

import com.italo.users.dto.response.UserResponseDTO;
import com.italo.users.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
    private String name;
    private String cpf;
    private Integer age;

}

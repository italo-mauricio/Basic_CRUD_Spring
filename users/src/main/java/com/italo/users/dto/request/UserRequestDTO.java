package com.italo.users.dto.request;

import lombok.Getter;

@Getter
public class UserRequestDTO {
    private String name;
    private String cpf;
    private Integer age;
    private String address;
    private String sex;
}

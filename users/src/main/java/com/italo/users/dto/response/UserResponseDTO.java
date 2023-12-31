package com.italo.users.dto.response;

import com.italo.users.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private Long id;
    private String name;
    private String cpf;
    private Integer age;
    private String address;
    private String sex;
    public UserResponseDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.age = user.getAge();
        this.address = user.getAddress();
        this.sex = user.getSex();
    }

}

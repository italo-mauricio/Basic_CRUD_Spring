package com.italo.users.util;

import com.italo.users.dto.request.UserRequestDTO;
import com.italo.users.dto.response.UserResponseDTO;
import com.italo.users.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public User toUser(UserRequestDTO userDTO){
        return User.builder()
                .name(userDTO.getName())
                .cpf(userDTO.getCpf())
                .age(userDTO.getAge())
                .build();
    }

    public UserResponseDTO toUserDTO(User user){
        return new UserResponseDTO(user);
    }

    public List<UserResponseDTO> toUserDTO(List<User> userList){
        return userList.stream().map(UserResponseDTO::new).collect(Collectors.toList());
    }
}

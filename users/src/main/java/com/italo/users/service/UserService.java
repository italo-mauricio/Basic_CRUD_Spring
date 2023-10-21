package com.italo.users.service;

import com.italo.users.dto.request.UserRequestDTO;
import com.italo.users.dto.response.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO findById(Long id);

    List<UserResponseDTO> findAll();

    UserResponseDTO register(UserRequestDTO userDTO);

    UserResponseDTO update(UserRequestDTO userDTO, Long id);
    String delete(Long id);
}

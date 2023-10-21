package com.italo.users.service;
import com.italo.users.dto.request.UserRequestDTO;
import com.italo.users.dto.response.UserResponseDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    @Override
    public UserResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDTO> findAll() {
        return null;
    }

    @Override
    public UserResponseDTO register(UserRequestDTO userDTO) {
        return null;
    }

    @Override
    public UserResponseDTO update(UserRequestDTO userDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}

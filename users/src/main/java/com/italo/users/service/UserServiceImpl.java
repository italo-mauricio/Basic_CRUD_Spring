package com.italo.users.service;
import com.italo.users.dto.request.UserRequestDTO;
import com.italo.users.dto.response.UserResponseDTO;
import com.italo.users.entity.User;
import com.italo.users.repository.UserRepository;
import com.italo.users.util.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public UserResponseDTO findById(Long id) {
       User userSystem = returnUser(id);
       return userMapper.toUserDTO(userSystem);
    }

    @Override
    public List<UserResponseDTO> findAll() {
        List<User> usersList = userRepository.findAll();

    }

    @Override
    public UserResponseDTO register(UserRequestDTO userDTO) {
        return null;
    }

    @Override
    public UserResponseDTO update(UserRequestDTO userDTO, Long id) {
        User userSystem = returnUser(id);
    }

    @Override
    public String delete(Long id) {
        return null;
    }

    private User returnUser(Long id){
       return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
    }
}

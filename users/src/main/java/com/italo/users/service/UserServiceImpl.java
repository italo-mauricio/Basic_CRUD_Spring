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
       return userMapper.toUserDTO(returnUser(id));
    }

    @Override
    public List<UserResponseDTO> findAll() {
        return userMapper.toPeoplesDTO(userRepository.findAll());
    }

    @Override
    public UserResponseDTO register(UserRequestDTO userDTO) {
        User user = userMapper.toUser(userDTO);
        return userMapper.toUserDTO(userRepository.save(user));
    }

    @Override
    public UserResponseDTO update(UserRequestDTO userDTO, Long id) {
        User userSystem = returnUser(id);
        userMapper.updateUserData(userSystem, userDTO);
        return userMapper.toUserDTO(userRepository.save(userSystem));
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "User id:" + id + " deleted";
    }

    private User returnUser(Long id){
       return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
    }
}

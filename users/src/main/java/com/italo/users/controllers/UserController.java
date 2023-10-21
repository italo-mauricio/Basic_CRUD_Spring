package com.italo.users.controllers;

import com.italo.users.dto.request.UserRequestDTO;
import com.italo.users.dto.response.UserResponseDTO;
import com.italo.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping(value = "/{id}")
    private ResponseEntity<UserResponseDTO> findById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(userService.findById(id));
    }
    @GetMapping
    private ResponseEntity<List<UserResponseDTO>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }
    @PostMapping
    private ResponseEntity<UserResponseDTO> register(@RequestBody UserRequestDTO userRequestDTO, UriComponentsBuilder uriBUilder){
        UserResponseDTO userResponseDTO = userService.register(userRequestDTO);
        URI uri = uriBUilder.path("/user/{id}").buildAndExpand(userResponseDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(userResponseDTO);
    }
}

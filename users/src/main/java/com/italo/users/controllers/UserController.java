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
    public ResponseEntity<UserResponseDTO> findById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(userService.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }
    @PostMapping
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserRequestDTO userRequestDTO, UriComponentsBuilder uriBUilder){
        UserResponseDTO userResponseDTO = userService.register(userRequestDTO);
        URI uri = uriBUilder.path("/user/{id}").buildAndExpand(userResponseDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(userResponseDTO);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<UserResponseDTO> update(@RequestBody UserRequestDTO userDTO, @PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(userService.update(userDTO, id));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(userService.delete(id));
    }
}

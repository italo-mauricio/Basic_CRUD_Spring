package com.italo.users.controllers;

import com.italo.users.dto.response.UserResponseDTO;
import com.italo.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping
    private ResponseEntity<UserResponseDTO> findById(@PathVariable Long id){

        return ResponseEntity.ok().body(userService.findById(id));
    }
}

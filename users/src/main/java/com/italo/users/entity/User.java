package com.italo.users.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name= "address", nullable = false, unique = true)
    private String address;
    @Column(name = "sex", nullable = false)
    private String sex;

    @Builder
    public User(String name, String cpf, Integer age, String address, String sex) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

}

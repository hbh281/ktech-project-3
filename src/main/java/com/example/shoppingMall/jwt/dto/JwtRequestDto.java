package com.example.shoppingMall.jwt.dto;


import lombok.Data;

@Data
public class JwtRequestDto {
    private String username;
    private String password;
}
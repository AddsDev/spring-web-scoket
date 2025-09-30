package com.aruiz.infraestructure.service.dto;

public record LookupResponse(String tel, String nombre, String direccion, String ciudad, boolean found, String message) {}

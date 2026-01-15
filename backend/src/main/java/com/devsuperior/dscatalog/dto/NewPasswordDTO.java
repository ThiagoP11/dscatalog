package com.devsuperior.dscatalog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class NewPasswordDTO {

    @NotBlank(message = "Campo Obrigatório")
    private String token;

    @NotBlank(message = "Campo Obrigatório")
    @Size(min = 8, message = "Deve ter no mínimo 8 caracteres")
    private String password;

    public NewPasswordDTO() {
    }

    public NewPasswordDTO(String token, String pasword) {
        this.token = token;
        this.password = pasword;
    }

    public String getToken() {
        return token;
    }

    public String getPassword() {
        return password;
    }
}

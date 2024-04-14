package br.com.fiap.academia.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoginRequest {
    @Email(message = "O atributo email deve ser um endereço de e-mail válido")
    @NotBlank(message = "O atributo email é obrigatório")
    @NotNull(message = "O atributo email é obrigatório")
    private String email;

    @NotBlank(message = "O atributo senha é obrigatório")
    @NotNull(message = "O atributo senha é obrigatório")
    private String senha;

    public LoginRequest(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}

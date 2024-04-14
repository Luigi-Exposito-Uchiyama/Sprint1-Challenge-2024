package br.com.fiap.academia.dto.response;

public record CadastroResponse(
        Long id,
        String nome,
        String email,
        int idade
) {}

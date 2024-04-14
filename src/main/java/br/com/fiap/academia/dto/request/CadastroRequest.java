package br.com.fiap.academia.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CadastroRequest {
        @NotBlank(message = "O atributo nome é obrigatório")
        @NotNull(message = "O atributo nome é obrigatório")
        private String nome;

        @Email(message = "O atributo email deve ser um endereço de e-mail válido")
        @NotBlank(message = "O atributo email é obrigatório")
        @NotNull(message = "O atributo email é obrigatório")
        private String email;

        @NotBlank(message = "O atributo senha é obrigatório")
        @NotNull(message = "O atributo senha é obrigatório")
        private String senha;

        @NotNull(message = "O atributo idade é obrigatório")
        private Integer idade;


        public String getNome() {
                return nome;
        }

        public String getEmail() {
                return email;
        }

        public String getSenha() {
                return senha;
        }

        public Integer getIdade() {
                return idade;
        }
}

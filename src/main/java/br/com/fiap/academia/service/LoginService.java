package br.com.fiap.academia.service;

import br.com.fiap.academia.dto.request.LoginRequest;
import br.com.fiap.academia.dto.response.LoginResponse;
import br.com.fiap.academia.entity.Login;
import br.com.fiap.academia.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public LoginResponse autenticar(LoginRequest request) {
        Login usuario = loginRepository.findByEmailAndSenha(request.getEmail(), request.getSenha());
        if (usuario != null) {
            return new LoginResponse(usuario.getEmail());
        } else {
            return null;
        }
    }

    public LoginResponse getPerfil(String email, String senha) {
        Login usuario = loginRepository.findByEmailAndSenha(email, senha);
        if (usuario != null) {
            return new LoginResponse(usuario.getEmail());
        } else {
            return null;
        }
    }
}

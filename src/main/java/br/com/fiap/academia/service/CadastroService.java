package br.com.fiap.academia.service;

import br.com.fiap.academia.dto.request.CadastroRequest;
import br.com.fiap.academia.dto.response.CadastroResponse;
import br.com.fiap.academia.entity.Cadastro;
import br.com.fiap.academia.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public CadastroResponse cadastrar(CadastroRequest request) {
        Cadastro cadastro = new Cadastro();
        cadastro.setNome(request.getNome());
        cadastro.setIdade(request.getIdade());

        String email = request.getEmail();

        Cadastro savedCadastro = cadastroRepository.save(cadastro);
        if (savedCadastro != null) {
            return new CadastroResponse(savedCadastro.getId(), savedCadastro.getNome(), email, savedCadastro.getIdade());
        } else {
            return null;
        }
    }

    public CadastroResponse getPerfil(Long id) {
        Cadastro cadastro = cadastroRepository.findById(id).orElse(null);
        if (cadastro != null) {
            return new CadastroResponse(cadastro.getId(), cadastro.getNome(), cadastro.getEmail(), cadastro.getIdade());
        } else {
            return null;
        }
    }
}

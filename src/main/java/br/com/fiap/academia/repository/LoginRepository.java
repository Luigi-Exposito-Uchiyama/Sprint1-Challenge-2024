package br.com.fiap.academia.repository;

import br.com.fiap.academia.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByEmailAndSenha(String email, String senha);
}

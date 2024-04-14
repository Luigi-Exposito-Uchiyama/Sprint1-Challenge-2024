package br.com.fiap.academia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_CADASTRO")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CADASTRO")
    @SequenceGenerator(name = "SQ_CADASTRO", sequenceName = "SQ_CADASTRO", allocationSize = 1)
    @Column(name = "ID_CADASTRO")
    private Long id;

    private String nome;

    private int idade;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_LOGIN", referencedColumnName = "ID_LOGIN")
    private Login login;


    public String getEmail() {
        if (login != null) {
            return login.getEmail();
        } else {
            return null;
        }
    }
}

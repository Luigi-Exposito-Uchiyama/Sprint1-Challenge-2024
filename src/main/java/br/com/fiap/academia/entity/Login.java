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
@Table(name = "TB_LOGIN")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_LOGIN")
    @SequenceGenerator(name = "SQ_LOGIN", sequenceName = "SQ_LOGIN", allocationSize = 1)
    @Column(name = "ID_LOGIN")
    private Long id;

    private String email;

    private String senha;

}

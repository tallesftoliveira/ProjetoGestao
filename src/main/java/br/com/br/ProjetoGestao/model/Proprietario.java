package br.com.br.ProjetoGestao.model;

import com.sun.jdi.CharValue;
import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table (name = "hte_tbl_proprietarios")

public class Proprietario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "PROPRIETARIO_SEQ"
    )

    @SequenceGenerator(
            name= "PROPRIETARIO_SEQ",
            sequenceName = "PROPRIETARIO_SEQ",
            allocationSize = 50

    )
    private Long id;
    private String nome;
    private String endereco;
    private Long cpf;
    private String email;


    public Proprietario(Long id, String nome, String endereco, Long cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proprietario that = (Proprietario) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(endereco, that.endereco) && Objects.equals(cpf, that.cpf) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, cpf, email);
    }
}

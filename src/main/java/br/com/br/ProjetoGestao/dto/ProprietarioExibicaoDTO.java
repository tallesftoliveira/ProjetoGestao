package br.com.br.ProjetoGestao.dto;

import br.com.br.ProjetoGestao.controller.ProprietarioController;
import br.com.br.ProjetoGestao.model.Proprietario;
import com.sun.jdi.CharValue;

public record ProprietarioExibicaoDTO(Long id, String nome, String endereco, CharValue cpf, String email) {}

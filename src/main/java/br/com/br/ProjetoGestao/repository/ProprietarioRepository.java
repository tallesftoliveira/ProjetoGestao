package br.com.br.ProjetoGestao.repository;

import br.com.br.ProjetoGestao.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietarioRepository extends JpaRepository<Proprietario,Long> {
}


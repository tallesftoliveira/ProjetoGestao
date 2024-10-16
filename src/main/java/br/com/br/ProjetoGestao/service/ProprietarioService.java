package br.com.br.ProjetoGestao.service;

import br.com.br.ProjetoGestao.model.Proprietario;
import br.com.br.ProjetoGestao.repository.ProprietarioRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProprietarioService {

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public Proprietario salvarProprietario(Proprietario proprietario){
        return proprietarioRepository.save(proprietario);
    }

    public Proprietario buscarPorId(Long id){
        Optional<Proprietario> proprietarioOptional = proprietarioRepository.findById(id);

        if (proprietarioOptional.isPresent()){
            return proprietarioOptional.get();
        } else {
            throw new RuntimeException("Proprietário não existe!");
        }
    }

    public List<Proprietario> listarTodos(){
        return proprietarioRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Proprietario> proprietarioOptional = proprietarioRepository.findById(id);

        if (proprietarioOptional.isPresent()){
            proprietarioRepository.delete(proprietarioOptional.get());
        } else {
            throw new RuntimeException("Proprietário não encontrado!");
        }
    }

    public Proprietario atualizar(@NotNull Proprietario proprietario){
        Optional<Proprietario> proprietarioOptional = proprietarioRepository.findById(proprietario.getId());


        if (proprietarioOptional.isPresent()){
            return proprietarioRepository.save(proprietario);
        } else {
            throw new RuntimeException("Proprietário não encontrado!");
        }
    }

}
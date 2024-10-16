package br.com.br.ProjetoGestao.controller;

import br.com.br.ProjetoGestao.model.Proprietario;
import br.com.br.ProjetoGestao.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class  ProprietarioController {

    @Autowired
    private ProprietarioService proprietarioService;

    @PostMapping("/proprietario")
    @ResponseStatus(HttpStatus.CREATED)
    public Proprietario salvar(@RequestBody Proprietario proprietario) {
        return proprietarioService.salvarProprietario(proprietario);
    }

    @GetMapping("/proprietario")
    @ResponseStatus(HttpStatus.OK)
    public List<Proprietario> litarTodos(){
        return proprietarioService.listarTodos();
    }

    @GetMapping("/proprietario/{proprietarioId}")
    public Proprietario buscarPorId(@PathVariable Long proprietarioId){
        return proprietarioService.buscarPorId(proprietarioId);
    }

    @DeleteMapping("/proprietario/{proprietario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long proprietarioId){
        proprietarioService.excluir(proprietarioId);
    }

    @PutMapping("/proprietario")
    @ResponseStatus(HttpStatus.OK)
    public Proprietario atualizar(@RequestBody Proprietario proprietario){
        return proprietarioService.atualizar(proprietario);
    }
}

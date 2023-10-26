package fixacao.net.api.controller;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Escola;
import fixacao.net.api.service.CursoService;
import fixacao.net.api.service.EscolaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/escola")
public class EscolaController {

    private EscolaService escolaService;

    @GetMapping("/{id}")
    public Escola buscarUm(@PathVariable Long id){
        return escolaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Escola> buscarTodos(){
        return escolaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id){
        escolaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

    @PutMapping
    public void atualizar(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }
}

package fixacao.net.api.controller;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Disciplina;
import fixacao.net.api.service.CursoService;
import fixacao.net.api.service.DisciplinaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Long id){
        return disciplinaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id){
        disciplinaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

    @PutMapping
    public void atualizar(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }
}

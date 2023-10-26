package fixacao.net.api.controller;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Turma;
import fixacao.net.api.service.CursoService;
import fixacao.net.api.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/turma")
public class TurmaController {

    private TurmaService turmaService;

    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Long id){
        return turmaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Turma> buscarTodos(){
        return turmaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id){
        turmaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }
}

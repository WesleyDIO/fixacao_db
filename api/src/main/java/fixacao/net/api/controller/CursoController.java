package fixacao.net.api.controller;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Diretor;
import fixacao.net.api.model.Usuario;
import fixacao.net.api.service.CursoService;
import fixacao.net.api.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService;

    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Long id){
        return cursoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id){
        cursoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

    @PutMapping
    public void atualizar(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }
}

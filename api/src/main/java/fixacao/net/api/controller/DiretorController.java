package fixacao.net.api.controller;

import fixacao.net.api.model.Diretor;
import fixacao.net.api.model.Professor;
import fixacao.net.api.model.Usuario;
import fixacao.net.api.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/diretor")
public class DiretorController {

    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Usuario buscarUm(@PathVariable Long id){
        return usuarioService.buscarUm(id);
    }

    @GetMapping
    public Collection<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id){
        usuarioService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Diretor diretor){
        usuarioService.salvar(diretor);
    }

    @PutMapping
    public void atualizar(@RequestBody Diretor diretor){
        usuarioService.salvar(diretor);
    }
}

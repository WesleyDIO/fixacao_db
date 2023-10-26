package fixacao.net.api.controller;

import fixacao.net.api.model.Endereco;
import fixacao.net.api.service.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private EnderecoService enderecoService;

    @GetMapping("/{id}")
    public Endereco buscarUm(@PathVariable Long id){
        return enderecoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Endereco> buscarTodos(){
        return enderecoService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Long id){
        enderecoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Endereco endereco){
      enderecoService.salvar(endereco);
    }

    @PutMapping
    public void atualizar(@RequestBody Endereco endereco){
        enderecoService.salvar(endereco);
    }
}

package fixacao.net.api.service;

import fixacao.net.api.model.Disciplina;
import fixacao.net.api.model.Endereco;
import fixacao.net.api.repository.DisciplinaRepository;
import fixacao.net.api.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public Collection<Endereco> buscarTodos(){
        return enderecoRepository.findAll();
    }


    public void deletar( Long id){
        enderecoRepository.deleteById(id);
    }


    public void salvar(Endereco endereco){
        enderecoRepository.save(endereco);
    }

    public Endereco buscarUm(Long id) {
        return enderecoRepository.findById(id).get();
    }
}

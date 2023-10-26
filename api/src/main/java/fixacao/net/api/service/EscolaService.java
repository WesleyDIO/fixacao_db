package fixacao.net.api.service;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Escola;
import fixacao.net.api.repository.CursoRepository;
import fixacao.net.api.repository.EscolaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EscolaService {

    private EscolaRepository escolaRepository;

    public Collection<Escola> buscarTodos(){
        return escolaRepository.findAll();
    }


    public void deletar( Long id){
        escolaRepository.deleteById(id);
    }


    public void salvar( Escola escola){
        escolaRepository.save(escola);
    }

    public Escola buscarUm(Long id) {
        return escolaRepository.findById(id).get();
    }
}

package fixacao.net.api.service;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Turma;
import fixacao.net.api.repository.CursoRepository;
import fixacao.net.api.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TurmaService {

    private TurmaRepository turmaRepository;

    public Collection<Turma> buscarTodos(){
        return turmaRepository.findAll();
    }

    public void deletar( Long id){
        turmaRepository.deleteById(id);
    }

    public void salvar( Turma turma){
        turmaRepository.save(turma);
    }

    public Turma buscarUm(Long id) {
        return turmaRepository.findById(id).get();
    }

}

package fixacao.net.api.service;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Disciplina;
import fixacao.net.api.repository.CursoRepository;
import fixacao.net.api.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DisciplinaService {

    private DisciplinaRepository disciplinaRepository;

    public Collection<Disciplina> buscarTodos(){
        return disciplinaRepository.findAll();
    }


    public void deletar( Long id){
        disciplinaRepository.deleteById(id);
    }


    public void salvar(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

    public Disciplina buscarUm(Long id) {
        return disciplinaRepository.findById(id).get();
    }
}

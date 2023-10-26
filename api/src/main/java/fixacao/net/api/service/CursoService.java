package fixacao.net.api.service;

import fixacao.net.api.model.Curso;
import fixacao.net.api.model.Usuario;
import fixacao.net.api.repository.CursoRepository;
import fixacao.net.api.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@AllArgsConstructor
public class CursoService {

    private CursoRepository cursoRepository;

    public Collection<Curso> buscarTodos(){
        return cursoRepository.findAll();
    }


    public void deletar( Long id){
        cursoRepository.deleteById(id);
    }


    public void salvar( Curso curso){
        cursoRepository.save(curso);
    }

    public Curso buscarUm(Long id) {
        return cursoRepository.findById(id).get();
    }
}

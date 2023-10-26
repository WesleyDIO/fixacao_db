package fixacao.net.api.service;

import fixacao.net.api.model.Aluno;
import fixacao.net.api.model.Usuario;
import fixacao.net.api.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public Collection<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public void deletar( Long id){
        usuarioRepository.deleteById(id);
    }

    public void salvar( Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Usuario buscarUm(Long id) {
        return usuarioRepository.findById(id).get();
    }

}

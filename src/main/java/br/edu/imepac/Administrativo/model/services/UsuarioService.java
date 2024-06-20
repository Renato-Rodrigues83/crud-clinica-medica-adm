package br.edu.imepac.Administrativo.model.services;


import br.edu.imepac.Administrativo.domain.UsuarioCreateRequest;
import br.edu.imepac.Administrativo.domain.UsuarioDTO;
import br.edu.imepac.Administrativo.model.entites.Usuario;
import br.edu.imepac.Administrativo.repositories.UsuarioRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
@Service
@Data
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final FuncionarioService funcionarioService;
    private final ModelMapper modelMapper;
    public UsuarioService(UsuarioRepository usuarioRepository, FuncionarioService funcionarioService, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.funcionarioService = funcionarioService;
        this.modelMapper = modelMapper;
    }

    public UsuarioDTO save(UsuarioCreateRequest usuarioCreateRequest){
        Usuario usuario = modelMapper.map(usuarioCreateRequest, Usuario.class);
        usuario = usuarioRepository.save(usuario);
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public List<UsuarioDTO> findAll(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return Arrays.asList(modelMapper.map(usuarios, UsuarioDTO[].class));
    }

    public void delete(Long id){usuarioRepository.deleteById(id);}

    public UsuarioDTO findById(Long id){
        return modelMapper.map(usuarioRepository.getReferenceById(id), UsuarioDTO.class);
    }
}

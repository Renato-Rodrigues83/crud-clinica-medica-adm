package br.edu.imepac.Administrativo.model.services;

import br.edu.imepac.Administrativo.domain.FuncionarioCreateRequest;
import br.edu.imepac.Administrativo.domain.FuncionarioDTO;
import br.edu.imepac.Administrativo.model.entites.Funcionario;
import br.edu.imepac.Administrativo.repositories.FuncionarioRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;
    private final ModelMapper modelMapper;

    public FuncionarioService(FuncionarioRepository funcionarioRepository, ModelMapper modelMapper) {
        this.funcionarioRepository = funcionarioRepository;
        this.modelMapper = modelMapper;
    }

    public FuncionarioDTO save(FuncionarioCreateRequest funcionarioCreateRequest){
        Funcionario funcionario = modelMapper.map(funcionarioCreateRequest, Funcionario.class);
        funcionario = funcionarioRepository.save(funcionario);
        return modelMapper.map(funcionario, FuncionarioDTO.class);
    }

    public List<FuncionarioDTO> findAll(){
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        return Arrays.asList(modelMapper.map(funcionarios, FuncionarioDTO[].class));
    }

    public void delete(Long id){funcionarioRepository.deleteById(id);}

    public FuncionarioDTO findById(Long id){
        return modelMapper.map(funcionarioRepository.getReferenceById(id), FuncionarioDTO.class);
    }
}

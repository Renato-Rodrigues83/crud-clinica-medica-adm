package br.edu.imepac.Administrativo.model.services;

import br.edu.imepac.Administrativo.domain.EspecialidadeCreateRequest;
import br.edu.imepac.Administrativo.domain.EspecialidadeDTO;
import br.edu.imepac.Administrativo.model.entites.Especialidade;
import br.edu.imepac.Administrativo.repositories.EspecialidadeRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
public class EspecialidadeService {

    private final EspecialidadeRepository especialidadeRepository;
    private final ModelMapper modelMapper;

    public EspecialidadeService(EspecialidadeRepository especialidadeRepository, ModelMapper modelMapper) {
        this.especialidadeRepository = especialidadeRepository;
        this.modelMapper = modelMapper;
    }

    public EspecialidadeDTO save(EspecialidadeCreateRequest especialidadeCreateRequest){
        Especialidade especialidade = modelMapper.map(especialidadeCreateRequest, Especialidade.class);
        especialidade = especialidadeRepository.save(especialidade);
        return modelMapper.map(especialidade, EspecialidadeDTO.class);
    }

    public List<EspecialidadeDTO> findAll(){
        List<Especialidade> especialidades = especialidadeRepository.findAll();
        return Arrays.asList(modelMapper.map(especialidades, EspecialidadeDTO[].class));
    }

    public void delete(Long id){
        especialidadeRepository.deleteById(id);
    }

    public EspecialidadeDTO findById(Long id){
        return modelMapper.map(especialidadeRepository.findById(id), EspecialidadeDTO.class);
    }
}

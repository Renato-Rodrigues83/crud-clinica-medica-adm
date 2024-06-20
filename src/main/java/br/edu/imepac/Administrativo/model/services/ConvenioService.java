package br.edu.imepac.Administrativo.model.services;

import br.edu.imepac.Administrativo.domain.ConvenioCreateRequest;
import br.edu.imepac.Administrativo.domain.ConvenioDTO;
import br.edu.imepac.Administrativo.model.entites.Convenio;
import br.edu.imepac.Administrativo.repositories.ConvenioRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Data
public class ConvenioService {

    private final ConvenioRepository convenioRepository;
    private final ModelMapper modelMapper;

    public ConvenioService(ConvenioRepository convenioRepository, ModelMapper modelMapper) {
        this.convenioRepository = convenioRepository;
        this.modelMapper = modelMapper;
    }

    public ConvenioDTO save(ConvenioCreateRequest convenioCreateRequest){
        Convenio convenio = modelMapper.map(convenioCreateRequest, Convenio.class);
        convenio = convenioRepository.save(convenio);
        return modelMapper.map(convenio, ConvenioDTO.class);
    }

    public List<ConvenioDTO> findAll(){
        List<Convenio> convenios = convenioRepository.findAll();
        return Arrays.asList(modelMapper.map(convenios, ConvenioDTO[].class));
    }

    public void delete(Long id){
        convenioRepository.deleteById(id);
    }

    public ConvenioDTO findById(Long id){
        return modelMapper.map(convenioRepository.findById(id), ConvenioDTO.class);
    }
}

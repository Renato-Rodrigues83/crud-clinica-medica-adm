package br.edu.imepac.Administrativo.model.services;

import br.edu.imepac.Administrativo.domain.MedicoCreateRequest;
import br.edu.imepac.Administrativo.domain.MedicoDTO;
import br.edu.imepac.Administrativo.model.entites.Medico;
import br.edu.imepac.Administrativo.repositories.MedicoRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
@Data
public class MedicoService {
    private final MedicoRepository medicoRepository;
    private final ModelMapper modelMapper;

    public MedicoService(MedicoRepository medicoRepository, ModelMapper modelMapper) {
        this.medicoRepository = medicoRepository;
        this.modelMapper = modelMapper;
    }

    public MedicoDTO save(MedicoCreateRequest medicoCreateRequest){
        Medico medico = modelMapper.map(medicoCreateRequest, Medico.class);
        medico = medicoRepository.save(medico);
        return modelMapper.map(medico, MedicoDTO.class);
    }

    public List<MedicoDTO> findAll(){
        List<Medico> medicos = medicoRepository.findAll();
        return Arrays.asList(modelMapper.map(medicos, MedicoDTO[].class));
    }

    public void delete(Long id){
        medicoRepository.deleteById(id);
    }

    public MedicoDTO findById(Long id){
        return modelMapper.map(medicoRepository.getReferenceById(id), MedicoDTO.class);
    }
}

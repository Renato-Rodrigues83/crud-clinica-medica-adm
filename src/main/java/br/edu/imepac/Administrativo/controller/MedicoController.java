package br.edu.imepac.Administrativo.controller;

import br.edu.imepac.Administrativo.domain.MedicoCreateRequest;
import br.edu.imepac.Administrativo.domain.MedicoDTO;
import br.edu.imepac.Administrativo.model.services.MedicoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public MedicoDTO addMedico(@RequestBody MedicoCreateRequest medicoCreateRequest){
        return medicoService.save(medicoCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<MedicoDTO> getAllMedico(){
        return medicoService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MedicoDTO getMedicoById(@PathVariable("id") Long id){
        return medicoService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMedico(@PathVariable("id") Long id){
        medicoService.delete(id);
    }
}

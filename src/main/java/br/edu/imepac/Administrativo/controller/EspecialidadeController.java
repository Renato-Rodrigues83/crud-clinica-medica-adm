package br.edu.imepac.Administrativo.controller;

import br.edu.imepac.Administrativo.domain.EspecialidadeCreateRequest;
import br.edu.imepac.Administrativo.domain.EspecialidadeDTO;
import br.edu.imepac.Administrativo.model.services.EspecialidadeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeController {

    private final EspecialidadeService especialidadeService;

    public EspecialidadeController(EspecialidadeService especialidadeService) {
        this.especialidadeService = especialidadeService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public EspecialidadeDTO addEspecialidade(@RequestBody EspecialidadeCreateRequest especialidadeCreateRequest){
        return especialidadeService.save(especialidadeCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<EspecialidadeDTO> getAllEspecialidades(){
        return especialidadeService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value ="/{id}" ,method = RequestMethod.GET)
    public EspecialidadeDTO getEspecialidadeById(@PathVariable("id") Long id){
        return especialidadeService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value ="/{id}" ,method = RequestMethod.DELETE)
    public void deleteEspecialidade(@PathVariable("id") Long id){
        especialidadeService.delete(id);
    }
}

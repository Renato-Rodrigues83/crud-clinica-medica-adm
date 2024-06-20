package br.edu.imepac.Administrativo.controller;

import br.edu.imepac.Administrativo.domain.ConvenioCreateRequest;
import br.edu.imepac.Administrativo.domain.ConvenioDTO;
import br.edu.imepac.Administrativo.model.services.ConvenioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/convenio")
public class ConvenioController {
    private final ConvenioService convenioService;

    public ConvenioController(ConvenioService convenioService) {
        this.convenioService = convenioService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ConvenioDTO addConvenio(@RequestBody ConvenioCreateRequest convenioCreateRequest){
        return convenioService.save(convenioCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<ConvenioDTO> getAllConvenios(){
        return convenioService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ConvenioDTO getConvenioById(@PathVariable("id") Long id){
      return convenioService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteConvenio(@PathVariable("id") Long id){
        convenioService.delete(id);
    }
}

package br.edu.imepac.Administrativo.controller;

import br.edu.imepac.Administrativo.domain.FuncionarioCreateRequest;
import br.edu.imepac.Administrativo.domain.FuncionarioDTO;
import br.edu.imepac.Administrativo.model.services.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public FuncionarioDTO addFuncionario(@RequestBody FuncionarioCreateRequest funcionarioCreateRequest){
        return funcionarioService.save(funcionarioCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
        public List<FuncionarioDTO> getAllFuncionario(){
            return funcionarioService.findAll();
        }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public FuncionarioDTO getFuncionarioById(@PathVariable("id") Long id) {
      return funcionarioService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void deleteFuncionario(@PathVariable ("id") Long id) {
        funcionarioService.delete(id);
    }

}

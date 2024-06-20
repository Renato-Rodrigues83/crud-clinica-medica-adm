package br.edu.imepac.Administrativo.controller;

import br.edu.imepac.Administrativo.domain.UsuarioCreateRequest;
import br.edu.imepac.Administrativo.domain.UsuarioDTO;
import br.edu.imepac.Administrativo.model.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public UsuarioDTO addUsuario(@RequestBody UsuarioCreateRequest usuarioCreateRequest){
        return usuarioService.save(usuarioCreateRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<UsuarioDTO> getAllUsuarios(){
        return usuarioService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UsuarioDTO getUsuarioById(@PathVariable("id") Long id){
        return usuarioService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable("id")Long id) {
        usuarioService.delete(id);
    }
}

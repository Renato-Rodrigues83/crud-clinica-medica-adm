package br.edu.imepac.Administrativo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioDTO {

    private Long id;
    private String idUsuario;
    private String senhaAcesso;
    private boolean cadastroFuncionario;
    private boolean cadastroUsuario;
    private boolean cadastroPaciente;
    private boolean cadastroEspecialidade;
    private boolean cadastroMedico;
    private boolean cadastroConvenio;
    private boolean agendamentoConsulta;
    private boolean cancelamentoConsulta;
    private boolean moduloAdministrativo;
    private boolean moduloAgendamento;
    private boolean moduloAtendimento;
}

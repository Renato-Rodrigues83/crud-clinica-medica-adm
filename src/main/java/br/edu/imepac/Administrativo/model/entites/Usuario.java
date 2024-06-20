package br.edu.imepac.Administrativo.model.entites;
import lombok.*;

import javax.persistence.*;

@Entity(name = "usuarios")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_usuario")
    private String idUsuario;

    @Column(name = "senha_acesso")
    private String senhaAcesso;

    @Column(name = "cadastro_funcionario")
    private boolean cadastroFuncionario;

    @Column(name = "cadastro_usuario")
    private boolean cadastroUsuario;

    @Column(name = "cadastro_paciente")
    private boolean cadastroPaciente;

    @Column(name = "cadastro_especialidade")
    private boolean cadastroEspecialidade;

    @Column(name = "cadastro_medico")
    private boolean cadastroMedico;

    @Column(name = "cadastro_convenio")
    private boolean cadastroConvenio;

    @Column(name = "agendamento_consulta")
    private boolean agendamentoConsulta;

    @Column(name = "cancelamento_consulta")
    private boolean cancelamentoConsulta;

    @Column(name = "modulo_administrativo")
    private boolean moduloAdministrativo;

    @Column(name = "modulo_agendamento")
    private boolean moduloAgendamento;

    @Column(name = "modulo_atendimento")
    private boolean moduloAtendimento;

   // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   // @JoinColumn(name = "funcionario_id", referencedColumnName = "id")
   // private Funcionario funcionario;
}

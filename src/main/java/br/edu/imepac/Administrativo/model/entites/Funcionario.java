package br.edu.imepac.Administrativo.model.entites;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "funcionarios")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_funcionario")
    private String nomeFuncionario;
    @Column(name = "numero_rg")
    private String numeroRg;
    @Column(name = "orgao_emissor")
    private String orgaoEmissor;
    @Column(name = "numero_cpf")
    private String numeroCpf;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numero")
    private String numero;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "celular", nullable = false)
    private String celular;
    @Column(name = "numero_ctps")
    private String numeroCtps;
    @Column(name = "numero_pis")
    private String numeroPis;
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;

}
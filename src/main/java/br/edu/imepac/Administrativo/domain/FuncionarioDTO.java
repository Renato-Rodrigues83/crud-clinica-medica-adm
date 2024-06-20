package br.edu.imepac.Administrativo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {
    private Long id;

    private String nomeFuncionario;

    private String numeroRg;

    private String orgaoEmissor;

    private String numeroCpf;

    private String endereco;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private String telefone;

    private String celular;

    private String numeroCtps;

    private String numeroPis;

    private Date dataNascimento;
}

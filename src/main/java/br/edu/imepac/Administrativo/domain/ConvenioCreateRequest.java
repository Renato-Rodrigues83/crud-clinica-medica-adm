package br.edu.imepac.Administrativo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConvenioCreateRequest {
    private String empresa;

    private String cnpj;

    private String telefone;
}

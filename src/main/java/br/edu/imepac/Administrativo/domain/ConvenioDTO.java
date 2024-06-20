package br.edu.imepac.Administrativo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConvenioDTO {
    private Long id;

    private String empresa;

    private String cnpj;

    private String telefone;
}

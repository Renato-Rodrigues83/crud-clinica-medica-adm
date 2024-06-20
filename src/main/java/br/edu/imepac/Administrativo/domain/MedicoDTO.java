package br.edu.imepac.Administrativo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicoDTO {
    private Long id;

    private String nomeMedico;

    private String tipoespecialidade;

    private String crm;
}

package br.edu.imepac.Administrativo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicoCreateRequest {
    private String nomeMedico;

    private String tipoespecialidade;

    private String crm;
}

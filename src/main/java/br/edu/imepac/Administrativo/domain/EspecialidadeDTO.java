package br.edu.imepac.Administrativo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EspecialidadeDTO {
    private Long id;

    private String descricaoEspecialidade;
}

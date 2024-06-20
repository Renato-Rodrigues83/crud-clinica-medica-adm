package br.edu.imepac.Administrativo.model.entites;

import lombok.*;

import javax.persistence.*;

@Entity(name = "medicos")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_medico")
    private String nomeMedico;

    @Column(name = "tipo_especialidade")
    private String tipoespecialidade;

    @Column(name = "numero_crm")
    private String crm;

}

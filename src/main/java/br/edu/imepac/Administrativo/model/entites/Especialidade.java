package br.edu.imepac.Administrativo.model.entites;

import lombok.*;

import javax.persistence.*;

@Entity(name = "especialidades")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Especialidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descricao_especialidade")
    private String descricaoEspecialidade;
}
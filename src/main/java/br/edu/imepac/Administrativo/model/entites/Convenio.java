package br.edu.imepac.Administrativo.model.entites;

import lombok.*;

import javax.persistence.*;

@Entity(name = "convenios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "telefone")
    private String telefone;
}

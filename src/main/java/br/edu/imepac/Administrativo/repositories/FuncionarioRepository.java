package br.edu.imepac.Administrativo.repositories;

import br.edu.imepac.Administrativo.model.entites.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

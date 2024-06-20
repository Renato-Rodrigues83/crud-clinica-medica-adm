package br.edu.imepac.Administrativo.repositories;

import br.edu.imepac.Administrativo.model.entites.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}

package br.edu.imepac.Administrativo.repositories;

import br.edu.imepac.Administrativo.model.entites.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}

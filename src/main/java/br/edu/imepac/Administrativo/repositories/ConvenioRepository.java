package br.edu.imepac.Administrativo.repositories;

import br.edu.imepac.Administrativo.model.entites.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvenioRepository extends JpaRepository<Convenio, Long> {
}

package br.edu.imepac.Administrativo.repositories;

import br.edu.imepac.Administrativo.model.entites.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

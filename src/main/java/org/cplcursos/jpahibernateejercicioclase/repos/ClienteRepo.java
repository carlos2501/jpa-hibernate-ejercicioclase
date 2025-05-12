package org.cplcursos.jpahibernateejercicioclase.repos;

import org.cplcursos.jpahibernateejercicioclase.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {
}

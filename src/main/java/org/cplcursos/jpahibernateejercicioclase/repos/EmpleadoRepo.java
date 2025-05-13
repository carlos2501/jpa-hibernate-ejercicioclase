package org.cplcursos.jpahibernateejercicioclase.repos;

import org.cplcursos.jpahibernateejercicioclase.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {
}

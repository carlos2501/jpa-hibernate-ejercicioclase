package org.cplcursos.jpahibernateejercicioclase.repos;

import org.cplcursos.jpahibernateejercicioclase.entidades.Empleado;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

    @EntityGraph(value="grafoEmpleado", type= EntityGraph.EntityGraphType.LOAD)
    List<Empleado> findAll();
}

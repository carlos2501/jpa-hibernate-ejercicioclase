package org.cplcursos.jpahibernateejercicioclase.servicios;

import org.cplcursos.jpahibernateejercicioclase.entidades.Empleado;
import org.cplcursos.jpahibernateejercicioclase.repos.EmpleadoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoSrvc {

    private final EmpleadoRepo empleadoRepo;

    public EmpleadoSrvc(EmpleadoRepo empleadoRepo) {
        this.empleadoRepo = empleadoRepo;
    }

    public List<Empleado> listarEmpleados() {
        return empleadoRepo.findAll();
    }

    public Optional<Empleado> buscarEmpleadoPorId(Integer id) {
        return empleadoRepo.findById(id);
    }
}

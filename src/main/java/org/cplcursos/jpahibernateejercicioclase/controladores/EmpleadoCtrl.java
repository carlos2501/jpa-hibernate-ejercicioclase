package org.cplcursos.jpahibernateejercicioclase.controladores;

import org.cplcursos.jpahibernateejercicioclase.entidades.Empleado;
import org.cplcursos.jpahibernateejercicioclase.servicios.EmpleadoSrvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoCtrl {
    private final EmpleadoSrvc empleadoSrvc;

    public EmpleadoCtrl(EmpleadoSrvc empleadoSrvc) {
        this.empleadoSrvc = empleadoSrvc;
    }

    @GetMapping({"/empleados", "/empleados/"})
    public String listaEmpleados(Model modelo) {
        modelo.addAttribute("titulo", "Lista de clientes");
        modelo.addAttribute("listaEmpleados", empleadoSrvc.listarEmpleados());

        Empleado emp = empleadoSrvc.buscarEmpleadoPorId(11).get();


        return "listaEmpleados";
    }
}

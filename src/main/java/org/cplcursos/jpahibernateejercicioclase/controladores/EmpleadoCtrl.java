package org.cplcursos.jpahibernateejercicioclase.controladores;

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
        return "listaEmpleados";
    }
}

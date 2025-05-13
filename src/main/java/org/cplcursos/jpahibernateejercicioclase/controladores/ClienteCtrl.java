package org.cplcursos.jpahibernateejercicioclase.controladores;

import org.cplcursos.jpahibernateejercicioclase.servicios.ClienteSrvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteCtrl {

    private final ClienteSrvc clienteSrvc;

    public ClienteCtrl(ClienteSrvc clienteSrvc) {
        this.clienteSrvc = clienteSrvc;
    }

    @GetMapping({"/clientes", "/clientes/"})
    public String listaClientes(Model modelo){
        modelo.addAttribute("titulo", "Lista de clientes");
        modelo.addAttribute("listaClientes", clienteSrvc.listarClientes());
        return "listaClientes";
    }
}

package org.cplcursos.jpahibernateejercicioclase.servicios;

import org.cplcursos.jpahibernateejercicioclase.entidades.Cliente;
import org.cplcursos.jpahibernateejercicioclase.repos.ClienteRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteSrvc {

    private final ClienteRepo clienteRepo;

    public ClienteSrvc(ClienteRepo clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public Iterable<Cliente> listarClientes() {
        return clienteRepo.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Integer id) {
        return clienteRepo.findById(id);
    }
}

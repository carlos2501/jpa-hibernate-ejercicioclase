package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="empleados") // Mapea a la tabla 'empleado'
@Entity
@NamedEntityGraph(
        name="grafoEmpleado",
        attributeNodes = {@NamedAttributeNode("clientes")}
)
public class Empleado {
    @Id
    private Integer codigoEmpleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String extension;
    private String puesto;
    @Column(name="codigo_oficina")
    private String codigoOficina; // Clave foránea para Oficina
    private Integer codigoJefe; // Podría ser clave foránea a Empleado (auto-referencia)


    @OneToMany(mappedBy = "repVentas")
    private Set<Cliente> clientes;

    public String nombreYApellido() {
        return nombre + " " + apellido1;
    }

    public void nuevoCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void quitarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
}

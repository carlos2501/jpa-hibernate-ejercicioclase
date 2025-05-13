package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="empleados") // Mapea a la tabla 'empleado'
@Entity
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

    public String nombreYApellido() {
        return nombre + " " + apellido1;
    }
}

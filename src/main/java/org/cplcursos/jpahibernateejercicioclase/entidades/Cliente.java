package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="clientes")
@Entity
public class Cliente {
    @Id
    private Integer codigo_cliente;
    private String nombre_cliente;
    private String nombre_contacto;
    private String apellido_contacto;
    private String telefono;
    private String fax;
    private String linea_direccion1;
    private String linea_direccion2;
    private String ciudad;
    private String region;
    private String pais;
    private String codigo_postal;
    @Column(name="codigo_empleado_rep_ventas")
    private Integer codigo_rep_ventas;
    private Double limite_credito;

    @Override
    public String toString(){
        return "Cliente " + nombre_cliente + " teléfono " + telefono;
    }
}

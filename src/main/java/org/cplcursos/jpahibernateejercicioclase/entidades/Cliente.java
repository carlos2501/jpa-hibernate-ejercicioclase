package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_cliente", nullable = false)
    private Long codigoCliente;

    private String nombreCliente;
    private String nombreContacto;
    private String apellidoContacto;
    private String telefono;
    private String fax;
    @Column(name="linea_direccion1")
    private String lineaDireccion1;
    @Column(name="linea_direccion2")
    private String lineaDireccion2;
    private String ciudad;
    private String region;
    private String pais;
    private String codigoPostal;

    @ManyToOne
    @JoinColumn(name="fk_empleado")
    private Empleado repVentas;

    private Double limiteCredito;

    @Override
    public String toString(){
        return "Cliente " + nombreCliente + " teléfono " + telefono;
    }
}

package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "productos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @Column(name = "codigo_producto", length = 15)
    private String codigoProducto;

    @Column(name = "nombre", length = 70, nullable = false)
    private String nombre;

    @Column(name = "gama", length = 50, nullable = false)
    private String gama;

    @Column(name = "dimensiones", length = 25)
    private String dimensiones;

    @Column(name = "proveedor", length = 50)
    private String proveedor;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidad_en_stock", nullable = false)
    private Short cantidadEnStock;

    @Column(name = "precio_venta", nullable = false)
    private BigDecimal precioVenta;

    @Column(name = "precio_proveedor")
    private BigDecimal precioProveedor;

    @ManyToMany(mappedBy = "productos")
    private Set<Pedido> pedidos;
}


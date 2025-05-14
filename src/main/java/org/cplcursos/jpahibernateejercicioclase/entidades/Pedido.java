package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "pedidos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @Column(name = "codigo_pedido")
    private Integer codigoPedido;

    @Column(name = "fecha_pedido", nullable = false)
    private LocalDate fechaPedido;

    @Column(name = "fecha_esperada", nullable = false)
    private LocalDate fechaEsperada;

    @Column(name = "fecha_entrega")
    private LocalDate fechaEntrega;

    @Column(name = "estado", length = 15, nullable = false)
    private String estado;

    @Column(name = "comentarios")
    private String comentarios;

    @ManyToOne
    private Cliente codigoCliente;

    @ManyToMany
    @JoinTable(
            name = "pedido_producto",
            joinColumns = @JoinColumn(name = "codigo_pedido"),
            inverseJoinColumns = @JoinColumn(name = "codigo_producto")
    )
    private Set<Producto> productos;
}


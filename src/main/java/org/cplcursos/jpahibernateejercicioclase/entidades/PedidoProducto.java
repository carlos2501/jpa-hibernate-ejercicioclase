package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pedido_producto")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoProducto {

    @EmbeddedId
    private PedidoProductoId id;

    @ManyToOne
    @MapsId("codigoPedido")
    @JoinColumn(name = "codigo_pedido")
    private Pedido pedido;

    @ManyToOne
    @MapsId("codigoProducto")
    @JoinColumn(name = "codigo_producto")
    private Producto producto;

    // Ejemplo de campo adicional: cantidad pedida
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    // Ejemplo de campo adicional: precio unitario en el pedido
    @Column(name = "precio_unitario", nullable = false)
    private BigDecimal precioUnitario;
}


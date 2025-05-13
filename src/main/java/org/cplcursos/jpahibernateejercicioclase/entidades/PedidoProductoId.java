package org.cplcursos.jpahibernateejercicioclase.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoProductoId implements Serializable {

    @Column(name = "codigo_pedido")
    private Integer codigoPedido;
    @Column(name = "codigo_producto", length = 15)
    private String codigoProducto;
}


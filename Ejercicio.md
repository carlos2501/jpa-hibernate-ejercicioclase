# Ejercicio

1. Mediante IA (de libre elección) rellenar con datos de prueba las tablas "pedidos", "productos" y "pedidos_productos"
   (la tabla intermedia de la relación entre Pedido y Producto). Cread no más de 10 pedidos y 10 productos con no más de
   tres productos por pedido.


2. Los estados de un pedido pueden ser:
   - Pendiente (de procesar)
   - Preparado
   - Enviado
   - Entregado
   - Facturado
   - Cobrado


3. Crear un endpoint "pedidos" que presente una tabla con los pedidos mostrando:
   - Nro. de pedido.
   - Cód. de cliente.
   - Nombre de cliente.
   - Fecha de pedido.
   - Total importe pedido.
   - Estado.


4. Cada línea de pedido presentará un "desplegable" (clase "accordion" de Bootstrap 5.3) que será otra tabla con las
   líneas del pedido indicando:
   - Cod. del producto.
   - Descripción del producto.
   - Cantidad de producto pedida
   - Precio de venta.
   - Total de la línea.
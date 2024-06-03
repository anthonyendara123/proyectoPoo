//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Hamburguesa", 5.99, true, "Comida rápida", "Deliciosa hamburguesa", 100);

        // Mostrar información del producto
        producto1.mostrarInformacion();

        // Actualizar el precio del producto
        producto1.actualizarPrecio(6.99);

        // Cambiar la disponibilidad del producto
        producto1.cambiarDisponibilidad();
        Cliente cliente1 = new Cliente(1, "Juan", "123456789", "Calle Principal", false, 100.0, false);

        // Realizar un pedido
        cliente1.realizarPedido();

        // Registrar al cliente
        cliente1.registrar();

        // Cancelar un pedido
        cliente1.cancelarPedido();

        // Actualizar información del cliente
        cliente1.actualizarInformacion("Calle Secundaria");
        Inventario inventario1 = new Inventario(100); // Capacidad máxima del inventario: 100 productos

        // Agregar un producto al inventario
        inventario1.agregarProducto(new Producto(1, "Hamburguesa", 5.99, true, "Comida rápida", "Deliciosa hamburguesa", 100));

        // Eliminar un producto del inventario
        inventario1.eliminarProducto(1);

        // Buscar un producto en el inventario
        inventario1.buscarProducto(2);

        // Mostrar el inventario
        inventario1.mostrarInventario();
        Mesa mesa1 = new Mesa(1, 4, false, false, "Zona VIP", true, true);

        // Reservar la mesa
        mesa1.reservarMesa();

        // Ocupar la mesa
        mesa1.ocuparMesa();

        // Liberar la mesa
        mesa1.liberarMesa();

        // Desocupar la mesa
        mesa1.desocuparMesa();
        // Crear un objeto de la clase Chef
        Chef chef1 = new Chef(1, "Juan", "Italiana", true, true, 10, 35);

        // Trabajar en la cocina
        chef1.trabajar();

        // Descansar
        chef1.descansar();

        // Actualizar la especialidad del chef
        chef1.actualizarEspecialidad("Francesa");

        // Celebrar cumpleaños del chef
        chef1.celebrarCumpleaños();
        Cliente cliente = new Cliente(1, "Juan", "123456789", "Calle Principal", false, 100.0, false);

        // Crear un objeto de la clase Factura
        Factura factura1 = new Factura(1, cliente, 50.0);

        // Pagar la factura
        factura1.pagarFactura();

        // Cancelar la factura
        factura1.cancelarFactura();
        // Crear algunos productos para agregar a la orden
        Producto producto01 = new Producto(1, "Hamburguesa", 5.99, true, "Comida rápida", "Deliciosa hamburguesa", 100);
        Producto producto02 = new Producto(2, "Pizza", 8.99, true, "Comida italiana", "Pizza de pepperoni", 50);

        // Crear un objeto de la clase Orden
        Orden orden1 = new Orden(1);

        // Agregar productos a la orden
        orden1.agregarProducto(producto01);
        orden1.agregarProducto(producto02);

        // Remover un producto de la orden
        orden1.removerProducto(producto1);

        // Entregar la orden
        orden1.entregarOrden();

        // Pagar la orden
        orden1.pagarOrden();
    }
}
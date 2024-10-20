package test;

import Entidades.*;
import persistencia.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class GP8Restaurant {
    public static void main(String[] args) {
         Conexion conexion = new Conexion();
         
        // Crear instancias de los Data
        MesasData mesasData = new MesasData();
        MeserosData meserosData = new MeserosData();
        ProductosData productosData = new ProductosData();
        ReservasData reservasData = new ReservasData();
        PedidosData pedidosData = new PedidosData();
        DetallePedidoData detallePedidoData = new DetallePedidoData();

        // 1. Agregar una nueva mesa
        Mesas mesa = new Mesas(0, 1, 4, "libre");
        mesasData.agregarMesa(mesa);
        System.out.println("Mesa agregada: " + mesa.getId_mesa());

        // 2. Agregar un nuevo mesero (usamos LocalDate para la fecha de registro sin hora)
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);

        // Ejemplo de cómo usar LocalDate en una entidad
        Meseros mesero = new Meseros(0, "Carlos", "Gomez", "12345678", fechaActual);
        System.out.println("Mesero agregado: " + mesero.getNombre() + " " + mesero.getApellido() + " en la fecha: " + mesero.getFechaRegistro());

        // 3. Agregar un nuevo producto
        Productos producto = new Productos(0, "Pizza", "Comida", 500.0, 10, true);
        productosData.agregarProducto(producto);
        System.out.println("Producto agregado: " + producto.getNombre());

        // 4. Agregar una nueva reserva para esa mesa
        LocalDateTime fechaReserva = LocalDateTime.of(2024, 10, 21, 18, 30); // Ejemplo de fecha y hora
        Reservas reserva = new Reservas(0, mesa.getId_mesa(), "Juan Perez", "12345678", fechaReserva, true);
        reservasData.agregarReserva(reserva);
        System.out.println("Reserva agregada para el cliente: " + reserva.getNombre_cliente());

        // 5. Listar todas las reservas
        List<Reservas> reservas = reservasData.listarReservas();
        System.out.println("Reservas:");
        for (Reservas r : reservas) {
            System.out.println("ID Reserva: " + r.getId_reserva() + ", Cliente: " + r.getNombre_cliente() + ", Fecha y Hora: " + r.getFecha_reserva());
        }

        // 6. Agregar un pedido para esa mesa (usamos LocalDateTime completo en lugar de dividirlo)
        Pedidos pedido = new Pedidos(0, mesa.getId_mesa(), mesero.getId_mesero(), fechaReserva, true, 1000.50);
        pedidosData.agregarPedido(pedido);
        System.out.println("Pedido agregado para la mesa: " + mesa.getId_mesa());

        // 7. Agregar un detalle del pedido (Producto)
        DetallePedido detallePedido = new DetallePedido(0, pedido.getId_pedido(), producto.getId_producto(), 2, producto.getPrecio(), producto.getPrecio() * 2);
        detallePedidoData.agregarDetallePedido(detallePedido);
        System.out.println("Detalle de pedido agregado: " + detallePedido.getCantidad() + " x " + producto.getNombre());

        // 8. Listar todos los pedidos
        List<Pedidos> pedidos = pedidosData.listarPedidos();
        System.out.println("Pedidos:");
        for (Pedidos p : pedidos) {
            System.out.println("ID Pedido: " + p.getId_pedido() + ", Monto Total: " + p.getMonto_total() + ", Fecha: " + p.getFecha_pedido());
        }

        // 9. Actualizar una reserva
        reserva.setNombre_cliente("Maria Gomez");
        reservasData.actualizarReserva(reserva);
        System.out.println("Reserva actualizada: " + reserva.getNombre_cliente());

        // 10. Eliminar un pedido
        pedidosData.eliminarPedido(pedido.getId_pedido());
        System.out.println("Pedido eliminado con ID: " + pedido.getId_pedido());

        // 11. Probar búsqueda de reservas por ID
        Reservas reservaBuscada = reservasData.buscarReservaPorId(reserva.getId_reserva());
        if (reservaBuscada != null) {
            System.out.println("Reserva encontrada: " + reservaBuscada.getNombre_cliente() + ", Fecha: " + reservaBuscada.getFecha_reserva());
        }

        // Finalizar
        System.out.println("Pruebas finalizadas.");
    }

    private static Date LocalDate() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}

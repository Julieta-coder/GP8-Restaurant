package test;

import Entidades.*;
import persistencia.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class GP8Restaurant {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        if (conexion == null) {
            System.out.println("Error al establecer la conexión con la base de datos.");
            return;
        }

        MesasData mesasData = new MesasData();
        MeserosData meserosData = new MeserosData();
        ProductosData productosData = new ProductosData();
        ReservasData reservasData = new ReservasData();
        PedidosData pedidosData = new PedidosData();
        DetallePedidoData detallePedidoData = new DetallePedidoData();

        // Creación de una mesa
        Mesas mesa = new Mesas(0, 1, 4, "libre");
        mesasData.agregarMesa(mesa);
        System.out.println("Mesa agregada: " + mesa.getId_mesa());

        int idMesaGenerada = mesa.getId_mesa();
        System.out.println("Mesa agregada con ID: " + idMesaGenerada);

        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);

        // Creación de un mesero
        Meseros mesero = new Meseros(0, "Carlos", "Gomez", "12345632", fechaActual);
        meserosData.agregarMesero(mesero);
        System.out.println("Mesero agregado: " + mesero.getNombre() + " " + mesero.getApellido() + " en la fecha: " + mesero.getFechaRegistro());

        // Creación de un producto
        Productos producto = new Productos(0, "Pizza", "Comida", 500.0, 10, true);
        productosData.agregarProducto(producto);
        System.out.println("Producto agregado: " + producto.getNombre());

        // Creación de una reserva
        LocalDateTime fechaReserva = LocalDateTime.of(2024, 10, 21, 18, 30);
        Reservas reserva = new Reservas(0, idMesaGenerada, "Juan Perez", "12345632", fechaReserva, true);
        reservasData.agregarReserva(reserva);
        System.out.println("Reserva agregada para el cliente: " + reserva.getNombre_cliente());

        // Listar reservas
        List<Reservas> reservas = reservasData.listarReservas();
        System.out.println("Reservas:");
        for (Reservas r : reservas) {
            System.out.println("ID Reserva: " + r.getId_reserva() + ", Cliente: " + r.getNombre_cliente() + ", Fecha y Hora: " + r.getFecha_reserva());
        }

        // Creación de un pedido usando objetos Mesas y Meseros
        Pedidos pedido = new Pedidos(0, mesa, mesero, fechaReserva.toLocalDate(), fechaReserva.toLocalTime(), true, 1000.50);
        pedidosData.agregarPedido(pedido);
        System.out.println("Pedido agregado para la mesa: " + mesa.getId_mesa());

        // Creación del detalle de un pedido
        DetallePedido detallePedido = new DetallePedido(0, pedido, producto, 2, producto.getPrecio(), producto.getPrecio() * 2);
        detallePedidoData.agregarDetallePedido(detallePedido);
        System.out.println("Detalle de pedido agregado: " + detallePedido.getCantidad() + " x " + producto.getNombre());

        // Listar pedidos
        List<Pedidos> pedidos = pedidosData.listarPedidos();
        System.out.println("Pedidos:");
        for (Pedidos p : pedidos) {
            System.out.println("ID Pedido: " + p.getId_pedido() + ", Monto Total: " + p.getMonto_total() + ", Fecha: " + p.getFecha_pedido());
        }

        // Actualización de la reserva
        reserva.setNombre_cliente("Maria Gomez");
        reservasData.actualizarReserva(reserva);
        System.out.println("Reserva actualizada: " + reserva.getNombre_cliente());

        // Eliminación de un pedido
        pedidosData.eliminarPedido(pedido.getId_pedido());
        System.out.println("Pedido eliminado con ID: " + pedido.getId_pedido());

        // Búsqueda de reserva por ID
        Reservas reservaBuscada = reservasData.buscarReservaPorId(reserva.getId_reserva());
        if (reservaBuscada != null) {
            System.out.println("Reserva encontrada: " + reservaBuscada.getNombre_cliente() + ", Fecha: " + reservaBuscada.getFecha_reserva());
        }

        System.out.println("Pruebas finalizadas.");
    }
}

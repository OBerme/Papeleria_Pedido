package main;
public class Main {
    public static void main(String[] args) {
        // Crear un nuevo pedido
        Pedido pedido = new Pedido();

        // Realizar el pedido
        System.out.println("Realizando el pedido...");
        pedido.realizarPedido();

        // Pagar el pedido
        System.out.println("Pagando el pedido...");
        pedido.pagar();

        // Preparar el pedido
        System.out.println("Preparando el pedido...");
        pedido.preparar();

        // Enviar el pedido
        System.out.println("Enviando el pedido...");
        pedido.enviar();

        // Recibir el pedido
        System.out.println("Recibiendo el pedido...");
        pedido.recibir();

        // Consultar estado actual del pedido
        System.out.println("Consultando el estado del pedido...");
        pedido.consultar();

        // Intentar devolver el pedido
        System.out.println("Devolviendo el pedido...");
        pedido.devolver();

        // Consultar estado final del pedido
        System.out.println("Consultando el estado final del pedido...");
        pedido.consultar();
    }
}

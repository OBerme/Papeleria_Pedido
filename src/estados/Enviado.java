package estados;

import main.Pedido;

public class Enviado implements EstadoPedido {
    private Pedido pedido;

    public Enviado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void realizarPedido() {
        System.out.println("El pedido ya ha sido realizado y enviado.");
    }

    @Override
    public void pagar() {
        System.out.println("El pedido ya ha sido pagado.");
    }

    @Override
    public void preparar() {
        System.out.println("El pedido ya fue preparado.");
    }

    @Override
    public void enviar() {
        System.out.println("El pedido ya está en tránsito.");
    }

    @Override
    public void devolver() {
        System.out.println("El pedido está siendo devuelto.");
        pedido.setEstado(pedido.getRecibido());  // Suponiendo la devolución implica recibido.
    }

    @Override
    public void cancelarEnvio() {
        System.out.println("El envío no puede cancelarse, ya fue enviado.");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando estado: El pedido ha sido enviado.");
    }

    @Override
    public void recibir() {
        System.out.println("Se ha recibido el pedido");
        pedido.setEstado(pedido.getRecibido());
    }
}

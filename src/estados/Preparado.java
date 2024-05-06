package estados;

import estados.EstadoPedido;
import main.Pedido;

public class Preparado implements EstadoPedido {
    private Pedido pedido;

    public Preparado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void realizarPedido() {
        System.out.println("El pedido ya ha sido realizado y preparado.");
    }

    @Override
    public void pagar() {
        System.out.println("El pedido ya ha sido pagado.");
    }

    @Override
    public void preparar() {
        System.out.println("El pedido ya está preparado.");
    }

    @Override
    public void enviar() {
        System.out.println("El pedido está siendo enviado.");
        pedido.setEstado(pedido.getEnviado());
    }

    @Override
    public void devolver() {
        System.out.println("El pedido aún no puede ser devuelto, no ha sido enviado.");
    }

    @Override
    public void cancelarEnvio() {
        System.out.println("Cancelando el envío.");
        pedido.setEstado(pedido.getCancelado());
    }

    @Override
    public void consultar() {
        System.out.println("Consultando estado: El pedido está listo para enviar.");
    }

    @Override
    public void recibir() {
        System.out.println("No se puede recibir el pedido ya que todavia no se ha preparado");
    }
}

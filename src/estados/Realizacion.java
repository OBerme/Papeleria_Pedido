package estados;

import estados.EstadoPedido;
import main.Pedido;

public class Realizacion implements EstadoPedido {
    private Pedido pedido;

    public Realizacion(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void realizarPedido() {
        System.out.println("El pedido ya ha sido realizado.");
    }

    @Override
    public void pagar() {
        System.out.println("El pedido está siendo pagado.");
        pedido.setEstado(pedido.getPagado());
    }

    @Override
    public void preparar() {
        System.out.println("El pedido aún no ha sido pagado y no puede ser preparado.");
    }

    @Override
    public void enviar() {
        System.out.println("El pedido aún no ha sido pagado y no puede ser enviado.");
    }

    @Override
    public void devolver() {
        System.out.println("El pedido aún no ha sido pagado y no puede ser devuelto.");
    }

    @Override
    public void cancelarEnvio() {
        System.out.println("No hay envío para cancelar en el estado de realización.");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando estado: El pedido se esta preparando...");
    }

    @Override
    public void recibir() {
        System.out.println("No se puede recibir el pedido ya que se no se ha creado uno");
    }
}

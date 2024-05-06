package estados;

import main.Pedido;

public class Pagado implements EstadoPedido {
    private Pedido pedido;

    public Pagado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void realizarPedido() {
        System.out.println("El pedido ya ha sido realizado. No se puede realizar nuevamente en estado pagado.");
    }

    @Override
    public void pagar() {
        System.out.println("El pedido ya ha sido pagado. No se puede pagar nuevamente.");
    }

    @Override
    public void preparar() {
        System.out.println("El pedido está siendo preparado.");
        pedido.setEstado(pedido.getPreparado());  // Cambiar al estado Preparado
    }

    @Override
    public void enviar() {
        System.out.println("El pedido aún no está preparado para ser enviado. Debe prepararse primero.");
    }

    @Override
    public void devolver() {
        System.out.println("El pedido aún no puede ser devuelto, no ha sido enviado.");
    }

    @Override
    public void cancelarEnvio() {
        System.out.println("No hay envío para cancelar en el estado de pagado.");
    }

    @Override
    public void consultar() {
        System.out.println("El pedido ha sido pagado y está pendiente de preparación.");
    }

    @Override
    public void recibir() {
        System.out.println("No se puede recibir el pedido ya que se no se ha enviado");
    }
}

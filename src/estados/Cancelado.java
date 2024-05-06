package estados;

import main.Pedido;

public class Cancelado implements EstadoPedido {
    private Pedido pedido;

    public Cancelado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void realizarPedido() {
        System.out.println("El pedido ya ha sido realizado. No puede realizar un pedido en estado de devolución.");
    }

    @Override
    public void pagar() {
        System.out.println("El pedido ya ha sido pagado. No se puede pagar nuevamente en estado de devolución.");
    }

    @Override
    public void preparar() {
        System.out.println("El pedido no puede ser preparado nuevamente en estado de devolución.");
    }

    @Override
    public void enviar() {
        System.out.println("El pedido no puede ser enviado en estado de devolución.");
    }

    @Override
    public void devolver() {
        // Comportamiento de devolución, si se requiere alguna acción adicional
        System.out.println("Procesando la devolución del pedido.");
    }

    @Override
    public void cancelarEnvio() {
        System.out.println("No se puede cancelar el envío, el pedido está en proceso de devolución.");
    }

    @Override
    public void consultar() {
        System.out.println("El pedido está en proceso de devolución.");
    }

    @Override
    public void recibir() {
        System.out.println("El pedido no se puede recibir ya que se ha cancelado.");
    }
}

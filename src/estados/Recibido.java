package estados;

import main.Pedido;

public class Recibido implements EstadoPedido {
    private Pedido pedido;

    public Recibido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void realizarPedido() {
        System.out.println("El pedido ya ha sido realizado y recibido. No se puede realizar nuevamente.");
    }

    @Override
    public void pagar() {
        System.out.println("El pedido ya ha sido pagado y recibido. No se puede pagar nuevamente.");
    }

    @Override
    public void preparar() {
        System.out.println("El pedido ya ha sido preparado y recibido. No se puede preparar nuevamente.");
    }

    @Override
    public void enviar() {
        System.out.println("El pedido ya ha sido enviado y recibido. No se puede enviar nuevamente.");
    }

    @Override
    public void devolver() {
        System.out.println("Procesando la devolución del pedido.");
        pedido.setEstado(pedido.getCancelado());  // Cambiar al estado Devolución
    }

    @Override
    public void cancelarEnvio() {
        System.out.println("El pedido ha sido recibido, no se puede cancelar el envío.");
    }

    @Override
    public void consultar() {
        System.out.println("El pedido ha sido recibido satisfactoriamente.");
    }

    @Override
    public void recibir() {
        System.out.println("El pedido ya ha sido recibido!");
    }
}

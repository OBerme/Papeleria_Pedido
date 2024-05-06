package main;

import estados.*;

public class Pedido {
    // Estados
    private EstadoPedido realizacion,pagado,preparado,enviado,recibido,cancelado;

    // Estado actual
    private EstadoPedido estadoActual;

    public Pedido() {
        // Inicializar los estados con referencia a este pedido
        realizacion = new Realizacion(this);
        pagado = new Pagado(this);
        preparado = new Preparado(this);
        enviado = new Enviado(this);
        recibido = new Recibido(this);
        cancelado = new Cancelado(this);

        this.estadoActual = realizacion;
    }

    // Métodos para cambiar el estado
    public void setEstado(EstadoPedido nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Delegar comportamientos al estado actual
    // Métodos delegados al estado actual
    public void realizarPedido() { estadoActual.realizarPedido(); }
    public void pagar() { estadoActual.pagar(); }
    public void preparar() { estadoActual.preparar(); }
    public void enviar() { estadoActual.enviar(); }
    public void devolver() { estadoActual.devolver(); }
    public void recibir() { estadoActual.recibir(); }
    public void cancelarEnvio() { estadoActual.cancelarEnvio(); }
    public void consultar() { estadoActual.consultar(); }

    public EstadoPedido getRealizacion() { return realizacion; }
    public EstadoPedido getPagado() { return pagado; }
    public EstadoPedido getPreparado() { return preparado; }
    public EstadoPedido getEnviado() { return enviado; }
    public EstadoPedido getRecibido() { return recibido; }
    public EstadoPedido getCancelado() { return cancelado; }

}

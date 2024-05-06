package estados;

public interface EstadoPedido {
    void realizarPedido();
    void pagar();
    void preparar();
    void enviar();
    void devolver();
    void cancelarEnvio();
    void consultar();
    void recibir();
}


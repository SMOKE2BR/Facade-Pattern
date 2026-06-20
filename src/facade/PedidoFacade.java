package facade;

public class PedidoFacade {
    public boolean verificarPendenciasCheckout(Cliente cliente) {
        if (Estoque.getInstancia().verificarClienteComPendencia(cliente)) {
            System.out.println("Cliente possui pendência no estoque.");
            return false;
        }
        if (Pagamento.getInstancia().verificarClienteComPendencia(cliente)) {
            System.out.println("Cliente possui pendência no pagamento.");
            return false;
        }
        if (Entrega.getInstancia().verificarClienteComPendencia(cliente)) {
            System.out.println("Cliente possui pendência na entrega.");
            return false;
        }
        System.out.println("Cliente sem pendências. Pedido liberado!");
        return true;
    }
}

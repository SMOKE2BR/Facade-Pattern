package facade;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean finalizarPedido() {
        PedidoFacade facade = new PedidoFacade();
        return facade.verificarPendenciasCheckout(this);
    }

    @Override
    public String toString() {
        return nome;
    }
}

package facade;

public class Main {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Vinícius");
        Cliente cliente2 = new Cliente("Maria");

        Pagamento.getInstancia().addClientePendente(cliente2);

        System.out.println("Finalizando pedido de " + cliente1.getNome() + ":");
        cliente1.finalizarPedido();

        System.out.println("\nFinalizando pedido de " + cliente2.getNome() + ":");
        cliente2.finalizarPedido();
    }
}

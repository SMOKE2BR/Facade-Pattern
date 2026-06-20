package facade;

public class Pagamento extends Departamento {
    private static Pagamento instancia;

    private Pagamento() {}

    public static Pagamento getInstancia() {
        if (instancia == null) {
            instancia = new Pagamento();
        }
        return instancia;
    }
}

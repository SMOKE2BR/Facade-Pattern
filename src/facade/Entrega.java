package facade;

public class Entrega extends Departamento {
    private static Entrega instancia;

    private Entrega() {}

    public static Entrega getInstancia() {
        if (instancia == null) {
            instancia = new Entrega();
        }
        return instancia;
    }
}

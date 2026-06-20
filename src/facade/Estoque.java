package facade;

public class Estoque extends Departamento {
    private static Estoque instancia;

    private Estoque() {}

    public static Estoque getInstancia() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }
}

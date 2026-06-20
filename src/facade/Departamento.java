package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {
    protected List<Cliente> clientesComPendencia = new ArrayList<>();

    public void addClientePendente(Cliente cliente) {
        clientesComPendencia.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return clientesComPendencia.contains(cliente);
    }
}

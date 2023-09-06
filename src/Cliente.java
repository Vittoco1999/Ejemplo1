
/**
 *
 * @author victor
 */
public class Cliente {
    
    private String NombreCliente;
    private String TelefonoCliente;
    private String CorreoCliente;
    private int EdadCliente;
    
    //constructores
    
    public Cliente(String NombreCliente, String TelefonoCliente, String CorreoCliente, int EdadCliente) {
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoCliente = CorreoCliente;
        this.EdadCliente = EdadCliente;
    }

    //Gettle and settle
    
    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public void setCorreoCliente(String CorreoCliente) {
        this.CorreoCliente = CorreoCliente;
    }

    public int getEdadCliente() {
        return EdadCliente;
    }

    public void setEdadCliente(int EdadCliente) {
        this.EdadCliente = EdadCliente;
    }

    //override
    
    @Override
    public String toString() {
        return "Cliente{" + "NombreCliente=" + NombreCliente + ", TelefonoCliente=" + TelefonoCliente + ", CorreoCliente=" + CorreoCliente + ", EdadCliente=" + EdadCliente + '}';
    }
  
}

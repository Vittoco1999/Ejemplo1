
/**
 *
 * @author victor
 */
public class Producto {
    
    
    private String nombreProducto;
    private int precioProducto;
    private int cantidadProducto;
    private int totalCompra;

    
    //constructor
    
    public Producto(String nombreProducto, int precioProducto, int cantidadProducto, int totalCompra) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.totalCompra = totalCompra;
    }
    
    //getter and settler

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }

    //override
    
    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", cantidadProducto=" + cantidadProducto + ", totalCompra=" + totalCompra + '}';
    }
       
    
}

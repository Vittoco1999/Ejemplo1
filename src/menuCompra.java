import java.util.Scanner;

/**
 *
 * @author victo
 */
public class menuCompra {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("-------------Menu-------------");
            System.out.println("   ");
            System.out.println("Eliga la opcion valida");
            System.out.println("   ");
            System.out.println("1.- Registrar Cliente ");
            System.out.println("2.- Registrar Producto ");
            System.out.println("3.- Realizar compra ");
            System.out.println("4.- Consultar datos ");
            System.out.println("5.- Salir ");
            System.out.println("   ");
            System.out.println("Seleccione una opcion");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                
                case 1: 
                    System.out.print("Ingrese el nombre del cliente: ");
                    String NombreCliente = scanner.next();
                    System.out.print("Ingrese el telefono del cliente: ");
                    int NumeroTelefono = scanner.nextInt();
                    System.out.print("Ingrese el correo del cliente: ");
                    String CorreoCliente = scanner.next();
                    System.out.print("Ingrese la edad del cliente: ");
                    int EdadCliente = scanner.nextInt();
                    System.out.println("Cliente registrado con éxito.");
                    break;
                    
                case 2:
                    System.out.println("Ingrese el nombre del producto");
                    String nombreProducto = scanner.next();
                    System.out.println("ingrece el precio del producto");
                    int precioProducto = scanner.nextInt();
                    System.out.println("Ingrese la cantidad llevadas del producto");
                    int cantidadProducto = scanner.nextInt();
                    int subtotal = precioProducto * cantidadProducto;
                break;

                    
                case 3:
                    if (true){
                        int Subtotal = precioProducto * cantidadProducto; 
                        System.out.println("compra realizada con exito" );
                    }else{
                        System.out.println("Primero registre un cliente y un producto");
                    }
                    
                break;
                    
                case 4:
                break;
                    
                case 5:
                break;
                
                default:
                    System.out.println("Opcion no valida,Intente nuevamente");
                    break;
            }
            
            
        }
        
        
    }
    
    
}


package tienda;

import java.util.ArrayList;

/**
 * Es una clase que relaciona a cada usuario con sus compras
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Factura {
    public String nombreCliente;
    public User user;
    public float total;
    public ArrayList<String> cuenta = new ArrayList<>();
    
    public int ultimoArticuloVendido;
    public int cantidadVendida;
    
    public Factura(User user){
        total = 0;
        this.user = user;
        this.nombreCliente = user.getNombre();
    }
    
    public String imprimirFactura() {
        float descontado = 0;
        float descontado2 = 0;
        
        String factura = "Factura No. " + user.getNoDeCuenta() + '_' + user.getNoDeCompra() + "\n\nCliente: " + nombreCliente + "\narticulosVendidos: " + cuenta + "\n\nSubtotal: $" + total + "\n";
        
        if (user.getCompraParaDescuento() % 5 == 0 && user.getCompraParaDescuento() !=0){         
            descontado = total * Store.DESCUENTO_REGULAR;
            factura = factura + "\nAplica descuento por su quinta compra: -$" + descontado;
            total = total - descontado;
        }else{
            factura = factura + "\nEl descuento se aplica cada 5 compras mayores a $" + Store.COMPRA_MINIMA
                    + "\nÉsta es su compra número " + user.getCompraParaDescuento();
        }
        if (user.isTerceraEdad()){
            descontado2 = total * Store.DESCUENTO_TERCERA_EDAD;
            factura = factura + "\nAplica descuento por pertenecer a la tercera edad: -$" + descontado2;      
            total = total - descontado2;

        }
        
        String totalFinal = "\n\nTotal: $" + total;
        user.addCompra(total);

        return  factura + totalFinal;
    }
 
    
}


package tienda;

import java.util.ArrayList;
import java.util.List;


/**
 * Es una clase que relaciona a cada usuario con sus compras
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Factura {
    public int noFactura, noCuentaCliente;
    public List articulosVendidos;
    public float valorTotal;
    
    public Factura(int noFactura, int noCuentaCliente, ArrayList articulosVendidos){
        this.noFactura = noFactura;
        this.noCuentaCliente = noCuentaCliente;
        List<String> cuenta = new ArrayList();
    }
    
}

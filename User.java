
package tienda;

/**
 * Define a un usuario capaz de realizar compras y guarda registro para poder aplicar descuentos
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class User {
    private int noDeCuenta, noDeCompra, compraParaDescuento;
    private String nombre;
    private boolean terceraEdad;
    

    public User(String nombre, int noDeCuenta, boolean terceraEdad) {
        this.nombre = nombre;        
        this.noDeCuenta = noDeCuenta;
        this.noDeCompra = 0;
        this.compraParaDescuento = 0;
        this.terceraEdad = terceraEdad;    
    }

    public int getNoDeCuenta() {
        return noDeCuenta;
    }

    public int getNoDeCompra() {
        return noDeCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTerceraEdad() {
        return terceraEdad;
    }

    public int getCompraParaDescuento() {
        return compraParaDescuento;
    }
    
    public void addCompra(float total) {
        this.noDeCompra = noDeCompra++;
        if (total >= Store.COMPRA_MINIMA){
            compraParaDescuento ++;
        }
    }

    @Override
    public String toString() {
        return "User{" + "noDeCuenta=" + noDeCuenta + ", nombre=" + nombre + ", noDeCompra=" + noDeCompra + ", compraParaDescuento=" + compraParaDescuento + ", terceraEdad=" + terceraEdad + '}';
    }

             
}

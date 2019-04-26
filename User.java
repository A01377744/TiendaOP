
package tienda;

/**
 * Define a un usuario capaz de realizar compras y guarda registro para poder aplicar descuentos
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class User {
    private int noDeCuenta, noDeCompra;
    private String nombre;
    private boolean terceraEdad;

    public User(String nombre, int noDeCuenta, int noDeCompra, boolean terceraEdad) {
        this.nombre = nombre;        
        this.noDeCuenta = noDeCuenta;
        this.noDeCompra = noDeCompra;
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

    public void setNoDeCompra(int noDeCompra) {
        this.noDeCompra = noDeCompra;
    }
    
    public void addCompra() {
        this.noDeCompra = noDeCompra++;
    }

    @Override
    public String toString() {
        return "User{" + "Nombre=" + nombre + ", noDeCuenta=" + noDeCuenta + ", noDeCompra=" + noDeCompra + ", terceraEdad=" + terceraEdad + '}';
    }            
}

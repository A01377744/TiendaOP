
package tienda;

import java.util.ArrayList;

/**
 * Define a una tienda que contiene inventarios y usuarios
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Store {
    private String nombre;
    protected ArrayList<User> usuarios = new ArrayList<>();
    public Inventario[] inventarios;  
    public int TAMAÑO_INVENTARIO = 8;
    private int inventariosDisponibles = 0;
    
    public Store(String nombre){
        this.nombre = nombre;
        inventarios = new Inventario[TAMAÑO_INVENTARIO];

    }

    public String getNombre() {
        return nombre;
    }
    
    public void registrarUsuario(String nombre, int noDeCuenta, int noDeCompra, boolean terceraEdad){
        usuarios.add(new User(nombre, noDeCuenta, noDeCompra, terceraEdad));
    }
    
    public void registrarInventario(String nombre){
        if(inventariosDisponibles<TAMAÑO_INVENTARIO){
            inventarios[inventariosDisponibles] = new Inventario(nombre);
            inventariosDisponibles++;
        }else{
            System.out.println("Se ha alcanzado el máximo de inventarios.");
        }

}
}


package tienda;

/**
 * Define a un artículo no perecedero, no tiene fecha límite para ser vendido.
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Unedible extends Article{
    
    public Unedible(int idArticulo, String nombre, float precio, boolean disponible){
        super(idArticulo, nombre, precio, disponible, null);
    } 
    
}

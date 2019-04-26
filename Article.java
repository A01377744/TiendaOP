
package tienda;



/**
 * Define a un objeto abstracto de tipo artículo
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public abstract class Article {
    protected int idArticulo;
    protected String nombre;
    protected float precio;
    public static final double IVA = 0.16;
    protected boolean disponible;
    public String caducidad;

    public Article(int idArticulo, String nombre, float precio, boolean disponible, String caducidad) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
        this.caducidad = caducidad;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }   

    @Override
    public String toString() {
        return "{idArticulo=" + idArticulo + ", nombre=" + nombre + ", precio=" + precio + ", disponible=" + disponible + ", caducidad=" + caducidad + '}';
    }
    
    
}

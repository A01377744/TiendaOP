
package tienda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Define a un artículo perecedero, tiene una fecha de expiración y deja de estar disponible con el tiempo
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Edible extends Article{
    private Date today = Calendar.getInstance().getTime();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    
    public Edible(int idArticulo, String nombre, float precio, boolean disponible, 
            String caducidad){
        super(idArticulo, nombre,precio,disponible, caducidad);
        
    }
    
    public String getCaducidad(){
        return caducidad;
    }
    
    public Date checarCaducidad() {
        try{
        Date expiracion = sdf.parse(caducidad);
            return expiracion;
        }catch (ParseException e) {
            System.out.println("No es una fecha valida");
            return null;
        }
    }
    
    public String expirar(){
        Date expiracion = checarCaducidad();
        if (expiracion.after(today)) {
            int diasParaExpirar = (int)((expiracion.getTime() - today.getTime()) / 86400000);
            return "El producto: " + nombre + " expirará en " + diasParaExpirar + " días.";
        }
        if (expiracion.before(today)) {
            disponible = false;
            return "El producto " + nombre + " ya expiró, no es posible venderlo.";
        }
        if (expiracion.equals(today)) {
            disponible = false;
            return "El producto " + nombre + " ya expiró, no es posible venderlo.";
        }
        else{ return null;}
     
}
}
    


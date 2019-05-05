
package tienda;

import java.util.ArrayList;

/**
 * Define un conjunto de artículos y los relaciona con la cantidad disponible
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Inventario {
    private String nombre;
    public ArrayList<Article> articulos = new ArrayList<>();
    public ArrayList<Integer> numeroArticulos= new ArrayList<>();
    public ArrayList<Integer> totalArticulos = new ArrayList<>();
    private Factura factura;
    
    
    public Inventario(String nombre){
        this.nombre = nombre;       
    }
    
    public void agregarArticulos(Article article, int cantidad){
        articulos.add(article);
        numeroArticulos.add(cantidad); 
    }
    
    public ArrayList verArticulos(){
        int i = 0;
        for(Article a : articulos){
            totalArticulos.add(articulos.get(i).getIdArticulo());
            totalArticulos.add(numeroArticulos.get(i));
            i++;
        }
        return totalArticulos;
    }
    
    public void venderArticulos(Article article, int cantidad, Factura factura){
        try{
        if (articulos.contains(article) && numeroArticulos.get(articulos.indexOf(article)) != 0){
            int existencias = numeroArticulos.get(articulos.indexOf(article)) - cantidad;
            
            if(existencias >= 0){
        numeroArticulos.set(articulos.indexOf(article), numeroArticulos.get(articulos.indexOf(article)) - cantidad);
        float valor = cantidad * article.getPrecio();        
        factura.cuenta.add(article.getNombre()+ ' ' + cantidad + " $" + valor);
        factura.total = factura.total + valor;
        factura.ultimoArticuloVendido = articulos.indexOf(article);
        this.factura = factura;
        this.factura.cantidadVendida = cantidad;
                
            }else{
                System.out.println("Solo tenemos " + numeroArticulos.get(articulos.indexOf(article)) + " articulos disponibles por el momento");
            }
            
        }else{
            throw new Exception ("No existe artículo!");
           
        }
        }catch(Exception e){
             e.getMessage();
             System.out.println("El artículo no está disponible.");
        }
    }  
    
    public String deshacer(){
        try{
            if (!factura.cuenta.isEmpty()){        
                numeroArticulos.set(factura.ultimoArticuloVendido, numeroArticulos.get(factura.ultimoArticuloVendido) + factura.cantidadVendida);
                factura.total = factura.total - factura.cantidadVendida*articulos.get(factura.ultimoArticuloVendido).getPrecio();
                factura.cuenta.remove(factura.cuenta.size()-1);
                return "Operación exitosa";
            }else{
                return "No hay operaciones por deshacer.";               
            }
            
        }catch (NullPointerException e){
        return "No hay operaciones por deshacer.";
        }
    }    


    public void eliminar(){
        for(Article a : articulos){
            if (a instanceof Edible){
                System.out.println(((Edible)a).expirar());
            }
            if (a.isDisponible() == false){
                numeroArticulos.set(articulos.indexOf(a), 0);
            }            
        }
    }
}

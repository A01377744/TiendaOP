
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
    
    public float venderArticulos(Article article, int cantidad){
        try{
        if (articulos.contains(article) && numeroArticulos.get(articulos.indexOf(article)) != 0){
            int existencias = numeroArticulos.get(articulos.indexOf(article)) - cantidad;
            
            if(existencias > 0){
        numeroArticulos.set(articulos.indexOf(article), numeroArticulos.get(articulos.indexOf(article)) - cantidad);
                return cantidad * article.getPrecio();

            }else{
                System.out.println("Solo tenemos " + numeroArticulos.get(articulos.indexOf(article)) + " articulos disponibles por el momento");
                return 0;
            }
            
        }else{
            throw new Exception("No existe artículo!");
           
        }
        }catch(Exception e){
             e.getMessage();
             System.out.println("El artículo no está disponible.");
             return 0;
        }
    }
    
    
    public void eliminar(){
        for(Article a : articulos){
            if (a.isDisponible() == false){
                numeroArticulos.set(articulos.indexOf(a), 0);
            }            
        }
    }
}

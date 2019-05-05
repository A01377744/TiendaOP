package tienda;

import java.util.Scanner;

/**
 * Es la clase principal del programa
 *
 * @author Saúl Figueroa Conde A01747306 && Alejandro Torices Oliva A01377744.
 */

public class Tienda {
    Scanner s;

    public void iniciarTienda(){
        
    }

    public static void main(String[] args) {
        Store tienda = new Store("La Estación de Paso #99");
        System.out.println("Iniciando… ");
        System.out.println("");       
        
        tienda.registrarUsuario("Juan Perez", 1, false);
        tienda.registrarUsuario("Dominic Santiago", 2, false);
        tienda.registrarUsuario("Marcus Fenix", 3, true);             

        tienda.registrarInventario("Frutas");
        tienda.registrarInventario("Verduras");
        tienda.registrarInventario("Farmacia");
        tienda.registrarInventario("Bebidas");
        tienda.registrarInventario("Productos de limpieza");
        tienda.registrarInventario("Productos enlatados");
        tienda.registrarInventario("Ropa");
        tienda.registrarInventario("Papelería");
        
        Edible f001 = new Edible(101, "manzana", 23, true, "2019-05-28");
        Edible f002 = new Edible(102, "piña", 57.5f, true, "2020-04-28");
        
        tienda.inventarios[1].agregarArticulos(f001, 3);
        tienda.inventarios[1].agregarArticulos(f002, 7);
        
        for(Inventario i :tienda.inventarios){
            i.eliminar();
        }      
        
        System.out.println("Bienvenido a " + tienda.getNombre() + " ¿Qué desea hacer?");
        System.out.println("");
        
        System.out.println("1. Usuario");
        System.out.println("2. Inventario");
        System.out.println("3. Realizar compra");
        System.out.println("4. Salir");
        
        Scanner s = new Scanner(System.in);   
        System.out.println("");
        
        System.out.println(tienda.inventarios[1].articulos);
        System.out.println(tienda.inventarios[1].numeroArticulos);

        int opcion = s.nextInt();
        if (opcion !=4){
            switch (opcion) {
                case 1:
                    System.out.println("1. Ver usuarios");
                    System.out.println("2. Registrar nuevo usuario");
                    System.out.println("");
                                        
                    break;
                case 2:
                    System.out.println("1. Ver inventario");
                    System.out.println("2. Registrar artículo");
                    System.out.println("3. ");
                    System.out.println("");
                    
                    System.out.println(tienda.inventarios[1].verArticulos());

                    break;
                case 3:
                    System.out.println("Seleccione un usuario.");
                    System.out.println("");
                    
                    int i = 0;
                    for (User u : tienda.usuarios){
                        System.out.println(i + ". " + u.getNombre());
                        i++;                      
                    }
                            Factura factura1 = new Factura(tienda.usuarios.get(1));

                            tienda.inventarios[1].venderArticulos(f002, 7, factura1);
                            tienda.inventarios[1].venderArticulos(f002, 10, factura1); 
                            
                                    
                            System.out.println(factura1.imprimirFactura());

                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    System.out.println("");
                    break;
            }
        }             
                
        System.out.println("");
        System.out.println("¡Adiós! ");     
             
    }
    
}

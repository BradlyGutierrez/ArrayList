package ejemploarraylist;

import java.util.ArrayList;

public class EjemploArrayList {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaramos nuestra ArrayList
    ArrayList<String> apellidos; 
    ArrayList<String> nombres;
    
        
        // Creamos la instancia para poder utilizar nuestra variable
    nombres = new ArrayList();
    apellidos = new ArrayList();
        // Agragamos los elementos de nuestra cadena 
    nombres.add("Harry");
    nombres.add("Eliseo");
    nombres.add("Bradly");
    nombres.add("Andre");
    apellidos.add("Bodan");
    apellidos.add("Paz");
    apellidos.add("Gutierrez");
    apellidos.add("Joiner");
      
        
       // Recorremos el Arraylist con un for
    for (int i = 0; i < nombres.size(); i++){
        System.out.println("-->"+nombres.get(i)+(" ")+apellidos.get(i));
    }
      // Eliminar elementos de la Arraylist
      
    nombres.remove(2); apellidos.remove(2);
    for (int i = 0; i < nombres.size(); i++){
        System.out.println("--+"+nombres.get(i)+(" ")+apellidos.get(i));
    }
    //Metodo size, indica el numero de elementos de la lista
    
        System.out.println("numero de nombres: ");
        System.out.println(nombres.size());
        System.out.println("numero de apellidos. ");
        System.out.println(apellidos.size());
        
    //Metodo indexOf, util para saber la posicion de un elemento
         
        System.out.println("Ubicacion de Harry Bodan: ");
        System.out.println(nombres.indexOf("Harry")+ apellidos.indexOf("Bodan"));
        
        
    }
    
}

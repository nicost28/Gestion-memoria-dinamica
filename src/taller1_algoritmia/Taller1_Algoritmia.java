/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_algoritmia;

/**
 *
 * @author Nico
 */
public class Taller1_Algoritmia {

    //Main del ejercicio 1
    public void inicioEj1(){
        //Creación objeto lista
        Llista lista = new Llista();
        //Recuento del número de nodos de la lista
        int numeroNodos = 0;
        
        int info;
        
        System.out.println("¿Cuantos nodos deseas que haya en la lista?");
        numeroNodos=LT.readInt();
        
        for (int i = 0; i < numeroNodos; i++) {
            System.out.println("Introduce datos del nodo" + (i + 1) + " : ");
            info = LT.readInt();
            lista.incluirElement(info);
        }
        
        Boolean fin = false;
        while (!fin) {
            int posNodo;
            int infoNouNode;
            System.out.println("Introduce el número del nodo para insertar delante de el: ");
            posNodo = LT.readInt();
            System.out.println("Introduce el INFO que va a tener el nuevo nodo: ");
            infoNouNode = LT.readInt();
            lista.incluirElementESQ(posNodo, infoNouNode);
            numeroNodos++;
            System.out.println("La lista queda de la siguiente forma: ");
            
            System.out.println(lista.toString());
            System.out.println("¿Continuar? (s/n)");
            char a = LT.readChar();
            if (a == 's') {
                fin = false;
            } else {
                fin = true;
            }
        }     
    }
    
    //Main del ejercicio 2
    public void inicioEj2(){
        //Creación objeto lista
        Llista lista = new Llista();
        //Recuento del número de nodos de la lista
        int numeroNodos = 0;
        
        int info;
        
        System.out.println("¿Cuantos nodos deseas que haya en la lista?");
        numeroNodos=LT.readInt();
        
        for (int i = 0; i < numeroNodos; i++) {
            System.out.println("Introduce datos del nodo" + (i + 1) + " : ");
            info = LT.readInt();
            lista.incluirElement(info);
        }
        
        Boolean fin = false;
        while (!fin) {
            int posNodo;
            System.out.println("Introduce el INFO del nodo del cual quieres ELIMINAR: ");
            posNodo = LT.readInt();
            Llista listaEliminada = lista.eliminarNode(posNodo);
            numeroNodos--;
            System.out.println("La lista queda de la siguiente forma: ");          
            System.out.println(lista.toString());
            
            System.out.println("Lista ELIMINADA:");
            System.out.println(listaEliminada);
            System.out.println("¿Continuar? (s/n)");
            char a = LT.readChar();
            if (a == 's') {
                fin = false;
            } else {
                fin = true;
            }
        }
    }
    
    //Main del ejercicio 3
    public void inicioEj3(){
        //Creación objeto lista
        Llista lista = new Llista();
        //Recuento del número de nodos de la lista
        int numeroNodos = 0;
        
        int info;
        
        System.out.println("¿Cuantos nodos deseas que haya en la lista?");
        numeroNodos=LT.readInt();
        
        for (int i = 0; i < numeroNodos; i++) {
            System.out.println("Introduce datos del nodo" + (i + 1) + " : ");
            info = LT.readInt();
            lista.incluirElement(info);
        }
        
        Boolean fin = false;
        while (!fin) {
            lista.ordenacioLlista(numeroNodos);
            System.out.println("Esta es la lista ya ordenada:");
            System.out.println(lista.toString());
            System.out.println("Introduce la INFO del nodo que quieras insertar de forma ordenada");
            int posNodo;
            posNodo = LT.readInt();
            lista.insercioNode(posNodo);
            numeroNodos++;
            System.out.println("La lista queda de la siguiente forma: ");
            
            System.out.println(lista.toString());
            System.out.println("¿Continuar? (s/n)");
            char a = LT.readChar();
            if (a == 's') {
                fin = false;
            } else {
                fin = true;
            }
        }
    }
    public static void main(String[] args) {
        new Taller1_Algoritmia().inicioEj3();
    }
    
}

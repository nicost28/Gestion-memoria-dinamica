/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_algoritmia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nico
 */
public class Llista {
    //ATRIBUTOS
    private Node capçalera;

    
    //CONSTRUCTOR
    public Llista() {
        capçalera = null;
    }

    //Método incluirElement que introduce nodos al final de la lista
    public void incluirElement(int dades) {
        //Crea nodo "element" con campo dades (info)
        Node element = new Node(dades);
        //Si no hay ningun nodo
        if (capçalera == null) {
            //Será el primero y capçalera apuntará a el
            capçalera = element;
        } 
        //Sino
        else {
            Node aux;
            //Se recorrerá toda la lista...
            for (aux = capçalera; aux.agafar() != null; aux = aux.agafar());
                //Y será el último nodo de ella
                aux.afeigir(element);
        }
    }


    //Método incluirElementESQ que introduce nodos a la izquierda de uno dado
    public void incluirElementESQ(int numNod, int infoNouNode) {
        //Crea nodo "nounode"
        Node nounode = new Node(numNod);
        //Crea nodo "aux"
        Node aux = capçalera;
        //Si no es el primer elemento...
        if(numNod!=1){
        //Se recorre la lista hasta encontrar el elemento con posición numNode - 1
        for (int i = 1; i < numNod - 1; i++) {
            aux = aux.agafar();
        }
        nounode.setSeguent(aux.seguent);
        nounode.setInfo(infoNouNode);
        aux.setSeguent(nounode);
        }else{
            nounode.setSeguent(aux);
            nounode.setInfo(infoNouNode);
            capçalera = nounode;
        }
    }

    //Método eliminarNode que elimina un nodo de una lista
    public Llista eliminarNode(int numNod) {
        Node aux = capçalera;
        int i = 0;
        Llista lliures;
        Node auxAnterior = new Node(0);
        Boolean sortir = false;
        while (!sortir) {
            if (aux.info == numNod) {
                sortir = true;
            } else {
                auxAnterior = aux;
                aux = aux.agafar();
            }
            i++;
        }
        if (i != 1) {
            auxAnterior.setSeguent(aux.seguent);
            lliures = new Llista();
            aux.setSeguentNIL();
            lliures.incluirElement(aux.getInfo());
        } else {
            auxAnterior = aux;
            aux = aux.agafar();
            lliures = new Llista();
            auxAnterior.setSeguentNIL();
            lliures.incluirElement(auxAnterior.getInfo());
            capçalera = aux;
        }
        return lliures;
    }
    public void insercioNode(int numNod){
        Node nounode = new Node(numNod);
        Node aux=capçalera;
        Node aux2 = aux.agafar();
        Boolean fin = false;
        while(aux.seguent!=null && !fin){
            if(aux.info<=numNod && aux2.info>=numNod){
                nounode.setSeguent(aux.seguent);
                aux.setSeguent(nounode);
                fin = true;
            }else if(aux==capçalera && aux.info>=numNod){
                nounode.setSeguent(aux);
                capçalera=nounode;            
                fin = true;
            }
            aux = aux2;
            aux2 = aux2.agafar();
        }
        //Si se llega al final y todavia no se ha insertado
        if(aux.info<numNod){
            aux.afeigir(nounode);
        }
    }

    public void ordenacioLlista(int numNod) {
        Node aux = capçalera;
        Node auxAnterior2 = aux;
        aux = aux.agafar();
        Node auxAnterior = aux;
        aux = aux.agafar();
        for (int i = 0; i < numNod - 1; i++) {
            for (int j = 0; j < numNod - 1; j++) {
                if (j == 0) {
                    if (auxAnterior.info < auxAnterior2.info) {
                        Node apuntador = auxAnterior;
                        auxAnterior2.setSeguent(auxAnterior.seguent);
                        auxAnterior.setSeguent(capçalera);
                        capçalera = apuntador;
                        Node auxiliar = auxAnterior;
                        auxAnterior = auxAnterior2;
                        auxAnterior2 = auxiliar;
                    }
                } else {
                    if (aux.info < auxAnterior.info) {
                        Node apuntador = auxAnterior;
                        auxAnterior2.setSeguent(auxAnterior.seguent);
                        auxAnterior.setSeguent(aux.seguent);
                        aux.setSeguent(apuntador);
                        Node auxiliar = aux;
                        aux = auxAnterior;
                        auxAnterior = auxiliar;
                        auxAnterior2 = auxAnterior;
                        auxAnterior = aux;
                        if(aux.agafar()!=null){
                            aux = aux.agafar();  
                        }  
                    }
                }
            } 
        aux = capçalera;
        auxAnterior2 = aux;
        aux = aux.agafar();
        auxAnterior = aux;
        aux = aux.agafar();
        }
    }

    @Override
    public String toString() {
        Node aux;
        String res = "";
        for (aux = capçalera; aux.agafar() != null; aux = aux.agafar()) {
            res += aux.toString();
        }
        res += aux.toString();
        return res;
    }
    }
    
   


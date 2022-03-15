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
public class Node {
    //ATRIBUTS
    //Camp info del node
    public int info;
    //Apuntador del seguent node de la llista
    public Node seguent;
    
    //CONTRUCTOR
    public Node(int dades) {
        info=dades;
        seguent=null;
} 
    
    //Métode que insereix un node a l'últim node de la llista
    public void afeigir(Node seguent_node) {
           seguent=seguent_node;
} 
    
    //Métode Get que retorna el info d'un node
    public int getInfo() {
        return info;
    }
    //Métode Get que retorna la posició d'un node de la llista
    public Node agafar() {
        return seguent;
    }
    
    public void setInfo(int info) {
        this.info = info;
    }

    public void setSeguent(Node seguent) {
        this.seguent = seguent;
    }
    
    public void setSeguentNIL(){
        seguent = null;
    }
    
    //Métode toString per representar 
    @Override
    public String toString() {
        return "NODE\n"
              +"INFO: "+info+"\n-------\n";
    }
  
}

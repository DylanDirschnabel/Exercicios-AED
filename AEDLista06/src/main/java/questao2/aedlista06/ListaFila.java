/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.aedlista06;

import questao1.aedlista06.Fila;
import questao1.aedlista06.FilaVaziaException;

/**
 *
 * @author User
 */
public class ListaFila<T> implements Fila<T>{
    ListaEncadeada lista = new ListaEncadeada();
    
    public void inserir(Object valor) {
        lista.inserirNoFinal(valor);
    }
    
    public boolean estaVazia() {
        return lista.estaVazia();
    }
    
    public T peek() {
        if(lista.estaVazia()) {
            throw new FilaVaziaException("Lista vazia!");
        }
        return (T) lista.getPrimeiroNodo().getInfo();
    }
    
    public T retirar() {
        return (T) lista.retirar();
    }
    
    public void liberar() {
        lista = new ListaEncadeada();
    }
    
    public String toString() {
        return lista.toString();
    }
}

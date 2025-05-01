/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.aedlista05;

import questao1.aedlista05.Pilha;
import questao1.aedlista05.PilhaVaziaException;

/**
 *
 * @author User
 */
public class PilhaLista<T> extends ListaEncadeada {
    public void push(T info) {
        super.inserir(info);
    }
    
    public T pop() {
        if(super.estaVazia()) {
            throw new PilhaVaziaException("Pilha vazia!");
        }
        NoLista p = super.getPrimeiroNodo();
        retirar(p.getInfo());
        return (T) p.getInfo();
    }
    
    public T peek() {
        if(super.estaVazia()) {
            throw new PilhaVaziaException("Pilha vazia!");
        }
        return (T) super.getPrimeiroNodo().getInfo();
    }
    
    @Override
    public boolean estaVazia() {
        return super.getPrimeiroNodo() == null;
    }
    
    public void liberar() {
        NoLista<T> atual = super.getPrimeiroNodo();
        NoLista<T> posterior;
        
        while(atual != null) {
            posterior = atual.getProximoNodulo();
            atual.setProximoNodulo(null);
            atual = posterior;
        }
        super.setPrimeiroNodo(null);
        
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}

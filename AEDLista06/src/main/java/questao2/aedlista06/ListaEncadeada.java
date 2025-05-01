/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.aedlista06;

import questao1.aedlista06.FilaVaziaException;

/**
 *
 * @author User
 */
public class ListaEncadeada <T> {
    
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    /**
     * @return the primeiroNodo
     */
    public NoLista<T> getPrimeiroNodo() {
        return primeiro;
    }
   
    public ListaEncadeada() {
        primeiro = null;
        ultimo = null;
    }

   
    public void exibir() {
        NoLista<T> p = primeiro;
        while(p != null) {
            System.out.println(p.getInfo().toString());
            p = p.getProximoNodulo();
        }
    }
   
    public boolean estaVazia() {
        return primeiro == null;
    }
   
    public NoLista<T> buscar(T v) {
        NoLista<T> p = primeiro;
        while(p != null) {
            if(p.getInfo().equals(v)) {
                return p;
            }
            p = p.getProximoNodulo();
        }
        return null;
    }
   
    public T retirar() {
        if(primeiro == null) {
            throw new FilaVaziaException("Fila Vazia!");
        } 
        NoLista<T> p = primeiro;
        primeiro = p.getProximoNodulo();
        p.setProximoNodulo(null);
       return p.getInfo();
    }
   
    public int obterComprimento() {
        int contagem = 0;
        NoLista<T> p = primeiro;
        while(p != null) {
            contagem++;
            p = p.getProximoNodulo();
        }
        return contagem;
    }
   
    public NoLista<T> obterNo(int idx) {
        if(idx < 0 || primeiro == null) {
            throw new IndexOutOfBoundsException();
        }
        
        NoLista<T> p = primeiro;
        while(idx != 0 && p.getProximoNodulo() != null) {
            p = p.getProximoNodulo();
            idx --;
        }
        if(idx != 0) {
            throw new IndexOutOfBoundsException();
        }
        return p;
    }
   
    @Override
    public String toString() {
        String texto = "";
        if(!estaVazia()) {
            texto += primeiro.getInfo().toString();
            NoLista<T> p = primeiro.getProximoNodulo();
            while(p != null) {
                texto += ",";
                texto += p.getInfo().toString();
                p = p.getProximoNodulo();
            }
        }
       
        return texto;
    }   
    
    public void inserir(T info) {
        NoLista<T> novo = new NoLista();
        novo.setInfo(info);
        novo.setProximoNodulo(primeiro);
        primeiro = novo;
    }
    
    public void inserirNoFinal(T valor) {
        NoLista<T> p = new NoLista();
        p.setInfo(valor);
        if(primeiro == null) {
            primeiro = p;
            ultimo = p;
        } else {
            ultimo.setProximoNodulo(p);
            ultimo = p;
        }
    }
    
}

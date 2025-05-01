/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista05;

/**
 *
 * @author User
 */
public class PilhaVetor<T> implements Pilha{
    private Object info[];
    private int limite;
    private int tamanho;
    
    public int getTamanho() {
        return tamanho;
    }
    
    public PilhaVetor(int limite) {
        this.limite = limite;
        info =  new Object[limite];
        tamanho = 0;
    }
    
    public void push(Object info) {
        if(tamanho == limite) {
            throw new PilhaCheiaException("Pilha cheia!");
        }
        this.info[tamanho] = info;
        tamanho++;
    }
    
    public T peek() {
        if(estaVazia()) {
            throw new PilhaVaziaException("Pilha vazia!");
        }
        return (T) info[tamanho - 1];
    }
    
    public T pop() {
        if(estaVazia()) {
            throw new PilhaVaziaException("Pilha vazia!");
        }
        T tmp = (T) info[tamanho - 1];
        info[tamanho - 1] = null;
        tamanho--;
        return tmp;
    }
    
    public boolean estaVazia() {
        return tamanho == 0;
    }
    
    public void liberar() {
        for(int i = 0; i < tamanho; i++) {
            info[i] = null;
        }
        tamanho = 0;
    }
    
    @Override
    public String toString() {
        String texto = "";
        for(int i = tamanho; i > 0; i--){
            texto+= info[i - 1];
            if(i != 1) {
                texto += ",";
            }
        }
        return texto;
    }
    
    public void concatenar(PilhaVetor<T> p) {
        if(limite < tamanho + p.getTamanho()) {
            throw new IllegalArgumentException("Tamanho insuficiente!");
        }
        int tmp = p.getTamanho();
        for(int i = tamanho + p.getTamanho() - 1; i >= tamanho; i--) {
            info[i] = p.pop();
        }
        tamanho += tmp;

    }
    
}

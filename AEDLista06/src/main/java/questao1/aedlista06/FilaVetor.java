/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista06;

/**
 *
 * @author User
 */
public class FilaVetor<T> implements Fila<T>{
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;
    
    public FilaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        tamanho = 0;
        inicio = 0;
    }
    
    public void inserir(T valor) {
        if(limite == tamanho) {
            throw new FilaCheiaException("Fila cheia!");
        }
        info[(inicio + tamanho) % limite] = valor;
        tamanho++;
    }
    
    public boolean estaVazia() {
        //return tamanho == 0;
        return info[inicio] == null;
    }
    
    public T peek() {
        if(estaVazia()) {
            throw new FilaVaziaException("Fila Vazia!");
        }
        return (T) info[inicio];
    }
    
    public T retirar() {
        if(estaVazia()) {
            throw new FilaVaziaException("Fila Vazia!");
        }
        T valor =(T) info[inicio];
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
            
    }
    
    public void liberar() {
        info = new Object[limite];
        tamanho = 0;
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor(this.limite + f2.limite);
        for(int i = 0; i < this.tamanho; i++) {
            f3.inserir((T) info[(i + this.inicio) % this.limite]);
        }
        for(int i = 0; i < f2.tamanho; i++) {
            f3.inserir((T) f2.info[(i + f2.inicio) % f2.limite]);
        }
        return f3; 
    }
    
    @Override
    public String toString() {
        String  texto = "";
        for(int i = 0; i < tamanho; i++) {
            if(i != 0) {
                texto += ",";
            }
            texto += info[(inicio + i) % limite].toString();    
        }
        return texto;
    }
    
    public int getLimite() {
        return limite;
    }

    
}

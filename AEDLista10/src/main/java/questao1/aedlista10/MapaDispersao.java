/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista10;

import listaEncadeada.ListaEncadeada;
import listaEncadeada.NoLista;

/**
 *
 * @author User
 */
public class MapaDispersao<T> {
    private ListaEncadeada<NoMapa<T>>[] info;
    
    public MapaDispersao(int tamanho) {
        if(tamanho < 1) {
            throw new IllegalArgumentException("Tamanho inválido");
        }
        info = new ListaEncadeada[tamanho];
    }
    
    private int calcularHash(int chave) {
        return chave % info.length;
    }
    
    public void inserir(int chave, T dado) {
        int hash = calcularHash(chave);
        
        if(info[hash] == null) {
            info[hash] = new ListaEncadeada();
        }
        NoMapa<T> no = new NoMapa();
        no.setValor(dado);
        no.setChave(chave);
        
        info[hash].inserir(no);
            
    }
    
    public T buscar(int chave) {
        int hash = calcularHash(chave);
        NoMapa<T> no = new NoMapa();
        no.setChave(chave);
        
        NoLista<NoMapa<T>> no2 = info[hash].buscar(no);
        if(no2 != null) {
            return no2.getInfo().getValor();
        }
        return null;
    }
    
    public void remover(int chave) {
        /*
        int hash = calcularHash(chave);
        NoLista<NoMapa<T>> p = info[hash].getPrimeiroNodo();
        while(p.getInfo() != null) {
            if(p.getInfo().getChave() == chave) {
                info[hash].retirar(p.getInfo());
                return;
            }
            p = p.getProximoNodulo();
        }
        */
        
        int hash = calcularHash(chave);
        NoMapa<T> no = new NoMapa();
        no.setChave(chave);
        
        NoLista<NoMapa<T>> no2 = info[hash].buscar(no);
        if(no2.getInfo() != null) {
            info[hash].retirar(no2.getInfo());
        }

    }
    
    public double calcularFatorCarga() {
        int n = 0; //Quantidade dados armazenados
        int m = info.length; //Tamanho vetor;
        
        for(int i = 0; i < m; i++) {
            if(info[i] != null) {
                n += info[i].obterComprimento();
            }
            
        }
        return n/m;
    }
    
    
}

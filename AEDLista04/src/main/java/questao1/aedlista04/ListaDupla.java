    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista04;

/**
 *
 * @author User
 */
public class ListaDupla<T> {
      private NoListaDupla primeiro;
   
    /**
     * @return the primeiro
     */
    public NoListaDupla getPrimeiro() {
        return primeiro;
    }
   
    public ListaDupla() {
        primeiro = null;
    }
   
    public void inserir(T valor) {
        NoListaDupla<T> p = new NoListaDupla();
        p.setInfo(valor);
       
        p.setProximo(primeiro);
        if(primeiro != null) {
            primeiro.setAnterior(p);
        }
        primeiro = p;
       
    }
   
    public NoListaDupla<T> buscar(T v) {
        NoListaDupla<T> p = primeiro;
        while(p != null) {
            if(p.getInfo().equals(v)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }
   
    public void retirar(T v) {
        NoListaDupla<T> p = buscar(v);
       
        if(p != null) {
            if(p == primeiro) {  
                primeiro = p.getProximo();
                if(primeiro != null) {
                    primeiro.setAnterior(null);
                }
            } else {
               if(p.getProximo() != null) {
                    p.getProximo().setAnterior(p.getAnterior());
               }
               p.getAnterior().setProximo(p.getProximo());
            }
        }

       
    }
   
    public void exibir() {
        NoListaDupla<T> p = primeiro;
        while(p != null) {
            System.out.println(p.getInfo().toString());
            p = p.getProximo();
        }
    }
   
    public void exibirOrdemInversa() {
        NoListaDupla<T> p = primeiro;
        if(p == null) {
            return;
        }
        
        while(p.getProximo() != null) {
            p = p.getProximo();
        }
       
        while(p != null) {
            System.out.println(p.getInfo().toString());
            p = p.getAnterior();
        }
    }
   
    public void liberar() {
        NoListaDupla<T> p = primeiro;
        NoListaDupla<T> anterior;

        while(p != null) {
            p.setAnterior(null);
            anterior = p;
            p = p.getProximo();
            anterior.setProximo(null);
        }
        primeiro = null;
    }
    
    @Override
    public String toString() {
        String texto = "";
        if(primeiro != null) {
            texto += primeiro.getInfo().toString();
            NoListaDupla<T> p = primeiro.getProximo();
            while(p != null) {
                texto += ",";
                texto += p.getInfo().toString();
                p = p.getProximo();
            }
        }
       
        return texto;
    }
}
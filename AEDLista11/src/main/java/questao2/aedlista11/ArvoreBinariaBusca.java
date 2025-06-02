/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.aedlista11;

/**
 *
 * @author User
 */
public class ArvoreBinariaBusca<T extends Comparable<T>>  extends ArvoreBinariaAbstract<T> {
    
    public void inserir(T info) {
        NoArvoreBinaria no = new NoArvoreBinaria(info);
        
        if(super.getRaiz() == null) {
            super.setRaiz(no);
            return;
        }
        
        /*
        NoArvoreBinaria p = super.getRaiz();
        NoArvoreBinaria o = super.getRaiz();
        
        while(p != null) {
            o = p;
            if(info.compareTo( (T) p.getInfo()) == -1 ) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        
        if(info.compareTo( (T) o.getInfo()) == -1 ) {
                o.setEsquerda(no);
        } else {
                o.setDireita(no);
        }
        */
        
        NoArvoreBinaria p = super.getRaiz();
        
        while(true) {
            NoArvoreBinaria pai = p;
            if(info.compareTo( (T) p.getInfo()) == -1 ) {
                p = pai.getEsquerda();
                if(p == null) {
                    pai.setEsquerda(no);
                    return;
                }
            } else {
                p = pai.getDireita();
                if(p == null) {
                    pai.setDireita(no);
                    return;
                }
            }
        }
        
    }
    
    public NoArvoreBinaria<T> buscar(T info) {
        NoArvoreBinaria p = super.getRaiz();
        
        while(p != null) {
            if(info.compareTo( (T) p.getInfo()) == -1 ) {
                p = p.getEsquerda();
            } else if(info.compareTo( (T) p.getInfo()) == 1 ) {
                p = p.getDireita();
            } else {
                return p;
            }
        }
        
        return null;
    }
}

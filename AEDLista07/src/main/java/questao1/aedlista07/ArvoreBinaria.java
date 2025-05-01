/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista07;

/**
 *
 * @author User
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;
    
    public ArvoreBinaria() {
        raiz = null;
    }
    
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean estaVazia() {
        return raiz == null;
    }
    
    public boolean pertence(T info) {
        return pertence(info, raiz);
    }
    
    private boolean pertence(T info, NoArvoreBinaria<T> no) {
        if(no == null) {
            return false;
        } else {
            return (info == no.getInfo()) || (pertence(info, no.getDireita())) || (pertence(info, no.getEsquerda()));
        }
    }
    
    public String toString() {
        return arvorePre(raiz);
    }
    
    private String arvorePre(NoArvoreBinaria<T> no) {
        String texto = "<";
        if(no == null) {
            return texto + ">";
        }
        texto += no.getInfo();
        texto += arvorePre(no.getEsquerda());
        texto += arvorePre(no.getDireita());
        
        return texto + ">";
    }
    

    public void inverter() {
        this.inverter(raiz);
    }
    
    private void inverter(NoArvoreBinaria no) {
        if(no == null) {
            return;
        }
        NoArvoreBinaria temp = no.getDireita();
        no.setDireita(no.getEsquerda());
        no.setEsquerda(temp);
        
        inverter(no.getDireita());
        inverter(no.getEsquerda());
    }
    
    public int contarNos() {
        return contarNos(raiz);
    }
    
    private int contarNos(NoArvoreBinaria<T> no) {
        int contagem = 0;
        if(no == null) {
            return 0;
        } else {
            contagem += 1;
            contagem += contarNos(no.getEsquerda());
            contagem += contarNos(no.getDireita());
        }
        return contagem;
    }
    
    public String inOrdem() {
        String texto = inOrdem(raiz);
        return texto.substring(0, texto.length() - 1);
    }
    
    private String inOrdem(NoArvoreBinaria<T> no) {
        String texto = "";
        if(no == null) {
            return texto;
        }
        texto += inOrdem(no.getEsquerda());
        texto += no.getInfo().toString() + ",";
        texto += inOrdem(no.getDireita());
        return texto;
       
    }
    
    public String postOrdem() {
        String texto = postOrdem(raiz);
        return texto.substring(0, texto.length() - 1);
    }
    
    private String postOrdem(NoArvoreBinaria<T> no) {
        String texto = "";
        if(no == null) {
            return texto;
        }
        texto += postOrdem(no.getEsquerda());
        texto += postOrdem(no.getDireita());
        texto += no.getInfo().toString() + ",";
        
        return texto;
    }
    
    public String preOrdem() {
        String texto = preOrdem(raiz);
        return texto.substring(0, texto.length() - 1);
    }
    
    private String preOrdem(NoArvoreBinaria<T> no) {
        String texto = "";
        if(no == null) {
            return texto;
        }
        texto += no.getInfo().toString() + ",";
        texto += preOrdem(no.getEsquerda());
        texto += preOrdem(no.getDireita());
        
        return texto;
    }
    
}

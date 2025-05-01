/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista08;

/**
 *
 * @author User
 */
public class Arvore<T> {
    private NoArvore<T> raiz;
    
    public Arvore() {
        raiz = null;
    }

    @Override
    public String toString() {
        return obterRepresentacaoTextual(raiz);
    }
    
    private String obterRepresentacaoTextual(NoArvore no) {
        String texto = "";
        if(no == null) {
            return texto;
        }
        while(no != null) {
            texto += "<" + no.getInfo().toString();
            texto += obterRepresentacaoTextual(no.getPrimeiro()) + ">";
            no = no.getProximo();
        }
  
        return texto;
    }
    
    public boolean pertence(T info) {
        if(raiz == null) {
            return false;
        }
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvore no, T info) {
        if(no.getInfo() == info) {
            return true;
        }
        no = no.getPrimeiro();
        while(no != null) {
            
            if(pertence(no, info)) {
                return true;
            }
            no = no.getProximo();
            
        }
        return false;
    }
    
    public int contarNos() {
        return contarNos(raiz);
    }
    
    public int contarNos(NoArvore no) {
        int contagem = 0;
        while(no != null) {
            contagem += 1;
            contagem += contarNos(no.getPrimeiro());
            no = no.getProximo();
        }
        return contagem;
    }
    
    /**
     * @return the raiz
     */
    public NoArvore<T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    
    
    
    
}

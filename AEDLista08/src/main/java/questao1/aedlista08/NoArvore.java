/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista08;

/**
 *
 * @author User
 */
public class NoArvore<T> {
    
    private T info;
    private NoArvore<T> primeiro;
    private NoArvore<T> proximo;    
    
    public NoArvore(T info) {
        this.info = info;
        primeiro = null;
        proximo = null;
    }
    
    public void inserirFilho(NoArvore<T> sa) {
        sa.setProximo(primeiro);
        primeiro = sa;
    }
    
    /**
     * @return the info
     */
    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * @return the primeiro
     */
    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(NoArvore<T> primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return the proximo
     */
    public NoArvore<T> getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(NoArvore<T> proximo) {
        this.proximo = proximo;
    }
}

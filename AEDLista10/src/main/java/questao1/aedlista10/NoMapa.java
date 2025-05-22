/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista10;

/**
 *
 * @author User
 */
public class NoMapa<T> {

    /**
     * @return the chave
     */
    public int getChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(int chave) {
        this.chave = chave;
    }

    /**
     * @return the valor
     */
    public T getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(T valor) {
        this.valor = valor;
    }
    private int chave;
    private T valor;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        NoMapa other = (NoMapa) obj;
        if(other.getChave() != this.getChave()) {
            return false;
        }
        return true;
    }
    
}

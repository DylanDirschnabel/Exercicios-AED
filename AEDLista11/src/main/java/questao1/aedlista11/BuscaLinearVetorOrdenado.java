/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista11;

/**
 *
 * @author User
 */
public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract {
    
    public int buscar(T valor) {
        for(int i = 0; i < super.getInfo().length; i++) {
            if(valor.equals(super.getInfo()[i])) {
                return i;
            } else if (valor.compareTo( (T) super.getInfo()[i]) == -1) {
                break;
            }
        }
        
        return -1;
    }
    
}

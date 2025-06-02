/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista11;

/**
 *
 * @author User
 */
public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {
    
    public int buscar(T valor) {
        int tamanho = super.getInfo().length;
        int inicio = 0;
        int fim = tamanho -1;
        
        while(inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if(valor.compareTo( (T) super.getInfo()[meio]) == -1) {
                fim = meio - 1;
            } else if (valor.compareTo( (T) super.getInfo()[meio]) == 1) {
                inicio = meio + 1;
            } else {
                return meio;
            }
            
        }
        
        return -1;
    }
    
}

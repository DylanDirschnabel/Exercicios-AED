/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista09;

/**
 *
 * @author User
 */
public class OrdenacaoQuickSort <T extends Comparable<T>> extends OrdenacaoAbstract<T>{
    @Override
    public void ordenar() {
        quickSort(0, super.getInfo().length - 1);
    }
    
    private void quickSort(int inicio, int fim) {
        if(inicio < fim) {
            int idxPivo = particionar(inicio, fim);
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
            
        }
    }
    
    private int particionar(int inicio, int fim) {
        int a = inicio;
        int b = fim + 1;
        T pivo = super.getInfo()[inicio];
        
        while(true) {
            do {
                a++;
            } while(a <= fim && super.getInfo()[a].compareTo(pivo) < 0 );
            
            do {
                b--;
            } while (b >= inicio && super.getInfo()[b].compareTo(pivo) > 0);
            
            if(a >= b) {
                break;
            }
            
            trocar(a, b);
            
        }
        
        trocar(b, inicio);
        return b;
        
        
        
    }
}

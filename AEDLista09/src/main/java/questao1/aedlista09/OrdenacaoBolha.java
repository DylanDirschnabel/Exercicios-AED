/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista09;

/**
 *
 * @author User
 */
public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar() {
        for(int i = 0; i < super.getInfo().length - 1; i++) {
            for(int j = 0; j < super.getInfo().length - i - 1; j++) {
                if(super.getInfo()[j].compareTo(super.getInfo()[j + 1]) > 0)  {
                    T tmp = super.getInfo()[j];
                    super.getInfo()[j] = super.getInfo()[j + 1];
                    super.getInfo()[j + 1] = tmp;
                }
            }

        }

    }
    
    

}

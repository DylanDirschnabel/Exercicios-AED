/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.aedlista11;

/**
 *
 * @author User
 */
public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {
    
        @Override
        public void setRaiz(NoArvoreBinaria<T> no) {
            super.setRaiz(no);
        }
        
        @Override
        public NoArvoreBinaria<T> buscar(T info) {
            if(super.getRaiz() == null) {
                return null;
            }
            return buscar(super.getRaiz(), info);
        }
        
        private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
            if(no == null) {
                return null;
            }  else if (no.getInfo().equals(info)) {
                return no;
            }
            NoArvoreBinaria<T> a = buscar(no.getDireita(), info);
            NoArvoreBinaria<T> b = buscar(no.getEsquerda(), info);
            if(a != null) {
                return a;
            }
            return b;
        }
}

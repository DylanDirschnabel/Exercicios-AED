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

    public void retirar(T valor) {
        NoArvoreBinaria p = super.getRaiz();
        NoArvoreBinaria pai = null;
        boolean filhoEsquerda = false;
        
        while(p != null && !p.getInfo().equals(valor)) {
            pai = p;
            if(valor.compareTo( (T) p.getInfo()) < 0) {
                filhoEsquerda = true;
                p = p.getEsquerda();
            }
            else {
                filhoEsquerda = false;
                p = p.getDireita();
            }  
        }
        
        if(p != null) {
            
            //caso 1
            if(p.getDireita() == null && p.getEsquerda() == null) {
                if(p.equals(super.getRaiz())) {
                    super.setRaiz(null);
                } else {
                    if(filhoEsquerda == true) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
            } else {
                //caso 2
                if(p.getDireita() == null) {
                    if(super.getRaiz().equals(p)) {
                        super.setRaiz(p.getEsquerda());
                    } else {
                        if(filhoEsquerda == true) {
                            pai.setEsquerda(p.getEsquerda());
                        } else {
                            pai.setDireita(p.getEsquerda());
                        }
                    }
                } else if (p.getEsquerda() == null) {
                    if(super.getRaiz().equals(p)) {
                        super.setRaiz(p.getDireita());
                    } else {
                        if(filhoEsquerda == true) {
                            pai.setEsquerda(p.getDireita());
                        } else {
                            pai.setDireita(p.getDireita());
                        }
                    }
                } else {
                    //caso 3
                    NoArvoreBinaria sucessor = extrairSucessor(p);
                    
                    if(p.equals(super.getRaiz())) {
                        super.setRaiz(sucessor);
                    } else {
                        if(filhoEsquerda == true) {
                            pai.setEsquerda(sucessor);
                        } else {
                            pai.setDireita(sucessor);
                        }
                    }
                    sucessor.setEsquerda(p.getEsquerda());
                }
                
                
            }
            
            
            
            
        }
    }
    
    public NoArvoreBinaria extrairSucessor(NoArvoreBinaria p) {
        NoArvoreBinaria atual = p.getDireita();
        NoArvoreBinaria paiSucessor = p;
        NoArvoreBinaria sucessor = p;
        
        while(atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }
        
        if(sucessor != p.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }
        
        return sucessor;
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

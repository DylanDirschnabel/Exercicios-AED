/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ArvoreTest {
    
    public ArvoreTest() {
    }

    @Test
    public void Teste1() {
        NoArvore<Integer> no1 = new NoArvore(1);
        NoArvore<Integer> no2 = new NoArvore(2);
        NoArvore<Integer> no3 = new NoArvore(3);
        NoArvore<Integer> no4 = new NoArvore(4);
        NoArvore<Integer> no5 = new NoArvore(5);
        NoArvore<Integer> no6 = new NoArvore(6);
        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no9 = new NoArvore(9);
        NoArvore<Integer> no10 = new NoArvore(10);
        
        no1.setPrimeiro(no2);
        no2.setProximo(no3);
        no3.setProximo(no4);
        
        no2.setPrimeiro(no5);
        no5.setProximo(no6);
        no6.setProximo(no7);
        
        no3.setPrimeiro(no8);
        
        no4.setPrimeiro(no9);
        no9.setProximo(no10);
        
        Arvore<Integer> arvore = new Arvore();
        arvore.setRaiz(no1);
        
        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());
    }
    
    @Test
    public void Teste2() {
        NoArvore<Integer> no1 = new NoArvore(1);
        NoArvore<Integer> no2 = new NoArvore(2);
        NoArvore<Integer> no3 = new NoArvore(3);
        NoArvore<Integer> no4 = new NoArvore(4);
        NoArvore<Integer> no5 = new NoArvore(5);
        NoArvore<Integer> no6 = new NoArvore(6);
        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no9 = new NoArvore(9);
        NoArvore<Integer> no10 = new NoArvore(10);
        
        no1.setPrimeiro(no2);
        no2.setProximo(no3);
        no3.setProximo(no4);
        
        no2.setPrimeiro(no5);
        no5.setProximo(no6);
        no6.setProximo(no7);
        
        no3.setPrimeiro(no8);
        
        no4.setPrimeiro(no9);
        no9.setProximo(no10);
        
        Arvore<Integer> arvore = new Arvore();
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(7));
    }
    
    @Test
    public void Teste3() {
        NoArvore<Integer> no1 = new NoArvore(1);
        NoArvore<Integer> no2 = new NoArvore(2);
        NoArvore<Integer> no3 = new NoArvore(3);
        NoArvore<Integer> no4 = new NoArvore(4);
        NoArvore<Integer> no5 = new NoArvore(5);
        NoArvore<Integer> no6 = new NoArvore(6);
        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no9 = new NoArvore(9);
        NoArvore<Integer> no10 = new NoArvore(10);
        
        no1.setPrimeiro(no2);
        no2.setProximo(no3);
        no3.setProximo(no4);
        
        no2.setPrimeiro(no5);
        no5.setProximo(no6);
        no6.setProximo(no7);
        
        no3.setPrimeiro(no8);
        
        no4.setPrimeiro(no9);
        no9.setProximo(no10);
        
        Arvore<Integer> arvore = new Arvore();
        arvore.setRaiz(no1);
        
        assertEquals(false, arvore.pertence(55));
    }
    
    @Test
    public void Teste4() {
        NoArvore<Integer> no1 = new NoArvore(1);
        NoArvore<Integer> no2 = new NoArvore(2);
        NoArvore<Integer> no3 = new NoArvore(3);
        NoArvore<Integer> no4 = new NoArvore(4);
        NoArvore<Integer> no5 = new NoArvore(5);
        NoArvore<Integer> no6 = new NoArvore(6);
        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no9 = new NoArvore(9);
        NoArvore<Integer> no10 = new NoArvore(10);
        
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);

        
        no2.setPrimeiro(no5);
        no5.setProximo(no6);
        no6.setProximo(no7);
        
        no3.setPrimeiro(no8);
        
        no4.setPrimeiro(no9);
        no9.setProximo(no10);
        
        Arvore<Integer> arvore = new Arvore();
        arvore.setRaiz(no1);
        
        assertEquals(10, arvore.contarNos());
    }
    
}

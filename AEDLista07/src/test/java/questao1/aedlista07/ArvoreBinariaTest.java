/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ArvoreBinariaTest {
    
    public ArvoreBinariaTest() {
    }

    @Test
    public void Teste1() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        assertEquals(true, arvore.estaVazia());
    }
    
    @Test
    public void Teste2() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no = new NoArvoreBinaria(5);
        arvore.setRaiz(no);
        assertEquals(false, arvore.estaVazia());
    }
    
    @Test
    public void Teste3() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);   
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no1);
        
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
    }
    
    @Test
    public void Teste4() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);   
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(1));
    }
    
    @Test
    public void Teste5() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);   
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(3));
    }
    
    @Test
    public void Teste6() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);   
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no1);
        
        assertEquals(true, arvore.pertence(6));
    }
    
    @Test
    public void Teste7() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);   
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no1);
        
        assertEquals(false, arvore.pertence(10));
    }
    
    @Test
    public void Teste8() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria();
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);   
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no1);
        
        assertEquals(6, arvore.contarNos());
    }
    

    
    
    
    
    
}

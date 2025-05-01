/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista04;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ListaDuplaTest {
    
    public ListaDuplaTest() {
    }

    @Test
    public void Teste1() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        
        NoListaDupla<Integer> p = lista.getPrimeiro();
        Integer results[] = {20, 15, 10, 5};
        int i = 0;
     
        while(p != null) {
            assertEquals(results[i], p.getInfo());
            System.out.println(p.getInfo());
            
            if(p.getProximo() == null) {
                while(p.getAnterior() != null) {
                    assertEquals(results[i], p.getInfo());
                    System.out.println(p.getInfo());
                    p = p.getAnterior();
                    i--;
                }
                assertEquals(p.getInfo(), results[i]);
                System.out.println(p.getInfo());
                return;
            }
            
            i++;
            p = p.getProximo();
        }
  
    }
    
    @Test
    public void Teste2() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20, lista.buscar(20).getInfo());
  
    }
    
    @Test
    public void Teste3() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(10, lista.buscar(10).getInfo());
  
    }
    
    @Test
    public void Teste4() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        
        Integer results[] = {15, 10, 5};
        
        int i = 0;
        NoListaDupla<Integer> p = lista.getPrimeiro();
        
        while(p != null) {
            assertEquals(results[i], p.getInfo());
            System.out.println(p.getInfo());
            
            if(p.getProximo() == null) {
                while(p.getAnterior() != null) {
                    assertEquals(results[i], p.getInfo());
                    System.out.println(p.getInfo());
                    
                    p = p.getAnterior();
                    i--;
                }  
                assertEquals(p.getInfo(), results[i]);
                System.out.println(p.getInfo());
                return;
            }
            
            i++;
            p = p.getProximo();
        }
        
    }
    
    @Test
    public void Teste5() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        
        Integer results[] = {20, 15, 5};
        
        int i = 0;
        NoListaDupla<Integer> p = lista.getPrimeiro();
        
        while(p != null) {
            assertEquals(results[i], p.getInfo());
            System.out.println(p.getInfo());
            
            if(p.getProximo() == null) {
                while(p.getAnterior() != null) {
                    assertEquals(results[i], p.getInfo());
                    System.out.println(p.getInfo());
                    
                    p = p.getAnterior();
                    i--;
                }
                assertEquals(p.getInfo(), results[i]);
                System.out.println(p.getInfo());
                return;
            }
            
            i++;
            p = p.getProximo();
        }
        
    }
    
    @Test
    public void Teste6() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(5);
        
        Integer results[] = {20, 15, 10};
        
        int i = 0;
        NoListaDupla<Integer> p = lista.getPrimeiro();
        
        while(p != null) {
            assertEquals(results[i], p.getInfo());
            System.out.println(p.getInfo());
            
            if(p.getProximo() == null) {
                while(p.getAnterior() != null) {
                    assertEquals(results[i], p.getInfo());
                    System.out.println(p.getInfo());
                    
                    p = p.getAnterior();
                    i--;
                }
                assertEquals(p.getInfo(), results[i]);
                System.out.println(p.getInfo());
                return;
            }
            
            i++;
            p = p.getProximo();
        }
        
    }
    
    @Test
    public void Teste7() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoListaDupla<Integer> p = lista.getPrimeiro();
        ArrayList<NoListaDupla<Integer>> lista2 = new ArrayList();
        while(p != null) {
            lista2.add(p);
            p = p.getProximo();
        }
        
        lista.liberar();
        
        for(NoListaDupla<Integer> no : lista2) {
            assertEquals(no.getAnterior(), null);
            assertEquals(no.getProximo(), null);
            if(no.getAnterior() == null && no.getProximo() == null) {
                System.out.println("Certo!");
            }
            else {
                System.out.println("Errado!");
            }
        }
        
        
        
    }
    
    
    
}
    
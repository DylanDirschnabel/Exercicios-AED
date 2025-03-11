/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ListaEncadeadaTest {
    
    public ListaEncadeadaTest() {
    }

    @Test
    public void Teste1() {
        ListaEncadeada<String> lista = new ListaEncadeada();
        assertEquals(true, lista.estaVazia());
    }
    
    @Test
    public void Teste2() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        assertEquals(false, lista.estaVazia());
    }
    
    @Test
    public void Teste3() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        assertEquals(5, lista.getPrimeiroNodo().getInfo());
        assertEquals(null, lista.getPrimeiroNodo().getProximoNodulo());
    }
    
    @Test
    public void Teste4() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        assertEquals(15, lista.getPrimeiroNodo().getInfo());
        assertEquals(10, lista.getPrimeiroNodo().getProximoNodulo().getInfo());
        assertEquals(5, lista.getPrimeiroNodo().getProximoNodulo().getProximoNodulo().getInfo());
    }
    
    @Test
    public void Teste5() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        NoLista no = lista.buscar(20);
        assertEquals(20, no.getInfo());
    }
    
    @Test
    public void Teste6() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        NoLista no = lista.buscar(15);
        assertEquals(15, no.getInfo());
    }
    
    @Test
    public void Teste7() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        NoLista no = lista.buscar(50);
        assertEquals(null, no);
    }
    
    @Test
    public void Teste8() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals(15, lista.getPrimeiroNodo().getInfo());
        assertEquals(10, lista.getPrimeiroNodo().getProximoNodulo().getInfo());
        assertEquals(5, lista.getPrimeiroNodo().getProximoNodulo().getProximoNodulo().getInfo());
    }
    
    @Test
    public void Teste9() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        assertEquals(20, lista.getPrimeiroNodo().getInfo());
        assertEquals(10, lista.getPrimeiroNodo().getProximoNodulo().getInfo());
        assertEquals(5, lista.getPrimeiroNodo().getProximoNodulo().getProximoNodulo().getInfo());
    }
    
    @Test
    public void Teste10() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        NoLista no = lista.obterNo(0);
        assertEquals(20, no.getInfo());
    }
    
    @Test
    public void Teste11() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        NoLista no = lista.obterNo(3);
        assertEquals(5, no.getInfo());
    }
    
    @Test
    public void Teste12 () {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterNo(10);
        });
    }
    
    @Test
    public void Teste13() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        assertEquals(0, lista.obterComprimento());
    }
    
    @Test
    public void Teste14() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.obterComprimento());
    }
    
    
    
    
    
    
    
}

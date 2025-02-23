/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
    }

    @Test
    public void Teste1() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.toString(),"5,10,15,20");
    }
    
    @Test
    public void Teste2() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.getTamanho(), 4);
    }
    
    @Test
    public void Teste3() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(15), 2);
    }
    
    @Test
    public void Teste4() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(30), -1);
    }
    
    @Test
    public void Teste5() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        lista.retirar(10);
        assertEquals(lista.toString(),"5,15,20");
        assertEquals(lista.getTamanho(), 3);
    }
    
    @Test
    public void Teste6() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.inserir(6);
        lista.inserir(7);
        lista.inserir(8);
        lista.inserir(9);
        lista.inserir(10);
        lista.inserir(11);
        lista.inserir(12);
        lista.inserir(13);
        lista.inserir(14);
        lista.inserir(15);
        assertEquals(lista.toString(),"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
        assertEquals(lista.getTamanho(), 15);
    }
    
    @Test
    public void Teste7() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        assertEquals(lista.obterElemento(3), 3);
    }
    
    @Test
    public void Teste8  () {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterElemento(5);
        });
    }
    
    @Test
    public void Teste9() {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);  
        lista.liberar();
        assertEquals(lista.estaVazia(), true);
    }
    
    
    



    
}

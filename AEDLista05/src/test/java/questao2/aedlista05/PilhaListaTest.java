/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao2.aedlista05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class PilhaListaTest {
    
    public PilhaListaTest() {
    }

    @Test
    public void Teste1() {
        PilhaLista<Integer> pilha = new PilhaLista();
        assertEquals(true, pilha.estaVazia());
    }
    
    @Test
    public void Teste2() {
        PilhaLista<Integer> pilha = new PilhaLista();
        pilha.push(10);
        assertEquals(false, pilha.estaVazia());
    }
    
    @Test
    public void Teste3() {
        PilhaLista<Integer> pilha = new PilhaLista();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertEquals(true, pilha.estaVazia());
    }   
    
    @Test
    public void Teste4() {
        PilhaLista<Integer> pilha = new PilhaLista();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());
    }   
    
    @Test
    public void Teste5() {
        PilhaLista<Integer> pilha = new PilhaLista();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertEquals(true, pilha.estaVazia());
    } 
    
    
}

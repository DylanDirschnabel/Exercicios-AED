/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class PilhaVetorTest {
    
    public PilhaVetorTest() {
    }

    @Test
    public void Teste1() {
        PilhaVetor<Integer> pilha = new PilhaVetor(10);
        assertEquals(true, pilha.estaVazia());
    }
    
    @Test
    public void Teste2() {
        PilhaVetor<Integer> pilha = new PilhaVetor(5);
        pilha.push(10);
        assertEquals(false, pilha.estaVazia());
    }
      
    @Test
    public void Teste3() {
        PilhaVetor<Integer> pilha = new PilhaVetor(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
    }
    
    @Test
    public void Teste4() {
        PilhaVetor<Integer> pilha = new PilhaVetor(3);
        
        assertThrows(PilhaCheiaException.class, () -> {
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            pilha.push(40);
        });
    }
    
    @Test
    public void Teste5() {
        PilhaVetor<Integer> pilha = new PilhaVetor(3);
        
        assertThrows(PilhaVaziaException.class, () -> {
            pilha.pop();
        });
    }
    
    @Test
    public void Teste6() {
        PilhaVetor<Integer> pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());

    }
    
    @Test
    public void Teste7() {
        PilhaVetor<Integer> pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertEquals(true, pilha.estaVazia());

    }
    
    @Test
    public void Teste8() {
        PilhaVetor<Integer> pilha = new PilhaVetor(15);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        PilhaVetor<Integer> pilha2 = new PilhaVetor(12);
        pilha2.push(40);
        pilha2.push(50);
        
        pilha.concatenar(pilha2);
        assertEquals("50,40,30,20,10", pilha.toString());

    }
    
    
    
    
}

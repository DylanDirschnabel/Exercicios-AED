/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class FilaVetorTest {
    
    public FilaVetorTest() {
    }

    @Test
    public void Teste1() {
        FilaVetor<Integer> fila = new FilaVetor(10);
        
        assertEquals(true, fila.estaVazia());
    }
    
    @Test
    public void Teste2() {
        FilaVetor<Integer> fila = new FilaVetor(5);
        fila.inserir(10);
        
        assertEquals(false, fila.estaVazia());
    }
    
    @Test
    public void Teste3() {
        FilaVetor<Integer> fila = new FilaVetor(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.retirar());
        assertEquals(20, fila.retirar());
        assertEquals(30, fila.retirar());
        
    }
    
    @Test
    public void Teste4 () {
        FilaVetor<Integer> fila = new FilaVetor(3);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertThrows(FilaCheiaException.class, () -> {
            fila.inserir(40);
        });
    }
    
    @Test
    public void Teste5 () {
        FilaVetor<Integer> fila = new FilaVetor(3);
        
        assertThrows(FilaVaziaException.class, () -> {
            fila.retirar();
        });
    }
    
    @Test
    public void Teste6 () {
        FilaVetor<Integer> fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.peek());
        assertEquals(10, fila.retirar());
        
    }
    
    @Test
    public void Teste7 () {
        FilaVetor<Integer> fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        
        assertEquals(true, fila.estaVazia());
        
    }
    
    @Test
    public void Teste8 () {
        FilaVetor<Integer> fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        FilaVetor<Integer> fila2  = new FilaVetor(3);
        fila2.inserir(40);
        fila2.inserir(50);
        
        Integer[] resultados = {10, 20, 30, 40, 50};
        
        FilaVetor<Integer> fila3 = fila.criarFilaConcatenada(fila2);
        
        assertEquals("10,20,30", fila.toString());
        assertEquals("40,50", fila2.toString());
        assertEquals(8, fila3.getLimite());
        
        for(Integer resultado : resultados) {
            assertEquals(resultado, fila3.retirar());
        }
        
        
    }
    
    
    
    
    
}

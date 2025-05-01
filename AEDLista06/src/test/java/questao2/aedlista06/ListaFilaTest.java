/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao2.aedlista06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ListaFilaTest {
    
    public ListaFilaTest() {
    }

    @Test
    public void Teste1() {
        ListaFila<Integer> fila = new ListaFila();  
        
        assertEquals(true, fila.estaVazia());
    }
    
    @Test
    public void Teste2() {
        ListaFila<Integer> fila = new ListaFila();  
        fila.inserir(10);
        
        assertEquals(false, fila.estaVazia());
    }
    
    @Test
    public void Teste3() {
        ListaFila<Integer> fila = new ListaFila();  
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.retirar());
        assertEquals(20, fila.retirar());
        assertEquals(30, fila.retirar());
    }
    
    @Test
    public void Teste4() {
        ListaFila<Integer> fila = new ListaFila();  
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.peek());
        assertEquals(10, fila.retirar());
    }
    
    @Test
    public void Teste5() {
        ListaFila<Integer> fila = new ListaFila();  
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        
        assertEquals(true, fila.estaVazia());

    }
    
    
    
}

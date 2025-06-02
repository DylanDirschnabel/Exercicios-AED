/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class BuscaAbstractTest {
    
    public BuscaAbstractTest() {
    }

    @org.junit.jupiter.api.Test
    public void Teste1() {
        Integer[] lista = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            BuscaLinear busca = new BuscaLinear();
            
            busca.setInfo(lista);
            assertEquals(busca.buscar(20), 2);
      
    }
    
    @org.junit.jupiter.api.Test
    public void Teste2() {
        Integer[] lista = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            BuscaLinearVetorOrdenado busca = new BuscaLinearVetorOrdenado();
            
            busca.setInfo(lista);
            assertEquals(busca.buscar(40), 4);
      
    }
    
    @org.junit.jupiter.api.Test
    public void Teste3() {
        Integer[] lista = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            BuscaBinaria busca = new BuscaBinaria();
            
            busca.setInfo(lista);
            assertEquals(busca.buscar(70), 7);
      
    }
    
    @org.junit.jupiter.api.Test
    public void Teste4() {
        Integer[] lista = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            BuscaBinaria busca = new BuscaBinaria();
            
            busca.setInfo(lista);
            assertEquals(busca.buscar(75), -1);
      
    }
    
}

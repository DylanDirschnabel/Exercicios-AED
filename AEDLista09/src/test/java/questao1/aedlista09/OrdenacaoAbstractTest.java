/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista09;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class OrdenacaoAbstractTest {
    
    public OrdenacaoAbstractTest() {
    }

    @Test
    public void Teste1() {
        Integer[] resultados = {2, 15, 30, 70, 88, 90};
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        OrdenacaoBolha ordenador = new OrdenacaoBolha();
        ordenador.setInfo(vetor);
        ordenador.ordenar();
        
        for(int i = 0; i < vetor.length; i++){
            assertEquals(resultados[i], vetor[i]);
        }
        
    }
    
    @Test
    public void Teste2() {
        Integer[] resultados = {2, 15, 30, 70, 88, 90};
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        OrdenacaoBolhaOtimizada ordenador = new OrdenacaoBolhaOtimizada();
        ordenador.setInfo(vetor);
        ordenador.ordenar();
        
        for(int i = 0; i < vetor.length; i++){
            assertEquals(resultados[i], vetor[i]);
        }
        
    }
    
    @Test
    public void Teste3() {
        Integer[] resultados = {2, 15, 30, 70, 88, 90};
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        OrdenacaoQuickSort ordenador = new OrdenacaoQuickSort();
        ordenador.setInfo(vetor);
        ordenador.ordenar();
        
        for(int i = 0; i < vetor.length; i++){
            assertEquals(resultados[i], vetor[i]);
        }
        
    }
    
    @Test
    public void Teste4() {
        Integer[] resultados = {2, 15, 30, 70, 88, 90};
        Integer[] vetor = {70, 2, 88, 15, 90, 30};
        OrdenacaoMergeSort ordenador = new OrdenacaoMergeSort();
        ordenador.setInfo(vetor);
        ordenador.ordenar();
        
        for(int i = 0; i < vetor.length; i++){
            assertEquals(resultados[i], vetor[i]);
        }
        
    }
    
}

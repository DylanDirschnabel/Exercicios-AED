/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao2.aedlista11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class ArvoreBinariaAbstractTest {
    
    public ArvoreBinariaAbstractTest() {
    }

    @Test
    public void Teste1() {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(40);
        arvore.inserir(25);
        arvore.inserir(75);
        arvore.inserir(65);
        arvore.inserir(35);
        arvore.inserir(60);
        assertEquals(arvore.toString(), "<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>");

    }

    @Test
    public void Teste2() {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(25);
        arvore.inserir(40);
        arvore.retirar(40);

        assertEquals(arvore.toString(), "<50<30<25<><>><>><>>");

    }
    
    @Test
    public void Teste3() {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        
        arvore.inserir(80);
        arvore.inserir(52);
        arvore.inserir(90);
        arvore.inserir(48);
        arvore.inserir(71);
        arvore.inserir(63);
        arvore.inserir(67);
        arvore.retirar(71);


        assertEquals(arvore.toString(), "<80<52<48<><>><63<><67<><>>>><90<><>>>");

    }
    
    
}

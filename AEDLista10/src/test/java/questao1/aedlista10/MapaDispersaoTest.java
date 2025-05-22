/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao1.aedlista10;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import questao2.aedlista10.Aluno;

/**
 *
 * @author User
 */
public class MapaDispersaoTest {
    
    public MapaDispersaoTest() {
    }

    @Test
    public void Teste1() {
        MapaDispersao<Aluno> mapa = new MapaDispersao(53);
        LocalDate data1 = LocalDate.of(2000, 1, 1);
        Aluno obj1 = new Aluno(12000, "Jean", data1);
        mapa.inserir(obj1.getMatricula(), obj1);
        
        assertEquals(obj1, mapa.buscar(obj1.getMatricula()));
    }
    
    @Test
    public void Teste2() {
        MapaDispersao<Aluno> mapa = new MapaDispersao(53);
        
        LocalDate data1 = LocalDate.of(2000, 1, 1);
        LocalDate data2 = LocalDate.of(1999, 1, 20);
        LocalDate data3 = LocalDate.of(2001, 2, 18);
        LocalDate data4 = LocalDate.of(1998, 11, 25);
        
        Aluno obj1 = new Aluno(12000, "Jean", data1);
        Aluno obj2 = new Aluno(14000, "Pedro", data2);
        Aluno obj3 = new Aluno(12500, "Marta", data3);
        Aluno obj4 = new Aluno(13000, "Lucas", data4);
        
        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);
        
        assertEquals(obj1, mapa.buscar(obj1.getMatricula()));
        assertEquals(obj2, mapa.buscar(obj2.getMatricula()));
        assertEquals(obj3, mapa.buscar(obj3.getMatricula()));
        assertEquals(obj4, mapa.buscar(obj4.getMatricula()));
    }
    
    @Test
    public void Teste3() {
        MapaDispersao<Aluno> mapa = new MapaDispersao(53);
        
        LocalDate data1 = LocalDate.of(2000, 1, 1);
        LocalDate data2 = LocalDate.of(1999, 1, 20);
        LocalDate data3 = LocalDate.of(2001, 2, 18);
        LocalDate data4 = LocalDate.of(1998, 11, 25);
        
        Aluno obj1 = new Aluno(12000, "Jean", data1);
        Aluno obj2 = new Aluno(14000, "Pedro", data2);
        Aluno obj3 = new Aluno(14226, "Marta", data3);
        Aluno obj4 = new Aluno(17180, "Lucas", data4);
        
        mapa.inserir(obj1.getMatricula(), obj1);
        mapa.inserir(obj2.getMatricula(), obj2);
        mapa.inserir(obj3.getMatricula(), obj3);
        mapa.inserir(obj4.getMatricula(), obj4);
        
        assertEquals(obj1, mapa.buscar(obj1.getMatricula()));
        assertEquals(obj2, mapa.buscar(obj2.getMatricula()));
        assertEquals(obj3, mapa.buscar(obj3.getMatricula()));
        assertEquals(obj4, mapa.buscar(obj4.getMatricula()));
    }
    
}

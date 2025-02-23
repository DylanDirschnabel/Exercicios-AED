/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1.aedlista01;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        if(lista.estaVazia()) {
            System.out.println("vazia");
        }
        lista.inserir(0);
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
        System.out.println(lista.getTamanho());
        System.out.println(lista.toString());
        System.out.println(lista.obterElemento(10));

    }
}

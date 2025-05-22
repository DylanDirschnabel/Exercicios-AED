/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.aedlista10;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Aluno {
    private int matricula;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(int matricula, String nome, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}

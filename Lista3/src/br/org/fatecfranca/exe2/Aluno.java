package br.org.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class Aluno {
    //Criando variaveis
    private String numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    //Metodos Construtores
    public Aluno(){
        this.numeroAluno = "000000";
        this.nome = " ";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }
    public Aluno(String nA, String no, int ida, float p1, float p2){
        this.trataNumeroAluno(nA);
        this.trataNome(no);
        this.trataIdade(ida);
        this.trataP1(p1);
        this.trataP2(p2);
    }
    //metodos de tratamento
    private void trataNumeroAluno(String nA){
        if(nA.length() == 6){
            this.numeroAluno = nA;
        }
        else throw new IllegalArgumentException("Numero de Aluno invalido!");
    }
    private void trataNome(String no){
        if((no.length() > 0) && (no.length() <= 30)){
            this.nome = no;
        }
        else throw new IllegalArgumentException("Nome invalido!");
    }
    private void trataIdade(int ida){
        if(ida >= 0){
            this.idade = ida;
        }
        else throw new IllegalArgumentException("Idade invalida!");
    }
    private void trataP1(float p1){
        if((p1 >= 0) && (p1 <= 10)){
            this.p1 = p1;
        }
        else throw new IllegalArgumentException("Nota P1 invalida!");
    }
    private void trataP2(float p2){
        if((p2 >= 0) && (p2 <= 10)){
            this.p2 = p2;
        }
        else throw new IllegalArgumentException("Nota P2 invalida!");
    }
    //metodos setters
    public void setNumeroAluno(String nA){
        this.trataNumeroAluno(nA);
    }
    public void setNome(String no){
        this.trataNome(no);
    }
    public void setIdade(int ida){
        this.trataIdade(ida);
    }
    public void setP1(float p1){
        this.trataP1(p1);
    }
    public void setP2(float p2){
        this.trataP2(p2);
    }
    //metodos getters
    public String getNumeroAluno(){
        return this.numeroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    }
    public float getp2(){
        return this.p2;
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String dadosAluno(){
        return "Numero do aluno: " + this.numeroAluno +
                "\nNome do aluno: " + this.nome +
                "\nIdade do aluno: " + this.idade;
    }
    public boolean passou(){
        return notaFinal() >= 6;
    }
}

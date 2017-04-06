package br.org.fatecfranca.exe1;
public class Cliente {
    //variaveis
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    //metodos construtores
    public Cliente(){
        this.numeroConta = "000000-0";
        this.numeroAgencia = "0000-0";
        this.nome = " ";
        this.saldo = 0;
    }
    public Cliente(String nC, String nA, String no, float sa){
        this.trataNumeroConta(nC);
        this.trataNumeroAgencia(nA);
        this.trataNome(no);
        this.saldo = sa;
    }
    //metodos de tratamento
    private void trataNumeroConta(String nC){
        if((nC.length() == 8) && (nC.charAt(6) == '-')){
            this.numeroConta = nC;
        }
        else throw new IllegalArgumentException("Numero da Conta invalido.");
    }
    private void trataNumeroAgencia(String nA){
        if((nA.length() == 6) && (nA.charAt(4) == '-')){
            this.numeroAgencia = nA;
        }
        else throw new IllegalArgumentException("Numero da Agencia invalido.");
    }
    private void trataNome(String no){
        if((no.length() > 0) && (no.length() <= 30)){
            this.nome = no;
        }
        else throw new IllegalArgumentException("Nome invalido.");
    }
    //metodos setters
    public void setNumeroConta(String nC){
        this.trataNumeroConta(nC);
    }
    public void setNumeroAgencia(String nA){
        this.trataNumeroConta(nA);
    }
    public void setNome(String no){
        this.trataNome(no);
    }
    public void setSaldo(float sa){
        this.saldo = sa;
    }
    //metodos getters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    //metodos realizar deposito e saque 
    public void realizarDeposito(float valor){
        this.saldo += valor;
    }
    public void realizarSaque(float valor){
        this.saldo -= valor;
    }
    //metodo de imprimir
    public String mostra(){
        return "Numero da Conta: " + this.numeroConta +
                "\nNumero da Agencia: " + this.numeroAgencia +
                "\nNome: " + this.nome +
                "\nSaldo: " + this.saldo;
    }
}

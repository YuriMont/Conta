
package Entidades;

public class Conta {
    private Integer numero;
    private String nome;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String nome, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    public void deposito(Double quantia){
        saldo+=quantia;
    }
    public void saque(Double quantia) {
        if(saldo<quantia){
            throw new ExcecoesConta("Saldo insulficiente");
        }
        if(limiteSaque<quantia){
            throw new ExcecoesConta("O valor excede o limite de saque");
        }
        else{
            saldo-=quantia;
        }
    }


}

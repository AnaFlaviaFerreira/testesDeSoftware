package banco;

public abstract class Conta {
    private Integer numero;
    private Integer agencia;
    private Double saldo;
    private Titular titular;

    Conta(Integer numero, Integer agencia, Titular titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public abstract boolean sacar(Double valor);

    public abstract boolean depositar(Double valor);

    public boolean transferir(Double valor, Conta favorecido) {
        return true;
    }
}

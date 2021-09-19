package banco;

public class ContaCorrente extends Conta{
    private Double limite;
    private Double taxa;
    private Double saldoComLimite;

    ContaCorrente(Integer numero, Integer agencia, Titular titular) {
        super(numero, agencia, titular);
        //TODO Auto-generated constructor stub
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getSaldoComLimite() {
        return saldoComLimite;
    }

    @Override
    public boolean sacar(Double valor) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean depositar(Double valor) {
        // TODO Auto-generated method stub
        return false;
    }
}

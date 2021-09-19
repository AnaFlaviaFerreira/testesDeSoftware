package banco;

public class ContaPoupanca extends Conta implements Rendimentos {

    ContaPoupanca(Integer numero, Integer agencia, Titular titular) {
        super(numero, agencia, titular);
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

    @Override
    public void aualizar(double taxaRendimento) {
        // TODO Auto-generated method stub
        
    }
    
}

package banco;

public class ContaEspecial extends ContaCorrente implements Rendimentos{

    ContaEspecial(Integer numero, Integer agencia, Titular titular) {
        super(numero, agencia, titular);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void aualizar(double taxaRendimento) {
        // TODO Auto-generated method stub
    }
    
}

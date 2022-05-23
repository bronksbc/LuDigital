package bancoDigital;

public class ContaCorrente extends ContaID {

	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	

	@Override
	public void  imprimirExtrato() {
			System.out.println("===EXTRATO=====");
			
	}

	@Override
	public void transferir(double valor) {
		saldo -= valor;
		
	}

}

package bancoDigital;

public interface Conta {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor);

	void imprimirExtrato();
}

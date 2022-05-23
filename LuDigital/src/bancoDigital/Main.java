package bancoDigital;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Cliente cliente = new Cliente();
		cliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));

		cliente.setCpf(JOptionPane.showInputDialog("Digite o seu cpf: "));

		Banco bank = new Banco();
		bank.setNome("LuDigital");
		System.out.println(cliente.getNome() + " Seja Bem Vindo ao " + bank.getNome());

		ContaCorrente cc = new ContaCorrente();
		cc.setCliente(cliente);
		cc.setAgencia(1010);
		cc.setNumero(454508);
		cc.setSaldo(10000);
		
		
		System.out.println("Quanto você deseja sacar: ");
		cc.sacar(scan.nextInt());
		System.out.println("Saldo após o saque: " + cc.getSaldo());
		
		System.out.println("Quanto você deseja sacar: ");
		cc.depositar(scan.nextDouble());
		System.out.println("Saldo após o depósito: " + cc.getSaldo());

		cc.transferir(scan.nextDouble());
		System.out.println("Saldo após o depósito a transferencia: " + cc.getSaldo());

	}

}

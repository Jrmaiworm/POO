package br.com.residencia.banco;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		/// nome, numero, saldo, agencia , telefone

		Conta usuario1 = new Conta("Jorge", 112, 0, "2215", 242243564);

		Conta usuario2 = new Conta("Antonio", 113, 0, "2215", 2422455);

		usuario1.depositar(2000);
		usuario1.sacar(0);
		usuario1.transferir(20, usuario2);

		usuario2.depositar(2000);
		usuario2.sacar(0);
		usuario2.transferir(30, usuario1);

		System.out.print("Carregando dados...");
		Thread.sleep(1000);
		System.out.print("...");
		Thread.sleep(1000);
		System.out.print("......");
		Thread.sleep(1000);
		System.out.print("........");
		Thread.sleep(1000);
		System.out.println("..............");
		Thread.sleep(1000);
		System.out.printf("saldo usuario R$ %.2f\n", usuario1.getSaldo());
		System.out.printf("saldo destinatario R$ %.2f", usuario2.getSaldo());
	}

}

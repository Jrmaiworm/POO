package br.com.residencia.banco;

public class Principal {

	public static void main(String[] args) {

		
		Conta usuario = new Conta("Jorge",112,1000,"2215",242243564);
		
		
		
		usuario.depositar(20000);
		usuario.sacar(10000);
		
		Conta destinatario = new Conta("Jose",113,10000,"2215",2422455);
		 

		
		usuario.transferir(100, destinatario);
		
		System.out.printf("R$ %.2f\n",usuario.saldo);
		System.out.printf("R$ %.2f",destinatario.saldo);
	}

}

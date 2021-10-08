package br.com.residencia.banco;

public class Conta {
	String nome;
	int numero;
	double saldo;
	String agencia;
	int telefone;
	
	
	
	
	
	
	public Conta(String nome, int numero, double saldo, String agencia, int telefone) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		this.telefone = telefone;
	}

	
	

	
	
	


	// metodo sacar
	public void sacar(double valor) {
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

	
	// metodo depositar
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	// metodo transferir
	public void transferir(double valor, Conta destinatario) {

		if (this.saldo > valor) {

			this.saldo = this.saldo - valor;
			destinatario.depositar(valor);
		} else {

			System.out.println("Saldo insuficiente!");
		}

	}
}

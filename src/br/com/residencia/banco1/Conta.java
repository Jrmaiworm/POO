package br.com.residencia.banco1;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	private String agencia;
	private int telefone;

	// construtor
	// Conta/////////////////////////////////////////////////////////////////////////////
	public Conta(String nome, int numero, double saldo, String agencia, int telefone) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		this.telefone = telefone;
	}

// metodo sacar/////////////////////////////////////////////////////////////////////////////////
	public void sacar(double valor) {
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

// metodo depositar//////////////////////////////////////////////////////////////////////////////
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

// metodo transferir/////////////////////////////////////////////////////////////////////////////
	public void transferir(double valor, Conta destinatario) {

		if (this.saldo > valor) {

			this.saldo = this.saldo - valor;
			destinatario.depositar(valor);
		} else {

			System.out.println("Saldo insuficiente!");

		}

	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + ", agencia=" + agencia
				+ ", telefone=" + telefone + "]"

		;
	}
}

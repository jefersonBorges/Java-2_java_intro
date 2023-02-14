package bank_account;

public class Conta {
	
	private int 	numero;
	private double 	saldo;
	
	public Conta() {

	}
	
	public int getNumero() {
		
		return numero;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	
	public void retirar (double valorRetirar) {
		
		if (saldo>= valorRetirar) {
			
			saldo = saldo - valorRetirar;
			
		} else System.out.printf("Valor indispon�vel!\n");
	}
	
	public void depositar (double valor) {
		
		saldo = saldo + valor;
				
	}
	
	public void transferir (double valor, Conta destino) {
		
		if(saldo>= valor) {
			
			saldo = saldo - valor;
			destino.depositar(valor);
			
		} else System.out.printf("Valor indispon�vel!\n");
		
	}
	
	
}

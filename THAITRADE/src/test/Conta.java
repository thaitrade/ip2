package test;

public class Conta {

	
	String cliente;
	Double saldo;
	
	
	void exibesaldo() {
		
		System.out.println(cliente + " seu saldo e " + saldo);
		
	}
	
	void saca(double valor) {
		
		
		this.saldo = saldo - valor ;
		
		
	}
	
	void deposita (double valor) {
		
		this.saldo = saldo + valor;
		
		
	}
	
	
	void transferepara (Conta destino , double valor) {
		
		this.saca(33.56);
		
		
		
	}
	
}

package test;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Conta conta = new Conta();
conta.cliente = "Fabio";
conta.saldo = 10.00 ;
conta.exibesaldo();
conta.saca(1.0);
conta.exibesaldo();
conta.deposita(3445.99);
conta.exibesaldo();


		
		
	}

}

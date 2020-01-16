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

Conta joao = new Conta();
joao.cliente = "JOAO";
joao.saldo = 200.00;
joao.exibesaldo();
joao.saca(100.00);
joao.exibesaldo();

Double valor = 1000.00;
joao.deposita(valor);
Double saldoAtual = joao.saldo;
System.out.println( joao.cliente + " " +"depositou"+ " " + valor + " e seu saldo agora e " + " " + saldoAtual);


		
		
	}

}

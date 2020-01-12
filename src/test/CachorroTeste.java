package test;

public class CachorroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro pitbul = new Cachorro();
		Cachorro.raca = "Pitbul";
		Cachorro.tamanho = 40;
		pitbul.latir();

		Cachorro viralata = new Cachorro();
		Cachorro.raca = "viralatas";
		Cachorro.tamanho = 77;
		viralata.latir();

	}
}

package entities;

public class User {

	private static String nome;
	private static String emailUser;
	private static String passwordUser;
	private static Boolean statusUser;
	private static String catUser;
	private static String posicaoUser; // gerente comercial etc
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		User.nome = nome;
	}

	public static String getEmailUser() {
		return emailUser;
	}

	public static void setEmailUser(String emailUser) {
		User.emailUser = emailUser;
	}

	public static String getPasswordUser() {
		return passwordUser;
	}

	public static void setPasswordUser(String passwordUser) {
		User.passwordUser = passwordUser;
	}

	public static Boolean getStatusUser() {
		return statusUser;
	}

	public static void setStatusUser(Boolean statusUser) {
		User.statusUser = statusUser;
	}

	public static String getCatUser() {
		return catUser;
	}

	public static void setCatUser(String catUser) {
		User.catUser = catUser;
	}

	public static String getPosicaoUser() {
		return posicaoUser;
	}

	public static void setPosicaoUser(String posicaoUser) {
		User.posicaoUser = posicaoUser;
	}

}

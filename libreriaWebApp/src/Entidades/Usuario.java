package Entidades;

public class Usuario {
	private String apeNom;
	private String usuario;
	private String password;
	private int esAdmin;

	
	public String getApeNom() {
		return apeNom;
	}
	public void setApeNom(String apeNom) {
		this.apeNom = apeNom;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEsAdmin() {
		return esAdmin;
	}
	public void setEsAdmin(int esAdmin) {
		this.esAdmin = esAdmin;
	}

	
}

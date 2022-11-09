package Vezbe.Clas2.Task3;

public class Takmicar {
	
	private final int ID;
	private String imePrezime;
	private int najboljiRezultat;
	private String nazivD;
	private int takmicenje;
	
	public Takmicar(String imeIprez, int NajboljiRezultat, String nazivD,  int takmicenje, int ID) {
		this.imePrezime = imeIprez;
		this.nazivD = nazivD;
		this.najboljiRezultat = najboljiRezultat;
		this.ID = ID;
		this.takmicenje = takmicenje;
	}
	
	public String toString() {
		return imePrezime;
	}

	public String getNazivD() {
		return nazivD;
	}

	public void setNazivD(String nazivD) {
		this.nazivD = nazivD;
	}
	
}

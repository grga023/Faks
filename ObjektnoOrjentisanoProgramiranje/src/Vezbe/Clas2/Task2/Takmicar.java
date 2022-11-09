
public class Takmicar {

	String ImeiPrezime;
	static int Norma;
	int NajboljiRez;
	
	
	
 public	Takmicar(String imeprezime, int najboljirez, int norma) {
	 
	 ImeiPrezime = imeprezime;
	 NajboljiRez = najboljirez;
	 Norma = norma;
	 
 }
 
 boolean ispunionormu = false;
 	
	
private void norma() {
	if(NajboljiRez > Norma)
		ispunionormu = true;
	else
		ispunionormu = false;
}


boolean ispunioNormu() {
	
	
	if(ispunionormu) {
		return false;
		
	}
	else {
	
		return true;
	}
	  
 }
 
 public String toString() {
	return ImeiPrezime;
}

public static int getNorma() {
	return Norma;
}

public static void setNorma(int norma) {
	Norma = norma;
}


public int getNajboljiRez() {
	return NajboljiRez;
}


public void setNajboljiRez(int najboljiRez) {
	NajboljiRez = najboljiRez;
}
	
public void ispis() {
	norma();
	System.out.println("Takmicar "+toString()+ (ispunioNormu()? " je ispunio normu": " nije ispunio normu"));
}
	
}

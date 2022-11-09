package Vezbe.Clas2.Task3;

public class Takmicenje {
	
	private static String discipline[];
	private int takmicari[];
	private String nazivT;
	private int brojTak[];
	
	public Takmicenje(String nazivT) {
		this.nazivT = nazivT;
		discipline = new String[500];
	}
	
	public void setDiscipline(String[] naziv){
		for(int i = 0; i <= 4; i++)
			this.discipline[i] = naziv[i];	
	}

	public void send(Takmicar u) {
		boolean da = true;
		for(int i = 0; i <= 10; i++) {
			String disc = discipline[i];
			if(u.getNazivD() == disc) {
				System.out.println("Igrac "+u.toString()+" je prihvacen za disciplinu: "+u.getNazivD());
				da = false;
				break;
			}
				
		}
		if(da) {
			System.out.println("Disciplina ne postoji");
		}
	}
	
	
	public void pretragaD(String disc) {
		boolean da = true;
		for(int i = 0; i <= 10; i++) {
			String dic = discipline[i];
			if(disc == dic) {
				System.out.println(dic);
				da = false;
			}
		}
		if(da)System.out.println("null");
	}
	
}

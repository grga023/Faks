package Vezbe.Clas2.Task3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Disciplina d1 = new Disciplina("Skok u dalj", 7);
		Disciplina d2 = new Disciplina("Bacanje koplja", 55);
		Disciplina d3 = new Disciplina("Trcanje na 100m", 5.4);
		Disciplina d4 = new Disciplina("Skok u vis", 6);
		Disciplina d5 = new Disciplina("Trcanje na 200m", 20.5);
		
		String discipline[] = {d1.getNaziv(), d2.getNaziv(), d3.getNaziv(), d4.getNaziv(), d5.getNaziv()};
		
		Takmicar U1 = new Takmicar("Marko Markovic", 60, d2.getNaziv(), 1, 1);
		Takmicar U2 = new Takmicar("Pera Peric", 50 , d2.getNaziv(), 1, 2);
		Takmicar U3 = new Takmicar("Mika Mikic", 8, d1.getNaziv(), 1, 3);
		Takmicar U4 = new Takmicar("Pera Markovic", 6, d1.getNaziv(), 1, 4);
		Takmicar U5 = new Takmicar("Pera Zikic", 60, d5.getNaziv(), 1, 5);
		Takmicar U6 = new Takmicar("Majk Pauel", 8, d1.getNaziv(), 2, 6);
		Takmicar U7 = new Takmicar("Laza Lazic", 65, d2.getNaziv(), 2, 7);
		Takmicar U8 = new Takmicar("Ana Lazic", 6, d4.getNaziv(), 2, 8);
		
		
		
		Takmicenje T1 = new Takmicenje("Svetsko");
		Takmicenje T2 = new Takmicenje("Evropsko");
		
		T1.setDiscipline(discipline);
		T2.setDiscipline(discipline);
		
		T1.send(U1);
		T1.send(U2);
		T1.send(U3);
		T1.send(U4);
		T1.send(U5);
		
		T2.send(U6);
		T2.send(U7);
		T2.send(U8);
		

		T1.pretragaD("Skok u dalj");
		T2.pretragaD("Bacanje koplja");
		
		
		
		
	}
}

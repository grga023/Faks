package Predavanje.Clas4.Task1;

public class KrreatorStudent extends Thread{

    private Student student;

    public KrreatorStudent(String ime, String prezime, String brIndeksa, int godStudija, int brPolozenihIspita, double prosek){
        student = new Student();
        student.setIme(ime);
        student.setPrezime(prezime);
        student.setBrIndeksa(brIndeksa);
        student.setGodStudija(godStudija);
        student.setBrPolozenihIspita(brPolozenihIspita);
        student.setProsek(prosek);
    }

    @Override
    public void run() {
        student.addStudent(student);
        student.out();
        System.out.println("--------------------");

    }
}

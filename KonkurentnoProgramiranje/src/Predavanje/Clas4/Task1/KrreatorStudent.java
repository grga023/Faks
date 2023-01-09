package Predavanje.Clas4.Task1;

public class KrreatorStudent extends Thread{

    private Student student;

    public KrreatorStudent(String ime, String prezime, String brIndeksa, int godStudija, int brPolozenihIspita, double prosek, Student st){
        student = new Student();
        student.setIme(ime);
        student.setPrezime(prezime);
        student.setBrIndeksa(brIndeksa);
        student.setGodStudija(godStudija);
        student.setBrPolozenihIspita(brPolozenihIspita);
        student.setProsek(prosek);
        st.addStudent(student);
    }

    @Override
    public void run() {
        System.out.println("--------------------");

    }
}

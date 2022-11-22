package Predavanje.Clas4;

import java.util.LinkedList;

public class Student {
    private String ime;

    private String prezime;

    private String brIndeksa;
    private int godStudija;
    private int brPolozenihIspita;
    private double prosek;

    private LinkedList <Student> listaStudenata;

    public Student(){
        listaStudenata = new LinkedList<Student>();
    }

    public void addStudent(Student student){
        listaStudenata.add(student);
//        System.out.println(student.ime+" "+student.prezime+" "+student.brIndeksa+" "+student.godStudija+" "+student.brPolozenihIspita+" "+student.prosek);
    }
    public LinkedList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void out(){
        String out;
        for (var item : listaStudenata) {
            out = item.ime+" "+item.prezime+" "+item.brIndeksa+" "+item.godStudija+" "+item.brPolozenihIspita+" "+item.prosek;
            System.out.println(out);
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getGodStudija() {
        return godStudija;
    }

    public void setGodStudija(int godStudija) {
        this.godStudija = godStudija;
    }

    public int getBrPolozenihIspita() {
        return brPolozenihIspita;
    }

    public void setBrPolozenihIspita(int brPolozenihIspita) {
        this.brPolozenihIspita = brPolozenihIspita;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }
}

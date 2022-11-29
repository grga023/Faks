package Predavanje.Clas4.Task1;

public class IzmenaProseka extends Thread{
    private Student student;
    private String brIndeksa;
    private double prosek;
//    private LinkedList <Student> students;

    public IzmenaProseka(Student student){

//        student = new Student();
//        students = new LinkedList<Student>();
//        students = student.getListaStudenata();
    }

    public void izmeniProsek(){
//        for (var item : students) {
//            if(item.getBrIndeksa() == brIndeksa){
//                item.setProsek(prosek);
//                break;
//            }
//        }
    }

    @Override
    public void run() {
        izmeniProsek();
        student.toString();
    }
}

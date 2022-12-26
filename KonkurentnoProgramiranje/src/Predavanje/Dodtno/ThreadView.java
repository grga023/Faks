package Predavanje.Dodtno;

public class ThreadView{
    private Car car;

    public ThreadView(){
        out();
    }
    public void out(){
        car.out();
    }
}

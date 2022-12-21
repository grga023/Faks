package Vezbe.Clas5.Task1;

public class ThreadDriver {
    public static void main(String[] args) throws InterruptedException {
        ThreadColor1 tc1 = new ThreadColor1(1);
        ThreadColor2 tc2 = new ThreadColor2(2);

        System.out.println("Main Started");

        tc1.start();
        tc2.start();

        Thread.sleep(2000);
    }
}

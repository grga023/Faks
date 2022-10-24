package Predavanje.Clas1.Vezbe.Task2;



public class ThreadDriver {

    public static Thread createTh(String name, int op){
        Thread th = new Thread(new InfoThread(op), name);
        return th;
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " started!");
        System.out.println("--------------------");
        System.out.println();

        Thread th1 = createTh("sqrt", 1);
        Thread th2 = createTh("Factoriel", 2);
        Thread th3 = createTh("ReciprocnaVrednost", 3);

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("--------------------");
        System.out.println(Thread.currentThread().getName() + " terminates!");
        System.out.println();
    }
}

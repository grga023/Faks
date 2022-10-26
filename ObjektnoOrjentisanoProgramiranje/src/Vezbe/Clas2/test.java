package Vezbe.Clas2;

public class test {
    public static void main(String[] args) {
        OverloadDemo model = new OverloadDemo();

        model.getParametars();
        model.getParametars(4);
        model.getParametars(4.67);
        model.getParametars(6, 9);

        Cube cube1 = new Cube();
        Cube cube2 = new Cube(1 ,2);
        Cube cube3 = new Cube(1,2,3);

        cube1.surfce();
        cube1.volume();

        cube2.volume();
        cube2.surfce();

        cube3.surfce();
        cube3.volume();
    }
}

package Zad1;

public class Test {
    public static void main(String[] args) {
        VideoKaseta vk1 = new VideoKaseta("Titanik");
        VideoKaseta vk2 = new VideoKaseta("Vratice se rode", 47, false);

        IgraniFilm igraniFilm = new IgraniFilm("Prizivanje zla", 137, true, "Pojma Nemam", "Horor");

        System.out.println(vk1.toString());
        System.out.println("---------------------------------------");
        System.out.println(vk2.toString());
        System.out.println("---------------------------------------");
        System.out.println(igraniFilm.toString());
    }
}

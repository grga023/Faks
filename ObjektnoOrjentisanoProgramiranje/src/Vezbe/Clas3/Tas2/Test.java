package Vezbe.Clas3.Tas2;

public class Test {
    public static void main(String[] args) {
        CDInfo CD1 = new CDInfo("Test naziv 1");
        CDInfo CD2 = new CDInfo("Test naziv 2", 70,"Mitar Miric", "10-5-2022");
        CDInfo CD3 = new CDInfo("Test naziv 3", "27-08-2022",70);

        System.out.println(CD2.iznajmi());
    }
}

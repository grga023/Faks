package Predavanja.Clas5;

public class TestParcela {

    public static void main(String[] args) {
        PrivatnaParcela p = new PrivatnaParcela(50);

        PKuca pk;
        SKuca sk;
        Visespratnica v;

        pk=new PKuca("Kancelarija"); 	p.addObject(pk);
        p.addObject(new PKuca("Stambeni prostor"));

        v = new Visespratnica("Stambeni prostor"); 	p.addObject(v);

        sk = new SKuca("Stambeni prostor"); p.addObject(sk);
        System.out.println(sk);

        p.addObject(new ZdravstvenaUstanova("Ambulanta"));

        pk = p.takePKuca("Stambeni prostor");
        System.out.println(pk);
    }
}

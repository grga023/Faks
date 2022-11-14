package Predavanja.Clas4;

public class Ulica {
    private Stack _stack;

    private String nazivUlice;

    public Ulica(int brParcela){
        _stack = new Stack(brParcela);
    }

    public String getNazivUlice() {
        return nazivUlice;
    }

    public void setNazivUlice(String nazivUlice) {
        this.nazivUlice = nazivUlice;
    }

    public static void main(String[] args) {
        Ulica u = new Ulica(3);
        u.setNazivUlice("Djordja Stratimirovica");
        u._stack.push(new Nekretnina(Nekretnina.PRIZEMNA_KUCA));
        u._stack.push(new Nekretnina(Nekretnina.SPRATN_KUCA));
        u._stack.push(new Nekretnina(Nekretnina.VISESPRATNICA));

        System.out.println((u._stack.isFull()? "Stek je pun":"Stek nije pun"));
        System.out.println(u._stack.top());
        u._stack.pop();
        System.out.println(u._stack.top());
        u._stack.pop();
        System.out.println(u._stack.top());
        u._stack.pop();
        System.out.println((u._stack.isEmpty()? "Stek je prazan":"Stek nije prazan"));


    }

}

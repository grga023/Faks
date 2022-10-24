package Predavanja.Clas2;

public class test {
    public static void main(String[] args) {
        int n = 5;
        float sumG = 0;
        int sumD = 0;
        float  sumT = 0;

        for(int i = 1; i<=n; i++){
            sumG += i;
            sumD += i*i;

            if(i%2 == 1 || i == 1){
                sumT += sumG/sumD;
                System.out.println("1   "+sumT);
            }
            else if(i%2 == 0){
                sumT -= sumG/sumD;
                System.out.println("2   "+sumT);
            }

        }

        System.out.println(+sumT);
    }
}

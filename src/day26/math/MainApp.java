package day26.math;

public class MainApp {
    public static void main(String[] args) {
        int toplam = Islem.topla(5, 7);
        System.out.println("Toplam = "+toplam);
        System.out.println("Çarpım = "+Islem.carp(5,7));

        long b1=5;
        long b2=7;
        Islem.topla(b1,b2);

    }
}

package day10;

public class Methods3 {
    public static void main(String[] args) {
        int c1=cevreHesapla(3);
        int c2=cevreHesapla(8);
        int cevrelerToplami=c1+c2;
        int cevrelerFarki=c2-c1;
        System.out.println("Toplam = "+cevrelerToplami);
        System.out.println("Fark = "+cevrelerFarki);

    }

    public static int cevreHesapla(int kenar){
        return 4*kenar;
    }

}

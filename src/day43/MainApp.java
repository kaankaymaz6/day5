package day43;

public class MainApp {
    public static void main(String[] args) {
        /*Exceptions
        Keywords
            1. try
            2. catch
            3. finally
            4. throw
            5. throws
         */
        //Sıfıra bölme hatası

        int x = 7;
        int y = 0;
        try {
            System.out.println("Sonuç = " + (x / y));
        }catch (Exception hata){
            System.err.println("Hata : "+hata.getMessage());
        }
    }
}

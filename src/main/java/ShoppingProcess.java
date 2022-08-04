import java.util.Scanner;

public class ShoppingProcess {

    public static void main(String[] args) {
        String devamMi = "";
        if (devamMi.equalsIgnoreCase("devam"));
        {
            do {
                Storage.alısverislist();
                Storage.urunsec_miktarhesapla();
                Scanner scan = new Scanner(System.in);
                System.out.println("alışverişe devam edecek misiniz?(cevabınız evet ise e, hayır ise h'ye basınız)");
                devamMi = scan.next();
            }
            while (devamMi.equalsIgnoreCase("e"));
        }
        if (devamMi.equalsIgnoreCase("h"))
            Storage.odeme();
    }

}

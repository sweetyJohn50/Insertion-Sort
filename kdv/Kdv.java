package kdv;
import java.util.Scanner;

public class Kdv {
    
     public static void main(String[] args) {

        double tutar , kdv = 0.18;

        Scanner  i = new Scanner(System.in);
            
        System.out.println("Bir tutar giriniz:");
       
        tutar = i.nextDouble();
        
        double kdvt = tutar * kdv;

        double toplam = tutar + kdvt;

        System.out.println("Kdv siz tutari : " + tutar);

        System.out.println("Kdv orani : " + kdv);

        System.out.println("Kdv tutari : " + kdvt);

        System.out.println("Kdv'li tutar : " + toplam);


        // Hakan Çoban
        // https://app.patika.dev/hknxx
        
    }
}

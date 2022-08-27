package daay1;

import java.util.Scanner;

public class Q08_Scanner01 {

    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tamsayileri toplayin ve sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen iki tamsayi giriniz: "); // iki sautta da yazabilirdik s1 ve s2'yi
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        int toplam= s1+s2;
        System.out.println("toplam = " + toplam);

    }
}

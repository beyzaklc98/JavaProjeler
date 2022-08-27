package day09_ternary;

import java.util.Scanner;

public class C11_Odev_SwitchCase {

    public static void main(String[] args) {

        // kullanicidan gun numarasini alip
        // 1 ise pazartesi,
        // 7 ise pazar yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        // Switch yanina yazilan () neye gore case atayacagimizi gosterir
        // Java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar, break yazisi gorunceye
        // veya switch parantezine kadar devam eder

        // if - else - if ... yapısında oldugu gibi hicbir satira uymayanlari defould keywold kullanilir


        switch (gunNo) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default :
                System.out.println("Lutfen gecerli bir gun numarasi giriniz");
        }
    }
}

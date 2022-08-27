package day09_ternary;

import java.util.Scanner;

public class C14_Odev_SwitchCase {

    public static void main(String[] args) {

        // Soru 4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        //          Kullanici S girerse “Software”
        //          D girerse “Developer”
        //          E girerse “Engineer”
        //          T girerse “In Testing” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birini giriniz");
        String harf=scan.next().toUpperCase();

        switch (harf) {
            case "S" :
                System.out.println("Software");
                break;
            case "D" :
                System.out.println("Developer");
                break;
            case "E" :
                System.out.println("Engineer");
                break;
            case "T" :
                System.out.println("In Testing");
                break;
            default :
                System.out.println("Lutfen gecerli bir harf giriniz");
        }
    }
}

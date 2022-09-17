package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {

    public static void main(String[] args) {

        int k;

        try {
            FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");
            // burada ='den sonra alti kirmizi cizdi bunun gitmesi icin try catch yaptik

            while((k=fis.read()) !=-1){
                System.out.print((char) k);
                // burada da read altini cizdi bunun icin de 2. bir catch yapti
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyadan bilgiler okunamadi");

        } catch (IOException e) {
            System.out.println("Dosya bulunamadi");
        }
    }
}
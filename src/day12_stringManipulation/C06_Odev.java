package day12_stringManipulation;

public class C06_Odev {

    public static void main(String[] args) {

        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //         String str1 = “$13.99”
        //         String str2 = “$10.55”
        //         ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        String ilk= str1.replace("$","");
        String ikinci=str2.replace("$","");

        double a=Double.parseDouble(ilk);
        double b=Double.parseDouble(ikinci);

        System.out.println("$" + (a+ b));
    }
}

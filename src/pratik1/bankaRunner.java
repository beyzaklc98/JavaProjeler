package pratik1;

public class bankaRunner {

    public static void main(String[] args) {

        banka a= new banka("Is Bankasi", 268, 1000);
        System.out.println(a);

        banka b= new banka("Ziraat Bankasi", 300, 2500);
        System.out.println(b);

        // banka c= new banka("Halk Bankasi",177); ---> kabul etmedi cunku banka class'inda 2 parametreli tanimlmadik

    }
}

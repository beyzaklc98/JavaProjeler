package pratik4_karisik;

public class C02_Array {

    public static void main(String[] args) {


        // Verilen 2 katli bir array'in tum elemanlarinin toplamini bulalim

        int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};

        int toplam=0;
        int ciftToplam=0;
        int tekToplam=0;
        int ciftAdet=0;
        int tekAdet=0;


        for (int i=0; i<arr.length; i++) { //outer
            for (int j=0; j<arr[i].length; j++){ //inner
                toplam+=arr[i][j];
                if (arr[i][j]%2==0){
                    ciftToplam+=arr[i][j];
                    ciftAdet++;
                } else {
                    tekToplam+=arr[i][j];
                    tekAdet++;
                }
            }
        }
        System.out.println(ciftAdet + " adet cift sayinin toplami: " + ciftToplam );
        System.out.println(tekAdet + " adet tek sayinin toplami: " + tekToplam);
        System.out.println("Tum sayilarin toplami :" + toplam);
    }
}


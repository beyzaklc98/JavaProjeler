package daay3;

public class Q01_SwitchCase {

    public static void main(String[] args) {

         /*
          gunleri gösterebilen bir program yazın
          gun Pazartesi veya Sali ise:
          Java dersi gunleri
          gun Persembe veya Cuma ise:
          Selenyum dersi gunleri
          gun carsamba veya cumartesi ise:
          SQL dersi gunleri
          aksi halde: izin gunu
          (if deyimini KULLANMAYIN)
        */

        String gun = "Sali"; // salidan sonra . koyup method getirebiliriz cunku String bir ifade

        switch (gun){
            case "Pazartesi":
            case "Sali":
                System.out.println("java dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}

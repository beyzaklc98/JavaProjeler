package pratik1;

public class kahveRunner {

    public static void main(String[] args) {

        kahve kahve1= new kahve("mocca", 40);
        System.out.println(kahve1);

        kahve kahve2= new kahve();
        System.out.println(kahve2);

        // burada bos girdigimde eger kahve class'inda bos constructor girmezsem hata aliyorum
        // benim hata almama icin kahve class'ina bos constructor eklemem gerekiyor
    }

}

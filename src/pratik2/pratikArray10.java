package pratik2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pratikArray10 {

    public static void main(String[] args) {

        // Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın
        // ve tersine ters çevrilmiş String'e atayın.
        // Test Data:
        // sentence -> "Java is fun"
        // reversed **-> "**fun is Java**"**

        String str= "Java is fun";

        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));

        StringBuilder sb=new StringBuilder();
        sb.append(arr);
        System.out.println(str);
        sb.reverse();
        System.out.println(sb);




    }
}

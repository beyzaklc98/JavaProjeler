package day09_ternary;

public class C07_Odev_Nested_Ternary {

    public static void main(String[] args) {

         int y = 8;
        System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y)); // 16

         int z = 12;
        System.out.println((z > 5) ? (z<10 ? 2*z : 3*z) : (z>10 ? 2+z : 3+z)); // 36

        int x = 5;
        System.out.println((x > 5) ? (x<10 ? 2*x : 3*x) : (x>10 ? 2+x : 3+x)); // 8
    }
}

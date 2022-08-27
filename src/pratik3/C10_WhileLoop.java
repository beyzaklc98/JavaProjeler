package pratik3;

public class C10_WhileLoop {

    public static void main(String[] args) {

        // 20'den 50'ye kadar(sinirlar dahil) cift sayilari yazdiralim
        // for loop ile yapalim

        int bas=20;
        int son=50;

        for (int i = bas; i <=son ; i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        int temp=bas;

        while(temp<=son) {

            if(temp%2==0) {
                System.out.print(temp+" ");
            }
           temp++;
        }
    }
}

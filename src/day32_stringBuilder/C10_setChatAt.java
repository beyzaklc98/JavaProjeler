package day32_stringBuilder;

public class C10_setChatAt {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java pratik yaparak ogrenilir");
        sb.setCharAt(0,'H');
        System.out.println(sb); // Hava pratik yaparak ogrenilir
    }
}

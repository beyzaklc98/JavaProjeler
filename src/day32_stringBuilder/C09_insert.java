package day32_stringBuilder;

public class C09_insert {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java pratik yaparak ogrenilir");

        sb.insert(19," ve severek");
        System.out.println(sb); // Java pratik yaparak ve severek ogrenilir
        System.out.println(sb.insert(19," veeee")); // Java pratik yaparak veeee ve severek ogrenilir

        StringBuilder sb1 = new StringBuilder("Java cok guzel");

        sb1.insert(14, " bir dil",0,4);
        System.out.println(sb1); // Java cok guzel bir
    }
}

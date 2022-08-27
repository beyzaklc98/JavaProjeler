package day44_collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        List<String> list = new LinkedList<>();

        list.add("Berk");
        list.add("Serap");
        list.add("Java");
        list.add("Can");
        System.out.println("list = " + list); // list = [Berk, Serap, Java, Can]

        System.out.println("list.remove(3) = " + list.remove(3)); // Can

        /*
        Eger list'imiz Integer elementlerden olusuyorsa direkt sayi yazarsak
        index olarak kabul eder. Bir variable'a atama yapar ve remove'da o
        variable'in ismini yazarsak obje olarak kabul eder.
         */
        System.out.println(list.remove("Murtaza")); //false

        System.out.println(list.isEmpty()); // false list bos mu

        list.set(1,"Serap");
        System.out.println("list = " + list); // [Berk, Serap, Java]

        linkedList.add("Berk");
        linkedList.add("ismail");
        System.out.println("linkedList = " + linkedList); // [Berk, ismail]

        list.retainAll(linkedList); // ***** ***** *****
        // list'deki tum elementleri linkedlist ile
        // karsilastirir linkedlist'te olmayanlari siler

        System.out.println("list = " + list);// [Berk]


        System.out.println("list.hashCode() = " + list.hashCode()); // 2066939

        list.add("Fatih");

        System.out.println("list.hashCode() = " + list.hashCode()); // 131726141
    }
}
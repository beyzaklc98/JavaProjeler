package day44_collections;
import java.util.Deque;
import java.util.LinkedList;
public class C06_LinkedList_DequeDataTuru {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.add("Cavidan");
        deque.add("Mesut");
        deque.add("Selim");
        deque.add("Tevfik");
        deque.add("Selim");

        System.out.println("deque = " + deque); // deque = [Cavidan, Mesut, Selim, Tevfik, Selim]

        deque.removeLastOccurrence("Selim"); // deque = [Cavidan, Mesut, Selim, Tevfik] ---> sondaki Selimi sildi.

        System.out.println("deque = " + deque); // deque = [Cavidan, Mesut, Selim, Tevfik]

        System.out.println("deque.pop() = " + deque.pop()); // deque.pop() = Cavidan
    }
}
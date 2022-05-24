package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Ok");
        //list.add(2);

        for (Object o: list) {
            System.out.println(o+" - "+ ((String)o).length());
        }
    }
}

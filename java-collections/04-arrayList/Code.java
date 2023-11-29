import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Code {
    public static void main(String[] args) {
        // Link: https://www.w3schools.com/java/java_arraylist.asp

        // create array list of strings
        ArrayList<String> cars = new ArrayList<>(10);

        // add items to arrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fiat");
        cars.add("Porsche");

        // print arraylist
        System.out.println(cars);

        // get item from arrayList
        System.out.println(cars.get(0));

        // modify item
        cars.set(0, "TATA");
        System.out.println(cars);

        // remove an item
        cars.remove(1);

        // get size of arrayList
        System.out.println(cars.size());

        // sort an array list (sort method from collection class)
        Collections.sort(cars);
        System.out.println(cars);

        // contains() : check item exist in arrayList
        System.out.println(cars.contains("TATA"));

        // get indexOf item and also used to check item exist in arrayList (-1 if not
        // present)
        System.out.println(cars.indexOf("TATAT"));

        // remove all items
        cars.clear();

    }
}

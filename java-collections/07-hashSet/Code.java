import java.util.HashSet; 
public class Code {
    public static void main(String[] args) {
        // HashSet 
        // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

        // import java.util.HashSet; 
        HashSet<String> cars = new HashSet<>();

        // Add Items
        // The HashSet class has many useful methods. For example, to add items to it, use the add() method:

        cars.add("tata");

        // Check If an Item Exists
        // To check whether an item exists in a HashSet, use the contains() method:
        System.out.println(cars.contains("tata"));

        // Remove an Item
        // To remove an item, use the remove() method:
        cars.remove("tata");

        // To remove all items, use the clear() method:
        cars.clear();

        // HashSet Size
        // To find out how many items there are, use the size method:

        cars.add("BMW");
        System.out.println(cars.size());

        // contains
        cars.contains("BMW");

        // Loop Through a HashSet
        // Loop through the items of an HashSet with a for-each loop:
        for(String i : cars){
            System.out.println(i);
        }

    }
}

import java.util.HashMap;

public class Code {
    public static void main(String[] args) {
        // link : https://www.w3schools.com/java/java_hashmap.asp

        // create hashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        /*
         * Add Items
         * The HashMap class has many useful methods. For example, to add items to it,
         * use the put() method:
         */

        capitalCities.put("India", "Delhi");
        capitalCities.put("Germany", "Berlin");

        /*
         * Add Items
         * The HashMap class has many useful methods. For example, to add items to it,
         * use the put() method:
         */

        System.out.println(capitalCities.get("India"));

        /*
         * Remove an Item
         * To remove an item, use the remove() method and refer to the key:
         */
        capitalCities.remove("Germany");

        // contains
        capitalCities.containsKey("India");
        capitalCities.containsValue("Delhi");

        // size of hashMap
        capitalCities.size();
        System.out.println(capitalCities.toString());


        // loop 
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }




        
        // clear all values
        capitalCities.clear();

    }

}

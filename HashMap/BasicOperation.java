package HashMap;
import java.util.HashMap;

public class BasicOperation {
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Abhi");                              // insert an element into the map.
        map.put(2,"Anu");
        map.put(3,"Aishu");
        map.put(4,"Ammu");

        System.out.println(map);

        System.out.println(map.get(3));                       // Get an element from the map.

        map.remove(4);                                        // Remove an element from the map.
        System.out.println(map);
    
        System.out.println(map.containsKey(4));               // check whether the map containsKey or not.

        System.out.println(map.containsValue("Anu"));       // check whether the map containsValues or not..

        System.out.println(map.size());     // check whether the map is empty or not.

        System.out.println(map.isEmpty());  // check whether the map is empty or not.

        map.clear();                        // this operation can be used for clear the hashmap.
        
        System.out.println(map);
    }
}


 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
/**
 * HashMap - Single Key and Multiple Values using List
 *
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class testnew {
 
    public static void main(String[] args) {
 
        // create map to store
        Map<String, List<String>> map = new HashMap<String, List<String>>();
 
        // create list one and store values
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Apple");
        valSetOne.add("Aeroplane");
 
        // create list two and store values
        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");
 
        // create list three and store values
        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("Cat");
        valSetThree.add("Car");
 
        // put values into map
        map.put("A", valSetOne);
        map.put("B", valSetTwo);
        map.put("C", valSetThree);
 
        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            
            
            System.out.println("Values = " + values + "n");
            System.out.println("this is value one" + values.get(0));
            System.out.println("this is value two" + values.get(1));
            
            //	int i = 0;
//		while (i < values.size()) {
//			System.out.println(values.get(i));
//			i++;
	//	}
            
            
        }
    }
}
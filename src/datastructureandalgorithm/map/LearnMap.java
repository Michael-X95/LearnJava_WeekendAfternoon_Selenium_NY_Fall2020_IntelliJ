package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    // Map : <key,value>

    String name = "James";

    public static void main(String[] args) {

        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("USA", "NY");
        stateMap.put("CANADA", "ON");
        stateMap.put("ARMENIA", "YEREVAN");
        stateMap.put("NEPAL", "KTM");
        stateMap.put("Algeria", "algeirs");
        stateMap.put("TURKEY", "Batman");
        stateMap.put("Bangladesh", "Dhaka");
        stateMap.put("Tokyo", "Japan");

        System.out.println(stateMap.get("NEPAL"));


        // How to Retrieve all the value from map?
        for (Map.Entry<String, String> entry : stateMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Another Approach
        System.out.println("******** Alternative Approach");
        for (String st: stateMap.keySet()){
            System.out.println(st+" : "+stateMap.get(st));
        }


    }

}
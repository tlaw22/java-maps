import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App { // Hasmaps require a key and a value
    public static void main(String[] args) throws Exception {
        String sep = "================================================================";
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brilliant", "exceptionally clever or talented");
        dictionary.put("Joy", "a feeling of great pleasure and happiness");
        dictionary.put("Confidence", "the state of feeling certain about the truth of something");

        // for (String word: dictionary.keySet()){
        // System.out.println(dictionary.get(word));
        // }
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        } // a treemap maintains order and structor of the map.
        System.out.println(sep);
        TreeMap<String, String> dictionary2 = new TreeMap<String, String>();
        dictionary2.put("Brave", "ready to face and endure danger or pain; showing courage.");
        dictionary2.put("Brilliant", "exceptionally clever or talented");
        dictionary2.put("Joy", "a feeling of great pleasure and happiness");
        dictionary2.put("Confidence", "the state of feeling certain about the truth of something");

        for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        } // a treemap maintains order and structor of the map.

    }

}

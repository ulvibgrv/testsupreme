import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OneSymbol {
    public static void result(String input){
        String[] parts = input.split("");
        Map<String, Boolean> map = new LinkedHashMap<>();
        int count;
        for(int i = 0; i < parts.length; i++){
            count = 0;
            for(int j = 0; j < parts.length; j++){
                if(parts[i].equals(parts[j])){
                    count++;
                }
                if(count > 1){
                    map.put(parts[i], false);
                }else {
                    map.put(parts[i], true);
                }
            }
        }
        System.out.println(map);
        System.out.println("Hello SupremeCourt");
    }
}

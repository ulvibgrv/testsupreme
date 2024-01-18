import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String a = "AB BB BC AA AB BB";
        String [] parts = a.split(" ");
        System.out.println(Arrays.toString(parts));
        Map<String, Boolean> map = new TreeMap<>();
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
    }
}
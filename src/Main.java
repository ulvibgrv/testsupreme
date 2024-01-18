import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String input = "AAABBCADACFAAA";
        String[] parts = getEveryTwoSymbols(input);
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

    public static String[] getEveryTwoSymbols(String input) {
        int length = input.length();
        int resultLength;
        if(length % 2 == 0){
            resultLength = length / 2;
        }else{
            resultLength = length / 2 + 1;
        }
        String[] result = new String[resultLength];

        for (int i = 0; i < length; i += 2) {
            if (i + 1 < length) {
                result[i / 2] = input.substring(i, i + 2);
            } else {
                result[i / 2] = input.substring(i);
            }
        }

        return result;
    }
}

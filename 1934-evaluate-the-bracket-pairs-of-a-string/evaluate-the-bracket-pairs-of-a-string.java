import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        // Step 1: Build a fast lookup map for the knowledge base
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        
        StringBuilder result = new StringBuilder();
        int n = s.length();
        
        // Step 2: Parse the string in a single pass
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                // Find the end of the bracket pair
                int start = i + 1;
                while (s.charAt(i) != ')') {
                    i++;
                }
                // Extract the key between '(' and ')'
                String key = s.substring(start, i);
                // Append the replacement value or "?" if not found
                result.append(map.getOrDefault(key, "?"));
            } else {
                // Append regular characters directly
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
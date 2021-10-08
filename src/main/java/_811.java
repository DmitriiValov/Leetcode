import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/subdomain-visit-count/">811. Subdomain Visit Count</a>
 */

public class _811 {

    public static class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> map = new HashMap<>();
            Arrays.stream(cpdomains).forEach(domainStr -> {
                String[] parts = domainStr.split(" ");
                int value = Integer.parseInt(parts[0]);
                String[] domainParts = parts[1].split("\\.");
                StringBuilder domain = new StringBuilder();
                for (int i = 1; i <= domainParts.length; ++i) {
                    if (i != 1) {
                        domain.insert(0, ".");
                    }
                    domain.insert(0, domainParts[domainParts.length - i]);
                    if (map.containsKey(domain.toString())) {
                        map.computeIfPresent(domain.toString(), (k, v) -> v + value);
                    }
                    else {
                        map.put(domain.toString(), value);
                    }
                }
            });
            List<String> results = new ArrayList<>();
            for (String key : map.keySet()) {
                results.add(map.get(key) + " " + key);
            }
            return results;
        }
    }
}

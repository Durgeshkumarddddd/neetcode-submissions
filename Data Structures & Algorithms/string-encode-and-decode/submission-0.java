

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            // Find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Length of current string
            int len = Integer.parseInt(s.substring(i, j));

            // Move after '#'
            j++;

            // Extract string
            ans.add(s.substring(j, j + len));

            // Move to next encoded string
            i = j + len;
        }

        return ans;
    }
}
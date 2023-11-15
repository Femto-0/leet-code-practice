public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        boolean checker = true;
        int count = 0;
        while (checker) {
            String first;
            String second;
            for (int i = 0; i <= strs.length - 2; i++) {
                first = strs[i];
                second = strs[i + 1];
                    for (int j = 0; j <= Math.min(first.length(),second.length())-1; j++) {
                        if (first.charAt(j) == second.charAt(j)) {
                                count=j+1;

                    }else{
                            break;
                        }
                }
            }
            checker=false;
        }
        StringBuilder sb = new StringBuilder();
        if (count != 0) {
            for (int i = 0; i <= count - 1; i++) {
                sb.append(strs[0].charAt(i));
            }
        } else {
            System.out.println("No common prefix");
        }
        String commonIndex=sb.toString();
        return commonIndex;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] str = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(str));

    }
}

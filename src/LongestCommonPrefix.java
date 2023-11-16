import java.util.Objects;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        boolean checker = true;
        int[] arrRecord = new int[strs.length - 1];
        int count = 0;
        while (checker) {
            if (strs.length <= 1) {
                return strs[0];

            } else {
                for (int i = 0; i <= strs.length - 1; i++) {
                    if (strs[i].isEmpty()) {
                        return "";
                    }
                }
            }
            String first;
            String second;
            for (int i = 0; i <= strs.length - 2; i++) {
                first = strs[i];
                second = strs[i + 1];
                if (!Objects.equals(first.charAt(0), second.charAt(0))) {
                    return "";
                } else {
                    for (int j = 0; j <= Math.min(first.length(), second.length()) - 1; j++) {
                        if (Objects.equals(first.charAt(j), second.charAt(j))) {
                            count = j + 1;
                        } else {
                            arrRecord[i] = count;
                            count=0;
                            break;
                        }
                    }
                }
            }

            checker = false;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrRecord.length - 1; i++) {
            if (count < arrRecord[i]) {
                count = arrRecord[i];
            }
        }
        for (int i = 0; i <= count - 1; i++) {
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] str = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(str));

    }
}


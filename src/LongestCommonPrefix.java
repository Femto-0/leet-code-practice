public class LongestCommonPrefix {

    public String longestCommonPrefix(String []strs){
        StringBuilder sb = new StringBuilder();
        String firstWord= strs[0];
        for(int i=0; i<=firstWord.length()-1; i++){
            sb.append(strs[i]);
        }
        return "";
    }
}

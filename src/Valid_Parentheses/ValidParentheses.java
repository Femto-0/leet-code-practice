package Valid_Parentheses;

public class ValidParentheses {
    public boolean isValid(String s) {
        boolean isTrue=false;
        if(s.length()>=2) {
            for (int i = 0; i <= s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    isTrue = true;
                } else {
                    return isTrue;
                }
            }
        }else{
            return isTrue;
        }

        return isTrue;

    }
    public static void main(String[] args) {
        ValidParentheses vp= new ValidParentheses();
        System.out.println(vp.isValid("( )"));
    }
}

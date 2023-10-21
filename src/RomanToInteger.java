public class RomanToInteger {
    int sum;

    public int romanToInt(String s) {
        String[] num = new String[s.length()];
        for (int i = 0; i <= s.length() - 1; i++) {   //adding the given String to an array
            num[i] = String.valueOf(s.charAt(i));
        }
        for (int i = 0; i <= num.length - 1; i++) { //going through each element of array
            if (num[i].equalsIgnoreCase("I")) {
                sum += 1;
            } else if (num[i].equalsIgnoreCase("V")) {
                sum += 5;
                if (i >= 1 && (num[i - 1].equalsIgnoreCase("I"))) {
                    sum -= 2;
                }
            } else if (num[i].equalsIgnoreCase("X")) {
                sum += 10;
                if (i >= 1 && (num[i - 1].equalsIgnoreCase("I"))) {
                    sum -= 2;
                }
            } else if (num[i].equalsIgnoreCase("L")) {
                sum += 50;
                if (i >= 1 && (num[i - 1].equalsIgnoreCase("X"))) {
                    sum -= 20;
                }
            } else if (num[i].equalsIgnoreCase("C")) {
                sum += 100;
                if (i >= 1 && (num[i - 1].equalsIgnoreCase("X"))) {
                    sum -= 20;
                }
            } else if (num[i].equalsIgnoreCase("D")) {
                sum += 500;
                if (i >= 1 && (num[i - 1].equalsIgnoreCase("C"))) {
                    sum -= 200;
                }
            } else if (num[i].equalsIgnoreCase("M")) {
                sum += 1000;
                if (i >= 1 && (num[i - 1].equalsIgnoreCase("C"))) {
                    sum -= 200;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInt("MCMXCIV"));
    }
}

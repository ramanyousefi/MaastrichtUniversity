// import java.util.*;

public class CoolNumbers {

    public static void main(String[] args) {
        System.out.println(isCool(22, 2));
System.out.println(convertXtoArray(123));
    }

    public static int[] convertXtoArray(int a) {
        String temp = Integer.toString(a);
        int[] converted = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            converted[i] = Character.getNumericValue(temp.charAt(i));
        }
        return converted;
    }

    public static boolean isCool(int x, int n) {
        int[] converted = convertXtoArray(x);
        int check = 0;
        for (int i = 0; i < converted.length; i++) {
            if (converted[i] != 0) {
                if (n % converted[i] == 0) {
                    check++;
                }
            }

        }
        if (check == converted.length) {
            return true;
        }
        else{
            return false;
        }
    }

    public static int countCools(int n, int a, int b) {
        int coolCounter = 0;
        for (int i = a; i <= b; i++) {
            if (isCool(i, n))
                coolCounter++;
        }
        return coolCounter;
        // your code here
    }

}
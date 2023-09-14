import java.util.ArrayList;

public class CoolNumbers {

    public static void main(String[] args) {
        System.out.println(isCool(1, 3));
         System.out.println(countCools(3, 1111, 9999));
    }

    public static int[] convertToArray(int number) {
        // String strNum = Integer.toString(number);
        // char[] strToCharArray = strNum.toCharArray();
        // int[] intArray = new int[strToCharArray.length];
        // for (int i = 0; i < strToCharArray.length; i++) {
        // intArray[i] = Character.getNumericValue(strToCharArray[i]);
        // }
        String[] numbersString = Integer.toString(number).split("|");
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (String string : numbersString) {
            numberList.add(Integer.valueOf(string));
        }
        int[] numberArray = numberList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return numberArray;
    }

    public static boolean isCool(int x, int n) {
        int[] numberArray = convertToArray(x);
        boolean check = true;
        for (int digit : numberArray) {
            if (digit == 0 || n % digit !=0){
                check = false;
            }
        }
        return check;
    }

    public static int countCools(int n, int a, int b) {
        int coolCounter = 0;
        for (int i = a; i <= b; i++) {
            if (isCool(i, n))
                coolCounter++;
        }
        return coolCounter;
    }

}
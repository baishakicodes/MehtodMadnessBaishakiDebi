package BaishakiDebi;

public class BaishakiDebiLib {
    //This method lists the multiplication table for the indicated base up to the indicated range
    public static void multTable(int base, int range) {
        String newString = "";
        for (int i = 0; i < range + 1; i++) {
            newString = base + "*" + i + "=" + (base * i);
            System.out.println(newString);

        }
    }
    //This method gives the sum of all the numbers up to the indicated number. Included indicated number in the sum
    public static int sumUpTo(int num) {
        int sum = 0;
        for (int i = 0; i < num + 1; i++) {
            sum = sum + i;
        }
        return sum;
    }
    //This method returns the original date in the format mm/dd/yyyy to the format dd-mm-yyyy
    public static String dateStr(String olddate) {
        int i = olddate.indexOf("/");
        String front = olddate.substring(0, i);
        String mid = olddate.substring(i + 1, i + 3);
        String end = olddate.substring(i + 4, olddate.length());
        return mid + "-" + front + "-" + end;
    }
    //this method checks in the original word is a palindrome or not. If palindrome it returns true, else false
    public static Boolean isPalindrome(String word) {
        String backWord = "";
        for (int i = word.length(); i > 0; i--) {
            backWord = backWord + word.substring(i - 1, i);
        }
        if (backWord.equals(word)) {
            return true;
        }
        return false;
    }
    // this method removes the indicated subStr from the mainStr if subStr is smaller than mainStr.
    //If subStr is bigger or equal to mainStr the method return a string that statement
    public static String cutOut(String mainStr, String subStr) {
        String newString = "";
        int iSubStr = mainStr.indexOf(subStr);
        if (mainStr.length() > subStr.length()) {
            for (int i = 0; i < mainStr.length(); i++) {
                if (i == iSubStr) {
                    if (i == 0) {
                        newString = newString + mainStr.substring(i + subStr.length());
                    }
                    if (i > 0) {
                        newString = newString + mainStr.substring(0, i) + mainStr.substring(i + subStr.length());
                    }

                }
            }
        }
        else{
            System.out.println("That subStr is bigger than or equal to the mainStr");
        }
        return newString;
    }
}

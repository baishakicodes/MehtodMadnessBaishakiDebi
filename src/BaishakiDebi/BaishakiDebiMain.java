package BaishakiDebi;

public class BaishakiDebiMain {

    public static void main(String[] args) {
	// write your code here
        BaishakiDebiLib.multTable(9 ,3);
        System.out.println("The sum is "+BaishakiDebiLib.sumUpTo(3));
        System.out.println("The new date is "+BaishakiDebiLib.dateStr("01/08/1999"));
        System.out.println("Is the word a Palindrome? "+BaishakiDebiLib.isPalindrome("foo"));
        System.out.println("That subStr cut out from the mainStr gives \'"+BaishakiDebiLib.cutOut("catatonic cat", "cat")+"\'");


    }
}

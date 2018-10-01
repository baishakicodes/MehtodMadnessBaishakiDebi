package BaishakiDebi;

public class BaishakiDebiLib {
    public static String reverse(String input ){
        String output="";
        int i=input.length()-1;
        while(i>=0){
            output=output + input.substring(i,i+1);
            i--;
        }
        return output;
    }
}

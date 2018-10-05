package BaishakiDebi;

public class BaishakiDebiLib {
    public static void multTable(int base, int range){
        String newString= "";
        for (int i=0; i<range+1; i++){
            newString = base + "*" + i + "=" + (base*i);
            System.out.println(newString);

        }
    }
    public static int sumUpTo(int num){
        int sum=0;
        for(int i=0; i<num+1;i++){
            sum=sum+i;
        }
        return sum;
    }
}

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
    public static String dateStr(String olddate){
       int i=olddate.indexOf("/");
       String front = olddate.substring(0,i);
       String mid = olddate.substring(i+1,i+3);
       String end = olddate.substring(i+4, olddate.length());
       return mid+"-"+front+"-"+end;
    }
}

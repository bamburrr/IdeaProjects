package test;

public class fibonacci {
    public static void main (String [] args){
        int a = 0;
        int b = 1;
        int result = 0;
        int n = 11;
        if (n < 2){
            result = n;
        }
        for (int i = 2; i < n; i++){
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println(result);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int n;
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        if (n < 0) {
            n = 0;
        }
        String StrArr[] = fizzBuzz(n);
//        System.out.println(Arrays.toString(StrArr));
    }
    public static String[] fizzBuzz(int n){
        String nArr[] = new String[n];
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    nArr[i-1] = "fizz buzz";
                    continue;
                }else{
                    nArr[i-1] = "fizz";
                    continue;
                }
            }
            if(i % 5 == 0){
                nArr[i-1] = "buzz";
                continue;
            }
            nArr[i-1] = Integer.toString(i);
        }
        return nArr;
    }
}

import java.awt.*;
import java.util.ArrayList;
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
        ArrayList<String> StrArr = fizzBuzz(n);
//        System.out.println(Arrays.toString(StrArr));
    }
    public static ArrayList<String> fizzBuzz(int n){
        ArrayList<String> mylist = new ArrayList(n);
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    mylist.add ("fizz buzz");
                    continue;/Users/franklinwisseh1/Documents/GitHub/lab1-frank-kurt/step345/src/main/java/lab1.java
                }else{
                    mylist.add("fizz");
                    continue;
                }
            }
            if(i % 5 == 0){
                mylist.add("buzz");
                continue;
            }
            String a = Integer.toString(i);
            mylist.add(a);
        }
        return mylist;
    }
}

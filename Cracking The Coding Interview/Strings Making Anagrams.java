import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();

        String b = scanner.nextLine();

        Vector<Character> tempa = new Vector();
        Vector<Character> tempb = new Vector();
        int tempp= 0;
        int result = 0;
        for(int i=0; i<a.length(); i++){
            if(b.indexOf(a.charAt(i)) >= 0) {
                tempa.add(a.charAt(i));
            }
        }
        for(int i=0; i<b.length(); i++){
            if(a.indexOf((b.charAt(i))) >= 0) tempb.add(b.charAt(i));
        }
        Collections.sort(tempa);
        Collections.sort(tempb);
        
        for(int i=0; i < tempa.size() && i < tempb.size() ; i++){
            if(tempa.get(i) != tempb.get(i)){
                if(tempa.get(i) == tempb.get(i-1)){
                    tempa.remove(i);
                }
                else if(tempb.get(i-1) == tempb.get(i)){
                    tempb.remove(i);
                }
                i--;
            }
        }
        if(tempa.size() <= tempb.size()) {
            result = (a.length() + b.length()) - tempa.size() - tempa.size();    
        }else{
            result = (a.length() + b.length()) - tempb.size() - tempb.size();
        }
        
        System.out.println(result);
        scanner.close();
    }
}

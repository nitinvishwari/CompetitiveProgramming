package StonyBrookACMICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
        File text = new File("E:\\Spring Boot Course\\CompetitiveProgramming\\src\\main\\java\\StonyBrookACMICPC\\InputFiles\\input1.txt");
        Scanner scanner = new Scanner(text);

        String t = scanner.next();
        int s = 0;
        int c = 0;
        for(int i=0; i<t.length(); i++) {
            if(t.charAt(i) == 'C'){
                c++;
            }
            else{
               s++;
            }
        }
        if(c == s){
            System.out.println("Tie!");
        }
        else if(c > s){
            System.out.println("Cathy won!");
        }
        else {
            System.out.println("Sally won!");
        }
    }
}
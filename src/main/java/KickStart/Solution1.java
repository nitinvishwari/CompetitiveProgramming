package KickStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
        File text = new File("E:\\Spring Boot Course\\CompetitiveProgramming\\src\\main\\java\\KickStart\\InputFiles\\input1.txt");
        Scanner scanner = new Scanner(text);

        int t = scanner.nextInt();
        for(int i=0; i<t; i++){
            int total = 0;
            int[] arr = new int[26];
            String s = scanner.next();
            String f = scanner.next();
            for(int j=0; j<f.length(); j++){
                arr[f.charAt(j) - 97] = 1;
            }
            for(int j=0; j<s.length(); j++){
                int k = 0;
                int charInt = s.charAt(j) - 97;
                while(k < 14){
                    if(arr[(charInt + 26 - k) % 26] ==  1){
                        break;
                    }
                    if(arr[(charInt + k) % 26] == 1){
                        break;
                    }
                    k++;
                }
                total += k;
            }
            System.out.println("Case #1: " + total);
        }
    }
}
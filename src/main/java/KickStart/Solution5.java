package KickStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution5 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
        File text = new File("E:\\Spring Boot Course\\CompetitiveProgramming\\src\\main\\java\\StonyBrookACMICPC\\InputFiles\\input5.txt");
        Scanner scanner = new Scanner(text);

        int t = scanner.nextInt();
        int c = scanner.nextInt();
        int globalMin = Integer.MAX_VALUE;
        for(int i=0; i<t; i++) {
            int max = 0;
            for(int j=0; j<c; j++){
                int temp = scanner.nextInt();
                if(temp > max){
                    max = temp;
                }
            }
            if(max < globalMin){
                globalMin = max;
            }
        }

        System.out.println(globalMin);
    }
}

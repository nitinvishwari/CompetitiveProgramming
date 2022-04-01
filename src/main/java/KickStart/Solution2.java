package KickStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner scanner = new Scanner(System.in);
        File text = new File("E:\\Spring Boot Course\\CompetitiveProgramming\\src\\main\\java\\KickStart\\InputFiles\\input2.txt");
        Scanner scanner = new Scanner(text);

        int t = scanner.nextInt();
        for(int a=0; a<t; a++){
            int total = 0;
            int l = scanner.nextInt();
            String s = scanner.next();
            int[][] arr = new int[l][3];
//            System.out.println(s);
            for (int i=0; i<l; i++){
                if(s.charAt(i) == 'R'){
                    arr[i][0] = 1;
                }
                else if(s.charAt(i) == 'Y'){
                    arr[i][1] = 1;
                }
                else if(s.charAt(i) == 'B'){
                    arr[i][2] = 1;
                }
                else if(s.charAt(i) == 'O'){
                    arr[i][0] = 1;
                    arr[i][1] = 1;
                }
                else if(s.charAt(i) == 'P'){
                    arr[i][0] = 1;
                    arr[i][2] = 1;
                }
                else if(s.charAt(i) == 'G'){
                    arr[i][1] = 1;
                    arr[i][2] = 1;
                }
                else if(s.charAt(i) == 'A'){
                    arr[i][0] = 1;
                    arr[i][1] = 1;
                    arr[i][2] = 1;
                }
            }
            int col = 0;
            for(int j=0; j<3; j++){
                col = 0;
                for(int i=0; i<l; i++){
                    if(arr[i][j] == 1 && col == 0){
                        col = 1;
                        total++;
                    }
                    if(arr[i][j] == 0){
                        col = 0;
                    }
                }
            }
            System.out.println("Case #"+ (a+1) +": " + total);
        }
    }
}

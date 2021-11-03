package StonyBrookACMICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution3 {

    public static int[][][] adjMat;
    public static int n;

    public static int minimumValue(int i, int j, int index){
        int min = Integer.MAX_VALUE;
        for(int k=0; k<n; k++){
            if(adjMat[0][i][k] != Integer.MIN_VALUE && adjMat[index - 1][k][j] != Integer.MIN_VALUE && (adjMat[0][i][k] +adjMat[index - 1][k][j] < min)){
                min = adjMat[0][i][k] +adjMat[index - 1][k][j];
            }
        }
        if(min == Integer.MAX_VALUE){
            return Integer.MIN_VALUE;
        }
        return min;
    }

    public static void matrixMultiplication(int index){
        for(int i=0; i<n; i++){
            for(int j= 0; j<n; j++){
                adjMat[index][i][j] = minimumValue(i, j, index);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner scanner = new Scanner(System.in);
        File text = new File("E:\\Spring Boot Course\\CompetitiveProgramming\\src\\main\\java\\StonyBrookACMICPC\\InputFiles\\input3.txt");
        Scanner scanner = new Scanner(text);

        n = scanner.nextInt();
        int m = scanner.nextInt();
        adjMat = new int[501][n][n];


        for(int i=0; i<m+1; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(i == 0 && j == k){
                        adjMat[i][j][k] = 0;
                    }
                    else
                        adjMat[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }

        for(int i=0; i<m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            adjMat[0][u-1][v-1] = w;
        }

        for(int i=1; i<501; i++){
            matrixMultiplication(i);
        }

//        for(int i=0; i<n; i++){
//            System.out.println(Arrays.toString(adjMat[3][i]));
//        }

        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int s = scanner.nextInt() -1;
            int d = scanner.nextInt() -1;
            int k = scanner.nextInt();

            if(k == 0){
                if(s == d) {
                    System.out.println(0);
                }
                else{
                    System.out.println("Impossible");
                }
                continue;
            }
            if(adjMat[k-1][s][d] != Integer.MIN_VALUE){
                System.out.println(adjMat[k-1][s][d]);
            }
            else{
                System.out.println("Impossible");
            }
        }
    }
}

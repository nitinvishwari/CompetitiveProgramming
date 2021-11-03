package StonyBrookACMICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution2 {

    public static double formula(double r, double R){
        double rSquare = Math.pow(r, 2);
        double RSqaure = Math.pow(R, 2);
        return rSquare * Math.acos(rSquare / (2*r*R)) + RSqaure * Math.acos((2*RSqaure - rSquare) / 2* RSqaure) - 0.5 * Math.sqrt(rSquare *(2*R - r) * (2*R+r));
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner scanner = new Scanner(System.in);
        File text = new File("E:\\Spring Boot Course\\CompetitiveProgramming\\src\\main\\java\\StonyBrookACMICPC\\InputFiles\\input2.txt");
        Scanner scanner = new Scanner(text);

        float a = scanner.nextFloat();
        double r = Double.valueOf(a);
        double min = 0;
        double max = 200;
        while(max > min){

        }


        System.out.println("Output");
    }
}

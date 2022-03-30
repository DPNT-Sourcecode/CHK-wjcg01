package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
        int sum = 0;
        int contorA = 0;
        int contorB = 0;
        for (int i = 0; i < skus.length();i++) {
            if(skus.charAt(i)=='A') {
                sum += 50;
                contorA++;
            }
            if(skus.charAt(i)=='B') {
                sum += 30;
                contorB++;
            }
            if(skus.charAt(i)=='C') {
                sum += 20;
            }
            if(skus.charAt(i)=='D') {
                sum += 15;
            }
        }



        ;
    }
}




package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        HashMap <Character, Integer> pricesbyProduct = new HashMap<Character,Integer>();
        pricesbyProduct.put('A',50);
        pricesbyProduct.put('B',30);
        pricesbyProduct.put('C',20);
        pricesbyProduct.put('D',15);
        int sum = 0;
        int contorA = 0, contorB = 0;


        for (int i = 0; i < skus.length();i++) {
            if(skus.charAt(i) != 'A' && skus.charAt(i) != 'B' && skus.charAt(i) != 'C' && skus.charAt(i) != 'D') {
                return -1;
            }
            sum += pricesbyProduct.get(skus.charAt(i));
            if(skus.charAt(i)=='A') {
                contorA++;
            }
            if(skus.charAt(i)=='B') {
                contorB++;
            }

        }
        sum -= contorA/3 * 20;
        sum -= contorB/2 * 15;



        return sum;
    }
}







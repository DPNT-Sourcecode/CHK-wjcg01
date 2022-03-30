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
        pricesbyProduct.put('E',40);
        int sum = 0;
        int contorA = 0, contorB = 0;
        int contorE = 0;


        for (int i = 0; i < skus.length();i++) {
            if(skus.charAt(i) != 'A' && skus.charAt(i) != 'B' && skus.charAt(i) != 'C' && skus.charAt(i) != 'D'
            && skus.charAt(i) != 'E') {
                return -1;
            }
            sum += pricesbyProduct.get(skus.charAt(i));
            if(skus.charAt(i) =='A') {
                contorA++;
            }
            if(skus.charAt(i) =='B') {
                contorB++;
            }
            if(skus.charAt(i) =='E') {
                contorE++;
            }

        }

        sum -= contorA/5 * 50;
        sum -= contorA%5/3 > 0 ? 20 : 0;
        if(contorB > 0)
            sum -= contorE/2 * 30;
            contorB -= contorE/2;
        sum -= contorB/2 * 15;




        return sum;
    }
}

package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutSolution {
    int simpleDeal (int contor, int discount, int nrDiscount, int special, int discountSpecial) {
        int finalDiscount = 0;
        finalDiscount = contor/nrDiscount * discount;
        if (special != -1) {
            finalDiscount += contor%nrDiscount/special > 0 ? discountSpecial : 0;
        }
      return finalDiscount;
    }
    public Integer checkout(String skus) {

        HashMap <Character, Integer> pricesbyProduct = new HashMap<Character,Integer>();
        pricesbyProduct.put('A',50);
        pricesbyProduct.put('B',30);
        pricesbyProduct.put('C',20);
        pricesbyProduct.put('D',15);
        pricesbyProduct.put('E',40);
        pricesbyProduct.put('F',10);
        pricesbyProduct.put('G',20);
        pricesbyProduct.put('H',10);
        pricesbyProduct.put('I',35);
        pricesbyProduct.put('J',60);
        pricesbyProduct.put('K',80);
        pricesbyProduct.put('L',90);
        pricesbyProduct.put('M',15);
        pricesbyProduct.put('N',40);
        pricesbyProduct.put('O',10);
        pricesbyProduct.put('P',50);
        pricesbyProduct.put('Q',30);
        pricesbyProduct.put('R',50);
        pricesbyProduct.put('S',30);
        pricesbyProduct.put('T',20);
        pricesbyProduct.put('U',40);
        pricesbyProduct.put('V',50);
        pricesbyProduct.put('W',20);
        pricesbyProduct.put('X',90);
        pricesbyProduct.put('Y',10);
        pricesbyProduct.put('Z',50);

        int sum = 0;
        int contorA = 0, contorB = 0;
        int contorE = 0;
        int contorF = -1;



        for (int i = 0; i < skus.length();i++) {
            if(!Character.isUpperCase(skus.charAt(i))) {
                return -1;
            }
            if(skus.charAt(i) =='F') {
                contorF++;
                if(contorF == 2) {
                    contorF = -1;
                   continue;
                }
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


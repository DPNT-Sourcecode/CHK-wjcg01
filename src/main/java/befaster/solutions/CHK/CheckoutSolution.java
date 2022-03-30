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
        pricesbyProduct.put('K',70);
        pricesbyProduct.put('L',90);
        pricesbyProduct.put('M',15);
        pricesbyProduct.put('N',40);
        pricesbyProduct.put('O',10);
        pricesbyProduct.put('P',50);
        pricesbyProduct.put('Q',30);
        pricesbyProduct.put('R',50);
        pricesbyProduct.put('S',20);
        pricesbyProduct.put('T',20);
        pricesbyProduct.put('U',40);
        pricesbyProduct.put('V',50);
        pricesbyProduct.put('W',20);
        pricesbyProduct.put('X',17);
        pricesbyProduct.put('Y',20);
        pricesbyProduct.put('Z',21);

        int sum = 0;
        int contorA = 0, contorB = 0;
        int contorE = 0;
        int contorF = -1;
        int contorH = 0;
        int contorK = 0;
        int contorN = 0;
        int contorP = 0;
        int contorQ = 0;
        int contorR = 0;
        int contorU = -1;
        int contorV = 0;
        int contorM = 0;
        int sumOfTree = 0;


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

            if(skus.charAt(i) =='U') {
                contorU++;
                if(contorU == 3) {
                    contorU = -1;
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
            if(skus.charAt(i) =='H') {
                contorH++;
            }
            if(skus.charAt(i) =='K') {
                contorK++;
            }
            if(skus.charAt(i) =='N') {
                contorN++;
            }
            if(skus.charAt(i) =='M') {
                contorM++;
            }
            if(skus.charAt(i) =='P') {
                contorP++;
            }
            if(skus.charAt(i) =='Q') {
                contorQ++;
            }
            if(skus.charAt(i) =='R') {
                contorR++;
            }


            if(skus.charAt(i) =='V') {
                contorV++;
            }


        }


        sum -=  simpleDeal(contorA,50,5,3,20);

        if(contorB > 0)
            sum -= contorE/2 * 30;
            contorB -= contorE/2;
        if (contorQ > 0)
            sum-= contorR/3 * 30;
            contorQ -= contorR/2;

        sum -= simpleDeal(contorB,15,2,-1,0);
        sum -= simpleDeal(contorH,20,10,5,5);
        sum -= simpleDeal(contorK,20,2,-1,0);
        sum -= simpleDeal(contorP,50,5,-1,0);
        sum -=  simpleDeal(contorQ,10,3,-1,0);
        sum -= simpleDeal(contorV,20,3,2,10);


        


        while((contorM > 0) && contorN/3 > 0 ) {
                sum -= 15;
                contorM--;
                contorN -= 3;
        }



        return sum;
    }
}

package zendesk.fizzbizz.test;

/**
 *
 * @author Michal Switala
 */
public class ZendeskFizzBuzzTest {
    
    
    void solution() {

        int number = 0;
        float remainder1;
        float remainder2;

        for (int x = 0; x < 100; x++) {

            number++;

            remainder1 = number % 5;
            remainder2 = number % 3;

            //System.out.println("remainders " +remainder2+ " " + remainder1);
            if (remainder1 == 0.0 && remainder2 == 0.0) {

                System.out.println("FizzBuzz");

            } else if (remainder2 == 0.0) {

                System.out.println("Fizz");

            } else if (remainder1 == 0.0) {

                System.out.println("Buzz");

            } else {

                System.out.println(number);
            }

        }

    }
    
    
    
    
    public static void main(String[] args) {
        
        
        
        ZendeskFizzBuzzTest zd = new ZendeskFizzBuzzTest();
        zd.solution();
        
        
        float remainder = 8 % 5;
        
        //debug
        System.out.println(remainder);
        
    }

}

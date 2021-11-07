package zendesk.fizzbizz.test;
/**
* # FizzBuzz
* Have you ever wondered how to pass famous FizzBuzz programming test on your interview ?
* Here is a simple solution for that if you need it.
*
* @author Michal Switala
* You can reach me out on : https://github.com/michaelPro89/
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

import javax.lang.model.util.ElementScanner14;

public class FizzBuzz{
    public static void main(String[] args){
        for (int i = 1; i < 40; i++){           
            if ( i % 15 == 0)
              System.out.println("Fizz Buzz");
            else if( i % 3 == 0)
              System.out.println("Fizz");
            else if( i % 5 == 0)
              System.out.println("BUzz");
            else
              System.out.println(i);
        }
    }
}
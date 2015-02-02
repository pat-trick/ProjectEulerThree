import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick on 2/1/15.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    long number = 600851475143L;
    List<Long> factors = new ArrayList<>();
    long divisor = 2;
    while (number > 1) {
      while ((number % divisor) == 0) {
        factors.add( divisor );
        number /= divisor;
      }
      divisor += 1;
    }
    System.out.println( "Largest Prime Factor is: " + factors.get( factors.size() -1 ) );
  }
}

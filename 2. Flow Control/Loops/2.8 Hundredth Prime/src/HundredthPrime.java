public class HundredthPrime {
   public static void main(String[] args) {
      /* Make a code that displays the 100th prime number */
      //TODO do this task

      int current = 1;
      int count = 1;

      while (count < 100) {
         current++;
         for(int divisor = current - 1; divisor > 1; divisor--){
            if(current % divisor == 0){
               break;
            }
            else if(divisor == 2){
               count++;
            }
         }
      }
      System.out.println(current);
   }
}
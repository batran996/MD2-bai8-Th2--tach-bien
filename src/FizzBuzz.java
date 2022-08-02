public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isfizz = number % 3 == 0;
        if (isfizz && number %5 ==0){
            return "fizzBuzz";
        }
        if (isfizz){
            return "fizz";
        }
        if (number %5 ==0){
            return "buzz";
        }
        return number + "";
    }
}

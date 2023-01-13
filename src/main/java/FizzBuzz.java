public class FizzBuzz {
    StringBuilder sb = new StringBuilder();

    public String convert(int num) {
        if (num % 3 == 0) {
            sb.append("Fizz");
        }
        if (num % 5 == 0) {
            sb.append("Buzz");
        }
        return sb.length() == 0 ? String.valueOf(num) : sb.toString() ;
    }


}

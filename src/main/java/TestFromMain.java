public class TestFromMain {
    //return the number - if otherwise
    //return Fizz - multiple of 3
    //return Buzz - multiple of 5
    //return FizzBuzz - multiple of 3 and 5
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        String num1 = fb.convert(1);
        System.out.println("When I convert the number 1, i should get back 1, but i actually get back: " +num1);

        String num3 = fb.convert(3);
        System.out.println("When I convert the number 3, i should get back Fizz, but i actually get back: " +num3);

        String num5 = fb.convert(5);
        System.out.println("When I convert the number 5, i should get back Buzz, but i actually get back: " +num5);

        String num15 = fb.convert(15);
        System.out.println("When I convert the number 15, i should get back FizzBuzz, but i actually get back: " +num15);
    }
}

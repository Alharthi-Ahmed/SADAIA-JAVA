public class FizzBuzzJazz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder output = new StringBuilder();
            
            if (i % 3 == 0) {
                output.append("Fizz");
            }
            if (i % 5 == 0) {
                output.append("Buzz");
            }
            if (i % 7 == 0) {
                output.append("Jazz");
            }
            if (output.length() == 0) {
                output.append(i);
            }
            
            System.out.println(output);
        }
    }
}

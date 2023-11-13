public class Dex2Hex {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: Please provide an input argument.");
            return;
        }

        try {
            int decimalValue = Integer.parseInt(args[0]);
            if (decimalValue < 0) {
                System.out.println("Error: Please provide a non-negative integer.");
                return;
            }

            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem;
            int num = decimalValue;
            String hexadecimal = "";

            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + (hexadecimal.isEmpty() ? "0" : hexadecimal));
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide a valid integer.");
        }
    }
}

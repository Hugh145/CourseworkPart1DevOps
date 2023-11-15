import java.util.Scanner;

class Dex2Hex {
    public static String convertToHexadecimal(int demValue) {
        if (demValue == 0) {
            return ("Please input a non-zero value");
        }
        if (demValue < 0) {
            return ("Please input positive numbers only");
        }
        char ch[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        int rem;

        while (demValue != 0) {
            rem = demValue % 16;
            hexadecimal = ch[rem] + hexadecimal;
            demValue = demValue / 16;
        }

        return hexadecimal;
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please input a value");
            return;
        }

        int decimalValue;
        try {
            decimalValue = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format. Please input a valid decimal value.");
            return;
        }

        System.out.println("Converting the Decimal Value " + decimalValue + " to Hex...");
        System.out.println("Hexadecimal representation is: " + convertToHexadecimal(decimalValue));
    }
}

import java.util.Scanner;

class Dex2Hex
{
    public static String hexConvert(int number) {
         
        if (number == 0) {
            return ("Please enter in value");
        }
        if (number < 0) {
                return ("Please enter in positive numbers only");
                
        }
        
        char ch[]={‘0’,’1’,’2’,’3’,’4’,’5’,’6’,’7’,’8’,’9’,’A’,’B’,’C’,’D’,’E’,’F’};
        
        
        String hexadecimal="";
        int rem;

        while(number != 0)
        {
            rem=number%16;
            hexadecimal= ch[rem] + hexadecimal;
            number= number/16;
        }
        
        return hexadecimal;
    }
    public static void main(String args[])
    {
       if (args.length == 0)
        {
            System.out.println("Please input a value");
            return;
        }
        int number;
        try {
            number = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid format. Please input decimal value.");
            return;
        }
       
        System.out.println("Converting the Decimal Value " + number + " to Hex…”);
        System.out.println("Hexadecimal representation is: " + hexConvert(number));
    }
}

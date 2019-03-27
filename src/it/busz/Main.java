package it.busz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long qty  = Long.parseLong(input.nextLine());
       for(;qty>=1;qty--)
        {
            String in = input.nextLine();
            System.out.println(interpret(in));
        }
    }
    private static String interpret(String line)
    {
        String[] numbers = line.split(" ");
        long a = Long.parseLong(numbers[0]);
        long b = Long.parseLong(numbers[1]);
        return Long.toString(calculate(a,b));
    }

    private static long reverse(long number)
    {
        String num = Long.toString(number);
        StringBuilder reversed = new StringBuilder();
        boolean zero= false;
        for(int i = num.length()-1;i>=0;i--)
        {
            if (!(num.charAt(i)=='0')){
                if(!zero)
                zero = true;

                reversed.append(num.charAt(i));}
            else if (num.charAt(i)=='0' && zero)
                reversed.append(num.charAt(i));
        }
        return Long.parseLong(reversed.toString());
    }

    private static long calculate(long a , long b)
    {
        return reverse((reverse(a)+reverse(b)));
    }

}

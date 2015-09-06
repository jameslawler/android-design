package com.jameslawler.design;

/**
 * Created by james on 06/09/2015.
 */
public class FizzBuzz {
    private static Boolean IsDivisibleByThree(Integer number)
    {
        return number % 3 == 0;
    }
    private static Boolean IsDivisibleByFive(Integer number)
    {
        return number % 5 == 0;
    }

    public static String GetOutput(Integer number)
    {
        if (IsDivisibleByFive(number) &&
                IsDivisibleByThree(number))
        {
            return "FizzBuzz";
        }

        if (IsDivisibleByThree(number))
        {
            return "Fizz";
        }

        if (IsDivisibleByFive(number))
        {
            return "Buzz";
        }

        return number.toString();
    }
}

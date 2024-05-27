package code;

public class NumerologyCalculator {


    public static int calculateLifePathNumber(int day, int month, int year) {
        int daySum = reduceToSingleDigit(day);
        int monthSum = reduceToSingleDigit(month);
        int yearSum = reduceToSingleDigit(year);
        return reduceToSingleDigit(daySum + monthSum + yearSum);
    }

    private static int reduceToSingleDigit(int number) {
        while (number > 9) {
            if (isMasterNumber(number)) {
                return number; // stop reduction if it's a Master Number
            }
            number = sumDigits(number); // continue reduction otherwise
        }
        return number;
    }

    
    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    
    public static boolean isMasterNumber(int number) {
        return number == 11 || number == 22 || number == 33;
    }
}


package code;

import java.util.*; 

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the birthday (dd-mm-yyyy):");
        String birthday = scanner.nextLine();
        int[] dateParts = DateUtility.parseDate(birthday);
        if (!DateUtility.isValidDate(dateParts[0], dateParts[1], dateParts[2])) {
            System.out.println("Invalid date. Please enter a date between 1901 and 2024.");
            return;
        }
        int lifePathNumber = NumerologyCalculator.calculateLifePathNumber(dateParts[0], dateParts[1], dateParts[2]);
        ColourMap cMap = new ColourMap();
        String luckyColour = cMap.getLuckyColour(lifePathNumber);
        boolean isMaster = NumerologyCalculator.isMasterNumber(lifePathNumber);
        String generation = GenerationFinder.findGeneration(dateParts[2]);

        System.out.println("Life Path Number: " + lifePathNumber);
        System.out.println("Lucky Colour: " + luckyColour);
        System.out.println("Is a Master Number: " + (isMaster ? "Yes" : "No"));
        System.out.println("Generation: " + generation);
    }
}

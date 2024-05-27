package code;

public class GenerationFinder {

	 public static String findGeneration(int year) {
	        if (year < 1946) return "Silent Generation";
	        else if (year < 1965) return "Baby Boomers";
	        else if (year < 1980) return "Generation X";
	        else if (year < 1995) return "Millennials";
	        else if (year < 2010) return "Generation Z";
	        else return "Generation Alpha";
	    }
	
}

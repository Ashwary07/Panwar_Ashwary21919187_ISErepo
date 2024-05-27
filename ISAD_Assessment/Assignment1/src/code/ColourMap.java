package code;
import java.util.*;

public class ColourMap {
	
	public ColourMap() {
		addColorsToMap();
	}
	
    private final Map<Integer, String> colourMap = new HashMap<>();

    public void addColorsToMap() {
    	
    	colourMap.put(1, "Red");
        colourMap.put(2, "Orange");
        colourMap.put(3, "Yellow");
        colourMap.put(4, "Green");
        colourMap.put(5, "Sky Blue");
        colourMap.put(6, "Indigo");
        colourMap.put(7, "Violet");
        colourMap.put(8, "Magenta");
        colourMap.put(9, "Gold");
        colourMap.put(11, "Silver");
        colourMap.put(22, "White");
        colourMap.put(33, "Crimson");     
    }
        
    

    public String getLuckyColour(int number) {
        return colourMap.getOrDefault(number, "Unknown");
    }
}

import java.io.*;
import java.util.*;

public class RandomStringChooser {
	protected String[] strArray;
	protected boolean[] chosenArray;
	protected int arraySize;
	protected int chosenNumber;
	
	public RandomStringChooser() {
		arraySize = 0;
		chosenNumber = 0;
	}
	
	public RandomStringChooser(String[] iStrArray) {
		chosenNumber = 0;
		arraySize = iStrArray.length;
		strArray = new String[arraySize];
		chosenArray = new boolean[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			strArray[i] = iStrArray[i];
			chosenArray[i] = false;
		}
	}
	
	public String getNext () {
		String str = "NONE";		
		int unchosenNumber = arraySize - chosenNumber;
		if(unchosenNumber <= 0)
			return str;
	
		int idx = 0;
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt( unchosenNumber );
		for(int i = 0; i < arraySize; i++) {
			if( (!chosenArray[i]) && idx == randomInt) {
				str = strArray[i];
				chosenArray[i] = true;
				chosenNumber++;
				break;
			}
			else if ( (!chosenArray[i]) && idx != randomInt) {
				idx++;
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String[] wordArray = {"wheels", "on", "the", "bus"};
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for(int k = 0; k < 6; k++) {
			System.out.print(sChooser.getNext() + " ");
		}
	}
}



public class RandomLetterChooser extends RandomStringChooser {
	public RandomLetterChooser(String str) {
		super();
		// TODO Auto-generated constructor stub
		strArray = this.getSingleLetters(str);
		arraySize = strArray.length;
		chosenNumber = 0;
		chosenArray = new boolean[arraySize];
		for(int i = 0; i < arraySize; i++) {
			chosenArray[i] = false;
		}
	}
	
	public static String[] getSingleLetters(String str) {
		int size = str.length();
		String[] res = new String[size];
		for(int i = 0; i < size; i++) {
			res[i] = Character.toString( str.charAt(i) );
		}
		return res;
	}
	
	public static void main(String[] args) {
		RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
		for(int k = 0; k < 4; k++) {
			System.out.print( letterChooser.getNext() );
		}
	}
}

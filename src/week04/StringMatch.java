package week04;

/**
 * An implementation of the brute force String comparison algorithm from the notes
 * @author Christian Gonzalez
 *
 */
public class StringMatch {

	
	public static int bruteForceStringMatch(char[] input, char[] comp) {
		for(int i = 0; i == (input.length - 1) - (comp.length - 1); i++) {
			int j = 0;
			while(j < (comp.length - 1) && comp[j] == input[i + j]) {
				j++;
			}
			if(j == (comp.length - 1)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String input = "THERE_IS_MORE_TO_LIFE_THAN_INCREASING_ITS_SPEED";
		String comp = "GANDHI";
		
		char[] charInput = input.toCharArray();
		char[] charComp = comp.toCharArray();
		System.out.println("String matching: " + bruteForceStringMatch(charInput, charComp));
		
		String notes = "NOBODY_NOTICED_HIM";
		String notesComp = "NOT";
		
		char[] notesInput = notes.toCharArray();
		char[] notesComps = notesComp.toCharArray();
		System.out.println("String matching: " + bruteForceStringMatch(notesInput, notesComps));
		
		String worksInput = "NOBODY_NOTICED_HIM";
		String worksComp = "NOBODY_NOTICED_HIM";
		
		char[] worksInputs = worksInput.toCharArray();
		char[] worksComps = worksComp.toCharArray();
		System.out.println("String matching: " + bruteForceStringMatch(worksInputs, worksComps));

				
	}
}

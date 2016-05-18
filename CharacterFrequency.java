import java.util.Scanner;
public class CharacterFrequency {
	private static int temp;
	private static String number;
	private static int[] frequency = new int[10];
	private void getNumber() {
		System.out.println("Input a 10 digit number sequence.");
		Scanner keys = new Scanner(System.in);
		number = keys.next();		
		
		while (number.length() != 10) { 
			System.out.println("Enter a 10 digit number sequence.");
			number = keys.next();
			}
		}
	private void countFrequency() {
		for (int x = 0; x < number.length(); x++) {
			temp = Character.getNumericValue(number.charAt(x));			
			for (int y = 0; y < frequency.length; y++) {
				if (temp == y) {
					frequency[y]++;
					}
				}
			}
		}
	private void display() {
		for (int x = 0; x < frequency.length; x++) {
			System.out.println(frequency[x]);
			}
		}		
	
	
	public static void main(String[] args) {
		CharacterFrequency demo = new CharacterFrequency();
		demo.getNumber();
		demo.countFrequency();
		demo.display();		
		}				
	}
	
	

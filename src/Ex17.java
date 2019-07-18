
public class Ex17 {
	public static void main(String[] args) {
		
		//use a left-justified printf followed by a right-justified printf	
		int height = 10;
		for (int i = 0; i < height; i++) {
			//printFormattedLine(i);
			leftString(i);
			if(i % 2 == 0) {
				rightString(i);
			}
			else {
				rightString(i - 1);
			}
		}
	}
	
	public static void leftString(int num) {
		int numOfStars = num / 2;
		String string = "";
		if (num % 2 == 1) {
			string = " ";
		}
		else {
			string = "";
		}
		if (num % 2 == 1) {
			for(int i = 0; i <= numOfStars; i++) {
				string += "* ";
			}
		}
		else {
			for(int i = 0; i <= numOfStars - 1; i++) {
				string = string + "* ";
			}
		}
		if (num % 2 == 1) {
			System.out.printf("%11s", string);
		}
		else {
			System.out.printf("%10s", string);
		}
		//System.out.println("row #" + num + " | length of asterisk bit: " + string.length());
		
		
	}
	
	public static void rightString(int num) {
		int numOfStars = num / 2;
		
		String string = "";
		for(int i = 0; i <= numOfStars; i++) {
			string = string + "* ";
			}
		System.out.println(string);
	}
	
	public static void printFormattedLine(int num) {
		//String leftSide = leftString(num);
		//String rightSide = rightString(num);
		
		//System.out.printf("%-5s",leftSide);
		//System.out.printf("%-5s", rightSide + "\n");
	}
}

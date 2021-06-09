
public class LineComparision {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line  Comparision computation");
		// variable
		double x1=1, x2=2, y1=4, y2=2, lengthOfLine1;
		
		// calculation
		lengthOfLine1 = Math.sqrt( (Math.pow((x2-x1),2))  + Math.pow((y2-y1),2) );
		System.out.println("length of line :" +lengthOfLine1)
	}

}

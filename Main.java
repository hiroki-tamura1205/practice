import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {
        	Scanner stdin = new Scanner(System.in);
        	double height = stdin.nextDouble();
        	double weight = stdin.nextDouble();
        	double BMI = weight / ( height * height );
		System.out.println( BMI );
	}
}



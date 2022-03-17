import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {
        	Scanner stdin = new Scanner(System.in);
		int cnt = 0;
		while( cnt < 2 ) {
        		double height = stdin.nextDouble();
        		double weight = stdin.nextDouble();
        		double BMI = weight / ( height * height );
			System.out.println( BMI );
			cnt++;
		}
	}
}



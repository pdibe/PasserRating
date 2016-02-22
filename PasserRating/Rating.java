package PasserRating;
import java.util.Scanner;
public class Rating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double att;
		double cmp;
		double tds;
		double yds;
		double inter;
		System.out.println("Attempts");
		att = input.nextInt();
		System.out.println("Completions");
		cmp = input.nextInt();	
		System.out.println("Touchdowns");
		tds = input.nextInt();
		System.out.println("Yards");
		yds = input.nextInt();
		System.out.println("Interceptions");
		inter = input.nextInt();
		double a = ((cmp/att)-.3)*5.0;
		double b = ((yds/att)-3.0)*0.25;
		double c = ((tds/att)*20.0);
		double d = 2.375-((inter/att)*25.0);
		double rating = ((a+b+c+d)/6.0)*100.0;
		System.out.println("Passer rating = " + rating);
		
		}

}

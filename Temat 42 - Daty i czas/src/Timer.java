import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("If you want to start a timer - press ENTER!");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Instant i1 = Instant.now();
		System.out.println("If you want to stop the timer - press ENTER!");
		sc.nextLine();
		Instant i2 = Instant.now();
		Duration timeGap = Duration.between(i1, i2);
		System.out.println(timeGap.getSeconds());
		
		
	}

}

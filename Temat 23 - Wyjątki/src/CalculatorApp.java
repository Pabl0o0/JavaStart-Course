import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) throws ArithmeticException, UnknownOperatorException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double a = 0;
		double b =0;
		String operator = null;
		
		boolean error = false;
		while(!error){
			try{
				System.out.println("Wprowadz 2 liczby: a i b ");
				System.out.println("a = ");
				a = sc.nextDouble();
				sc.nextLine();
				System.out.println("Wprowadz operator matematyczny: +,-,* lub / ");
				operator = sc.nextLine();
				System.out.println("b = ");
				b = sc.nextDouble();
				sc.nextLine();
				error = true;
			} catch(InputMismatchException ex) {
                System.out.println("Nie poda³eœ liczby typu double, spróbuj jeszcze raz: ");
                sc.nextLine();
		}
	  } 
		Calculator calc = new Calculator();
		double result = 0;
		boolean calculationComplete = false;
		try{
			result = calc.calculate(a, b, operator);
			calculationComplete = true;
		} catch (ArithmeticException | UnknownOperatorException e){
			System.err.println(e.getMessage());
		}
		if(calculationComplete) {
            System.out.println(a + operator + b + " = " + result);
        } else {
            System.out.println("Nie mo¿na by³o obliczyæ wyniku wyra¿enia " + a + operator + b);
        }
		
		sc.close();
		
	}
}



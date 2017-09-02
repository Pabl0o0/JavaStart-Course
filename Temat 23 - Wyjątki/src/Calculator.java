
public class Calculator {

	public final String plus = "+";
	public final String minus = "-";
	public final String divide = "*";
	public final String multiply = "/";
	double result;
	
	public double calculate(double a, double b, String operator) throws ArithmeticException, UnknownOperatorException {
		switch(operator) {
		case plus:
			result = a+b;
			break;
		case minus:
			result= a-b;
			break;
		case divide:
			result = a*b;
			break;
		case multiply: 
			if (b==0){
				throw new ArithmeticException("NIE MO¯NA DZIELIÆ PRZEZ ZERO !");
			}
			else{
				result = a/b;
			}
			break;
		default:
			throw new UnknownOperatorException("wykorzystujesz niepoprawny operator metematyczny !");
		}
		return result;
	}
	
	
	}


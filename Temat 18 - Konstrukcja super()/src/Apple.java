
public class Apple extends Fruit {

	private String odmiana;
	
	public Apple(String odmiana){
		this.odmiana=odmiana;
	}
	
	public void printInfo(){
		super.printInfo();
		System.out.println("Jab³ko "+odmiana);
	}
}

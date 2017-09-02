import java.util.InputMismatchException;
import java.util.NoSuchElementException;
 
public class Main {
 
    public static void main(String[] args) {
        Main main = new Main();
 
        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;
 
        boolean readComplete = false;
        while (!readComplete) {
            try {
                main.printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzi�e� dane w z�ym formacie, spr�buj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kszta�tu jest niepoprawny, spr�buj ponownie");
            }
        }
 
        System.out.println(shape);
 
        shapeCalc.closeScanner();
    }
 
    public void printOptions() {
        System.out.println("Wybierz figur�, dla kt�rej chcesz obliczy� pole i obw�d:");
        System.out.println(Shape.RECTANGLE + " - prostok�t");
        System.out.println(Shape.CIRCLE + " - ko�o");
        System.out.println(Shape.TRIANGLE + " - tr�jk�t");
    }
 
}
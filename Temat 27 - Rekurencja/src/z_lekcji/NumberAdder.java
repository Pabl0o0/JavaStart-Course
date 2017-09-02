package z_lekcji;

public class NumberAdder {
    public static void main(String[] args) {
        NumberAdder adder = new NumberAdder();
         
        int number = adder.sum(50);
        System.out.println(number);
    }
     
    public int sum(int n) {
        return n>1? n + sum(n-1) : n;
    }
}
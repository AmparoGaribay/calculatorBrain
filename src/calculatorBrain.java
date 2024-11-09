import java.util.Scanner;

public class calculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatorBrain calculdora = new calculatorBrain();
		System.out.println("ingresa dos numeros para las operacinones ");
		System.out.println("num1");
		Scanner console = new Scanner( System.in );
		int num1 = console.nextInt();
		System.out.println("num1");
		int num2 = console.nextInt();
		System.out.println("suma ");
		System.out.println(calculdora.addition(num1, num2));
		System.out.println("Resta");
		System.out.println(calculdora.resta(num1, num2));
		System.out.println("Multiplicacion");
		System.out.println(calculdora.mutiplicacion(num1, num2));
		System.out.println("division");
		System.out.println(calculdora.division(num1, num2));
		
		System.out.println("potencia ");
		System.out.println(calculdora.potencia(num1, num2));
		System.out.println("raiz");
		System.out.println(calculdora.raiz( num2));
		
	}
	
	private int addition(int a, int b) {
		return a+b;
	}
	private int resta(int a, int b) {
		return a-b;
	}
	private int mutiplicacion (int a, int b) {
		return a*b;
	}
	public double division(double num1, double num2) {
		num2= (num2==0)?1:num2;
		return num2/num1;
	}
	public int potencia(int num1, int num2) {
		return (int)(Math.pow(num1, num2));
	}
	public int raiz (int num2) {
		return (int )(Math.sqrt(num2));
	}
	
	
	
}

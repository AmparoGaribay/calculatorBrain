
public class MetodosDemo {

	public static void main(String[] args) {
		//se mada llamar al metofo de la clase
		
		System.out.println(MetodosDemo.sum(40,30));///para la instancia necesitar el nombre de la clase
		System.out.println(MetodosDemo.sum(2,30));
		System.out.println(MetodosDemo.sum(5,7,3));
		System.out.println(sum(4,3));
		
		
		System.out.println("construcion del objeto ");
		MetodosDemo demp= new MetodosDemo();// se construye el objeto
		///se mada llmar al metodo mediante el objeto // metodo de instancia.
		System.out.println(demp.mutliplica(9,9));//metodo de instancia 
		///tdos los metodos distintos de tipo estatico se necesita construir un objeto. 
		System.out.println(demp.mutliplica(9,9,2.5,3.5));
		System.out.print(demp.cadena(" cantidad de carateres " +"solo"));
		
	}
	
	public int cadena(String cadenaEntrada) {
		int numeroCaracteres =cadenaEntrada.length();
		return numeroCaracteres; 
		
	}
	
	public static int sum(int a, int b) {//metodo de clase 
		return (a+b);
	}
	public static int sum(int a, int b, int c) {//metodo de clase 
		return (a+b+c);
	}	
	
	public int mutliplica(int num1, int num2) {
		return num1*num2;
		
	}
	public int mutliplica(int num1, int num2, double k) {
		return num1*num2;
		
	}

	public double mutliplica(int num1, int num2, double df, double s) {//nota 
		//el tpo d dato debe cincidir con la salida
		return num1*num2*df*s;
		
	}

	/*overloading  est tambien la sobrecarga de metodos la cual nos permite escbrir 
	 * metodos que se llaman igual pero reciben parametros diferentes */


}

package unidad01;

public class Factorial {
	
	public int factorial(int numero) {
		if(numero==1) {
			return 1;
		}else {
			return numero * factorial(--numero);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		
		System.out.print(f.factorial(7));

	}

}

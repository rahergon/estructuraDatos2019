package paquete01;

public class NumerosRandom {

	public static void main(String[] args) {
		int numero=0;
		for(int i=0;i<=10;i++) {
			numero = (int) (Math.random() * 9) + 1;
			System.out.println(numero);
		}
		
		

	}

}

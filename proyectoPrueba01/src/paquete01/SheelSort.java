package paquete01;

public class SheelSort {
	//private int[] c = {3, 7, 6, 4, 12, 1, 10, 11};
	private int[] c = {40,13,11,56,78,34,21,45,67,89,1,4,6,12};
	
	private StringBuilder imprimir() {
		StringBuilder respuesta =  new StringBuilder();
		
		for(int i=0; i<c.length;i++) {
			respuesta.append(c[i] + " ");
		}
		return respuesta;
	}
	
	private void sheelSort() {
		int salto = c.length/2;
		while(salto>=1) {
			boolean swap = true;
			while(swap) {
				swap=false;
				for(int i=0; i<c.length-salto;i++) {
					if(c[i]>c[i+salto]) {
						int temp = c[i];
						c[i] = c[i+salto];
						c[i+salto] =temp;
						swap=true;
					}
				}
			}
			salto = salto/2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SheelSort s = new SheelSort();
		
		System.out.println(s.imprimir().toString());
		s.sheelSort();
		System.out.println(s.imprimir().toString());
		
		

	}

}

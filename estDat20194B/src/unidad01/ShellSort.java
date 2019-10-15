package unidad01;

public class ShellSort {
	private int[] c = {34,12,3,1,45,56,78,90, 57, 0, 23};
	
	public StringBuilder imprimir() {
		StringBuilder respuesta= new StringBuilder();
		
		for(int i=0; i<c.length; i++) {
			respuesta.append(c[i]+" ");
		}
		
		return respuesta;
	}
	public void shellSort() {
		int salto = c.length/2;
		
		while(salto>=1) {
			boolean swap = true;
			while(swap) {
				swap = false;
				for(int i=0; i<c.length-salto;i++) {
					if(c[i]>c[i+salto]) {
						int temp = c[i];
						c[i] = c[i+salto];
						c[i+salto] = temp;
						swap = true;
					}
				}
			}
			salto = salto/2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort s = new ShellSort();
		
		System.out.println(s.imprimir().toString());
		s.shellSort();
		System.out.println(s.imprimir().toString());
		
		

	}

}

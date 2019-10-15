package paquete01;

public class ShellSort {
	
	public void sheelSort(Lectura[] c) {
		int salto = c.length/2;
		while(salto>=1) {
			boolean swap = true;
			while(swap) {
				swap=false;
				for(int i=0; i<c.length-salto;i++) {
					if(c[i].compareTo(c[i+salto])==1) {
						Lectura temp = c[i];
						c[i] = c[i+salto];
						c[i+salto] =temp;
						swap=true;
					}
				}
			}
			salto = salto/2;
		}
		
	}

}

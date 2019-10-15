package unidad01;

public class ShellSort1 {
	
public StringBuilder imprimir(Lectura[] c) {
	StringBuilder respuesta = new StringBuilder();
	
	for(int i=0; i<c.length; i++) {
		respuesta.append(c[i]+"\n");
	}
	
	return respuesta;
}
public void shellSort(Lectura[] c) {
	int salto = c.length/2;
	
	while(salto>=1) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for(int i=0; i<c.length-salto;i++) {
				if(c[i].compareTo(c[i+salto])==1) {
					Lectura temp = c[i];
					c[i] = c[i+salto];
					c[i+salto] = temp;
					swap = true;
				}
			}
		}
		salto = salto / 2;
	}
	
}
}

package unidad01;

public class Burbuja {
	//int[] calificaciones = {8,10,7,5,13,21,27};
	int[] calificaciones = {5,16,17,21,30};
	//,56,89,100,200,1,2,20
	
	public StringBuilder imprimir() {
		StringBuilder respuesta = new StringBuilder();
		
		for(int piv=0; piv<calificaciones.length; piv++) {
			respuesta.append("el valor en la posición "+(piv+1)+" es: "+calificaciones[piv]+"\n");
		}
		
		return respuesta;
	}
	public void ordenar() {
		
		for(int piv=0; piv<calificaciones.length-1; piv++) {
			for(int pos=piv+1;pos<calificaciones.length;pos++) {
				if(calificaciones[pos]>calificaciones[piv]) {
					int temp = calificaciones[pos];
					calificaciones[pos] = calificaciones[piv];
					calificaciones[piv] = temp;					
				}
			}
		}
	}
	public boolean secuencial(int numero) {
		boolean respuesta = false;
		
		for(int piv=0; piv<calificaciones.length; piv++) {
			if(calificaciones[piv]==numero) {
				respuesta=true;
			}
		}
		
		return respuesta;
	}
	public boolean secuencialMejorado(int numero) {
		boolean respuesta = false;
		
		
		
		return respuesta;
	}
	public boolean busquedaBinaria(int numero) {
		boolean respuesta = false;
		
		int sup=0;
		int inf=calificaciones.length-1;
		//int medio = (sup+inf)/2;
		//System.out.println(sup + " "+ medio + " " + inf);
		
		
		while(sup!=inf && !respuesta) {
			int medio = (sup+inf)/2;
			System.out.println(sup + " "+ medio + " " + inf);
			if(numero==calificaciones[medio]) {
				respuesta=true;
			}else {
				if(calificaciones[medio]>numero) {
					sup=medio+1;
				}else {
					inf=medio-1;
				}
			}
			
			
			
		}		
		return respuesta;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burbuja burbuja = new Burbuja();
		
		//System.out.println(burbuja.imprimir());	
		burbuja.ordenar();
		System.out.println(burbuja.imprimir());
		
		if(burbuja.busquedaBinaria(21)) {
			System.out.println("valor encontrado");
		}else {
			System.out.println("valor no encontrado");
		}
	}

}

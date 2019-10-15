package unidad01;

public class Burbuja {
	private int[] calificaciones = {14,8,7,10,5,3, 21, 18,90,100};
	
	public void burbuja() {
		
		for(int piv=0;piv<calificaciones.length-1;piv++) {
			for(int pos=piv+1;pos<calificaciones.length;pos++) {
				if(calificaciones[pos]>calificaciones[piv]) {
					int temp = calificaciones[pos];
					calificaciones[pos] = calificaciones[piv];
					calificaciones[piv] = temp;
				}
				
			}
		}
		
	}
	public boolean secuencial(int num) {
		boolean respuesta=false;
		for(int piv=0; piv<calificaciones.length;piv++) {
			if(num==calificaciones[piv]) {
				respuesta=true;
			}
		}		
		return respuesta;
	}
	public boolean secuencialMejorado(int num) {
		boolean respuesta=false;
		
		return respuesta;
	}
	public boolean busquedaBinaria(int num) {
		boolean respuesta=false;
		
		
		
		return respuesta;
	}
	public StringBuilder imprimir() {
		StringBuilder respuesta= new StringBuilder();

		respuesta.append("inicio \n");
		for(int i=0; i<calificaciones.length;i++) {
			respuesta.append("valor en la posición "+(i+1)+" es: "+calificaciones[i]+"\n");
		}
		
		return respuesta;
	}

	public static void main(String[] args) {
		
		Burbuja bur = new Burbuja();
		
		//System.out.print(bur.imprimir().toString());
		
		bur.burbuja();
		
		//System.out.print(bur.imprimir().toString());
		
		if(bur.secuencial(19)) {
			System.out.println("valor encontrado");
		}else {
			System.out.println("valor no encontrado");
		}

	}

}

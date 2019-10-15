package unidad01;

public class BusquedaBinaria {
	
	private int[] c = {15, 10, 8, 6, 3, 2};
	
	public boolean Busqueda(int numero) {
		boolean respuesta = false;
		
		int sup = 0;
		int inf= c.length-1;
		
		while(!respuesta) {
			int medio = (sup+inf)/2;
			if(c[medio]==numero) {
				respuesta=true;
			}else {
				if(sup==medio && medio==inf) {
					break;
				}
				if(numero<c[medio]) {
					sup = medio+1;
				}else {
					inf = medio-1;
				}
			}
		}
		
		return respuesta;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusquedaBinaria b= new BusquedaBinaria();
		
		
		//15, 10, 8, 6, 3, 2
		System.out.println(b.Busqueda(15));
		System.out.println(b.Busqueda(10));
		System.out.println(b.Busqueda(8));
		System.out.println(b.Busqueda(6));
		System.out.println(b.Busqueda(3));
		System.out.println(b.Busqueda(2));
		
		System.out.println(b.Busqueda(14));
		System.out.println(b.Busqueda(4));

	}

}

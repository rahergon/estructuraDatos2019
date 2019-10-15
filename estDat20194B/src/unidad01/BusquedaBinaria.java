package unidad01;

public class BusquedaBinaria {
	private int[] c = {15,10,8,6,3};

public boolean busqueda(int numero) {
	boolean respuesta = false;
	int sup = 0;
	int inf = c.length-1;
	
	while(!respuesta) {
		int medio = (sup+inf)/2;
		//System.out.println(sup+" "+medio+" "+inf);
		if(c[medio]==numero) {
			respuesta=true;
		}else {
			if(sup==inf && inf==medio) {
				break;
			}
			if(c[medio]>numero) {
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
		
		BusquedaBinaria b = new BusquedaBinaria();
		//15,10,8,6,3
		System.out.println(b.busqueda(15));
		System.out.println(b.busqueda(10));
		System.out.println(b.busqueda(8));
		System.out.println(b.busqueda(6));
		System.out.println(b.busqueda(3));
		
		System.out.println(b.busqueda(14));
		System.out.println(b.busqueda(5));
		
		

	}

}

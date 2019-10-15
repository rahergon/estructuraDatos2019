package paquete01;

public class BusquedaBinaria {
	private int[] calificaciones= {15,13,10,8,6,3,2};
	
	public boolean busqueda(int numero) {
		boolean respuesta = false;
		int sup = 0;
		int inf = calificaciones.length-1;
		
		while(!respuesta) {
			int medio = (sup+inf)/2;
			//System.out.println("sup:"+sup+" medio:"+medio+" inf:"+inf+" respuesta:"+respuesta);
			if(calificaciones[medio]==numero) {
				respuesta=true;
			}else {
				if(sup==inf && inf==medio) {
					break;
				}	
				if (numero<calificaciones[medio]) {
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
		
		BusquedaBinaria b= new BusquedaBinaria();
		
		//15,13,10,8,6,3,2
		
		System.out.println(b.busqueda(15));
		System.out.println(b.busqueda(13));
		System.out.println(b.busqueda(10));
		System.out.println(b.busqueda(8));
		System.out.println(b.busqueda(6));
		System.out.println(b.busqueda(3));
		System.out.println(b.busqueda(2));
		
		System.out.println(b.busqueda(14));
		System.out.println(b.busqueda(9));

	}

}

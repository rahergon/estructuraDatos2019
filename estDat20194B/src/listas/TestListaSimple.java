package listas;

public class TestListaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimple ls = new ListaSimple();
		ls.crear();
		System.out.println(ls.imprimir().toString());
		System.out.println(ls.insertar(10));
		System.out.println(ls.insertar(8));
		System.out.println(ls.insertar(21));
		System.out.println(ls.insertar(15));
		System.out.println(ls.insertar(14));
		System.out.println(ls.insertar(89));
		System.out.println(ls.insertar(400));
		System.out.println(ls.insertar(100));
		System.out.println(ls.insertar(67));
		System.out.println(ls.imprimir().toString());
		if(ls.eliminar(400)) {
			System.out.println("eliminado");
		}else {
			System.out.println("no se encontro el nodo");
		}
		System.out.println(ls.imprimir().toString());
		System.out.println(ls.insertar(500));
		System.out.println(ls.insertar(900));
		System.out.println(ls.insertar(677));
		System.out.println(ls.imprimir().toString());
		if(ls.buscar(90)) {
			System.out.println("encontrado");
		}else {
			System.out.println("no se encontro");
		}
		
		
		
		

	}

}

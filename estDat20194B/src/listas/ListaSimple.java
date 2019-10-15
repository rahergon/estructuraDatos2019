package listas;

public class ListaSimple {
	private Nodo head;
		
	public void crear() {
		this.head = null;
	}
	
	public StringBuilder imprimir() {
		StringBuilder respuesta = new StringBuilder();
		Nodo temporal=new Nodo();
		temporal = this.head;
		respuesta.append("head-->");
		while(temporal!=null) {
			respuesta.append(temporal.getInformacion());
			respuesta.append("-->");
			temporal = temporal.getSiguiente();
		}
		respuesta.append("null");		
		return respuesta;
	}
	public boolean insertar(int dato) {
		boolean respuesta=false;
		
		Nodo nuevo = new Nodo();
		nuevo.setInformacion(dato);
		nuevo.setSiguiente(null);
		
		if(this.getHead()==null) {
			this.setHead(nuevo);
			respuesta = true;
		}else {
			Nodo temporal;
			temporal = this.getHead();
			
			while(temporal.getSiguiente()!=null) {
				temporal = temporal.getSiguiente();
			}
			
			temporal.setSiguiente(nuevo);
			respuesta=true;
		}
		
		return respuesta;
	}

	public Nodo getHead() {
		return head;
	}

	public void setHead(Nodo head) {
		this.head = head;
	}
	
	

}

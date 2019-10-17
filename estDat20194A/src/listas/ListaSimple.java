package listas;

public class ListaSimple {
	private Nodo head;
	
	public ListaSimple() {
		this.setHead(null);
	}
	public boolean insertar(int dato) {
		boolean respuesta = false;
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
			respuesta = true;
		}
		return respuesta;		
	}
	
	public boolean eliminar(int dato) {
		boolean respuesta=false;
		Nodo temporal, anterior;
		
		temporal = this.getHead();
		anterior = null;
		
		while(temporal != null && temporal.getInformacion()!=dato) {
			anterior = temporal;
			temporal=temporal.getSiguiente();
		}
		if(temporal!=null) {
			if(anterior == null) {
				this.setHead(this.getHead().getSiguiente());
			}else {
				anterior.setSiguiente(temporal.getSiguiente());
			}
			respuesta=true;
		}
		return respuesta;
	}
	public boolean buscar(int dato) {
		boolean respuesta=false;
		Nodo temporal = this.getHead();
		
		while(temporal!=null && temporal.getInformacion()!=dato) {
			temporal = temporal.getSiguiente();
		}
		if(temporal!=null) {
			respuesta=true;
		}
		return respuesta;
	}
	
	public StringBuilder imprimir() {
		StringBuilder respuesta = new StringBuilder();
		Nodo temporal = null;
		temporal = this.getHead();
		
		respuesta.append("head-->");
		while(temporal!=null) {
			respuesta.append(temporal.getInformacion());
			respuesta.append("-->");
			temporal = temporal.getSiguiente();
		}
		respuesta.append("null");
				
		return respuesta;		
	}
	
	public Nodo getHead() {
		return head;
	}
	public void setHead(Nodo head) {
		this.head = head;
	}
	
	
	

}

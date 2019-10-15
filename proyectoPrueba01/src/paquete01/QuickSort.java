package paquete01;

public class QuickSort {
	//private int[] numeros= {6,70,15,23,35,3,14};
	private int[] numeros= {67,23,10,11,1,15,18,100,55,21,14};
	public int[] getNumeros() {
		return numeros;
	}
	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	
	public void quickSort(int inicio, int fin) {
		int izquierdo = inicio;
		int derecho = fin;
		boolean derechoM=true;		
		if(fin > inicio) {
			while(izquierdo!=derecho) {
				if(numeros[izquierdo]>numeros[derecho]) {
					int temporal = numeros[izquierdo];
					numeros[izquierdo] = numeros[derecho];
					numeros[derecho] = temporal;
					derechoM=!derechoM;
				}
				if(derechoM) {
					derecho--;
				}else {
					izquierdo++;
				}
			}
			quickSort(inicio, izquierdo-1);
			quickSort(izquierdo+1, fin);
			
			
		}
		//imprimir();
	}
	public void imprimir() {
		for(int i = 0; i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println("");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort q = new QuickSort();
		
		q.imprimir();
		q.quickSort(0, q.getNumeros().length-1);
		q.imprimir();

	}

}

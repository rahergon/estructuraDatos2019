package unidad01;

import java.util.Date;

public class Lectura implements Comparable {
	double grados;
	Date fh;
	int nDispositivo;
	
	public Lectura(double grados, Date fh, int nDispositivo) {
		this.grados = grados;
		this.fh = fh;
		this.nDispositivo = nDispositivo;		
	}

	@Override
	public String toString() {
		return "Lectura [grados=" + grados + ", fh=" + fh + ", nDispositivo=" + nDispositivo + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double dif = this.grados - ((Lectura) o).grados;
		if(dif==0.0) {
			return 0;
		}else if(dif<0.0) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
	

}

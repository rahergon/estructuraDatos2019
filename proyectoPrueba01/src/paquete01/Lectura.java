package paquete01;

import java.util.Calendar;
import java.util.Date;

public class Lectura implements Comparable {
	double grados;
	Date fh;
	
	public Lectura(double grados, Date fh) {
		this.grados = grados;
		this.fh = fh;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double dif = this.grados - ((Lectura)o).grados;
		if(dif == 0.0) {
			return 0;
		}else if(dif<0.0) {
			return -1;
		}else {
			return 1;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Grados: "+this.grados+" Fecha/hora: "+this.fh;
	}
	

}

package unidad01;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestLectura {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Lectura[] lecturas = new Lectura[4];
		ShellSort1 s = new ShellSort1(); 
		
		Calendar c = Calendar.getInstance();
		Date fh = c.getTime();
		
		
		lecturas[0] = new Lectura(21.50, fh, 1);
		
		TimeUnit.SECONDS.sleep(1);
		
		c = Calendar.getInstance();
		fh = c.getTime();
		
		lecturas[1] = new Lectura(20.50, fh, 1);
		
		TimeUnit.SECONDS.sleep(1);
		
		c = Calendar.getInstance();
		fh = c.getTime();
		
		lecturas[2] = new Lectura(28.50, fh, 2);
		
		TimeUnit.SECONDS.sleep(1);
		
		c = Calendar.getInstance();
		fh = c.getTime();
		
		lecturas[3] = new Lectura(18.50, fh, 2);
		
		System.out.println(s.imprimir(lecturas));
		s.shellSort(lecturas);
		System.out.println(s.imprimir(lecturas));
		
		
		
		
		
		
	}

}

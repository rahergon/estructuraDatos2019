package paquete01;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestLectura {


	public static void main(String[] args) throws InterruptedException {
		ShellSort s = new ShellSort();
		Lectura[] ls = new Lectura[4];
		// TODO Auto-generated method stub
		Calendar b = Calendar.getInstance();
		Date d = b.getTime();		
		ls[0] = new Lectura(21.45, d);
		
		TimeUnit.SECONDS.sleep(1);

		
		b = Calendar.getInstance();
		d = b.getTime();
		ls[1] = new Lectura(20.45, d);
		
		TimeUnit.SECONDS.sleep(1);

		
		b = Calendar.getInstance();
		d = b.getTime();
		ls[2] = new Lectura(25.45, d);
		
		TimeUnit.SECONDS.sleep(1);

		
		b = Calendar.getInstance();
		d = b.getTime();
		ls[3] = new Lectura(27.45, d);
		
		TimeUnit.SECONDS.sleep(1);

		
		for(int i=0; i<ls.length; i++) {
			System.out.println(ls[i]);			
		}
		
		s.sheelSort(ls);
		
		for(int i=0; i<ls.length; i++) {
			System.out.println(ls[i]);			
		}
		/*
		Calendar b = Calendar.getInstance();
		Calendar b1 = Calendar.getInstance();
		Date d = b.getTime();
		Date d1 = b1.getTime();
		int resp = d1.compareTo(d);
		
		System.out.print(resp);
		 */

	}

}

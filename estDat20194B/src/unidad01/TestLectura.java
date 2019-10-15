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
		Date d = c.getTime();
		//System.out.println(d);
		
		lecturas[0] = new Lectura(25.30, d, 1);
		
		TimeUnit.SECONDS.sleep(1);
		
		c = Calendar.getInstance();
		d = c.getTime();
		lecturas[1] = new Lectura(28.30, d, 2);
		
		TimeUnit.SECONDS.sleep(1);
		
		c = Calendar.getInstance();
		d = c.getTime();
		
		lecturas[2] = new Lectura(21.30, d, 1);
		
		TimeUnit.SECONDS.sleep(1);
		
		c = Calendar.getInstance();
		d = c.getTime();
		
		lecturas[3] = new Lectura(18.30, d, 2);
		
		for(int i=0;i<lecturas.length;i++) {
			System.out.println(lecturas[i]);
		}
		s.shellSort(lecturas);
		for(int i=0;i<lecturas.length;i++) {
			System.out.println(lecturas[i]);
		}
		

	}

}

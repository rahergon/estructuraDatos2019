package paquete01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo01 extends JFrame implements ActionListener {
	private JLabel lbl_mensaje;
	
	public Ejemplo01() {
		setTitle("Hola mundo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lbl_mensaje = new JLabel("mensaje 01");
		
		add(lbl_mensaje);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo01 ventana = new Ejemplo01();
		System.out.println("Hola mundo");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}

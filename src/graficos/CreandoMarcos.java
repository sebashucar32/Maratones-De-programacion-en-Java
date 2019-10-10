package graficos;

import javax.swing.*;

class MiMarco extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public MiMarco() {
		//setSize(500, 300);
		//setLocation(500, 300);
		//setResizable(false); no me deja ampliar el tamaño de la ventana solo el que esta establecido
		//setExtendedState(Frame.MAXIMIZED_BOTH);  Me expande la ventana a todo el tamaño de la pantalla
		setBounds(500, 300, 550, 250);
		setTitle("Mi ventana");
	}
}

public class CreandoMarcos 
{
	public static void main(String[] args) 
	{
		MiMarco marco1 = new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

package Java_Bingo_3_Cartones;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Aplicacion {

	// JFrame
	static JFrame aplicacionBingo = new JFrame("Juego Del Bingo a 3 Cartones ");

	// JPanel
	static JPanel Panel = new JPanel();
	JPanel JPanel = (JPanel) aplicacionBingo.getContentPane();

	// JText

	// Crear Cartones del bingo

	static Carton carton1 = new Carton();
	static Carton carton2 = new Carton();
	static Carton carton3 = new Carton();

	// Crear instancia de bola carton

	static BolaBingo Bola1 = new BolaBingo(90);
	static BolaBingo Bola2 = new BolaBingo(90);
	static BolaBingo Bola3 = new BolaBingo(90);

	static void lanzarVentana() {
		// Creo la Ventana

		// Creo el panel de la ventana

		// Creo el scroll de la Ventana
		JScrollPane scroll = new JScrollPane();

		// Se define el tamaño de JFrame principal
		aplicacionBingo.setSize(750, 800);
		// Configuro panel. Disposición nula, control total
		Panel.setLayout(null);
		Panel.setBackground(Color.BLUE);
//950
		Panel.setPreferredSize(new Dimension(0, 950));

		scroll.setViewportView(Panel);

		aplicacionBingo.add(scroll);

		aplicacionBingo.setVisible(true);
	}

	public static void main(String[] arg) {

		// Llamar al metodo Ventana

		lanzarVentana();
		// Generar cartones del bingo
		Bola1.inicializarImagenes();
		System.out.println(Bola1);
		System.out.println(carton1);
		Bola1.mostrarImagenes(Panel,100,260);
		carton1.MostrarCartonBlanco(Panel, 10, 10);
		
		

		//Panel.setComponentZOrder(carton1.JLabel_CartonBingoBlanco, 0);

		// Generamos el carton creando Carton 2
		Bola2.inicializarImagenes();
		Bola2.mostrarImagenes(Panel, 100, -50);
		carton2.MostrarCartonBlanco(Panel, 10, 307);
		

		//Panel.setComponentZOrder(carton2.JLabel_CartonBingoBlanco, 0);
		
		// Generamos el carton creando Carton 3
		Bola3.inicializarImagenes();
		Bola3.mostrarImagenes(Panel, 100, -350);
		carton3.MostrarCartonBlanco(Panel, 10, 604);

		

		//Panel.setComponentZOrder(carton3.JLabel_CartonBingoBlanco, 0);
		

	}

}

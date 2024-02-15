import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aplicacion {

	public static final String PATH = "C:\\Users\\Profesor\\Desktop\\FP Grado Superior\\01 Programación\\02 Ejercicios Java\\Bingo_3_Cartones\\src\\";
	// Frame que alberga la aplicación
	static JFrame jFM = new JFrame("Cuadro texto");
	// Panel asociado al Frame donde coloco los elementos.
	static JPanel jpanel = (JPanel) jFM.getContentPane();

	public static void main(String[] args) {

		lanzarVentana();

		CartonVDA carton1 = new CartonVDA();
		carton1.mostrarBolasCartonVDA(jpanel ,10,300);
		CartonVDA carton2 = new CartonVDA();
		carton2.mostrarBolasCartonVDA(jpanel,10,500);
		CartonVDA carton3 = new CartonVDA();
		carton3.mostrarBolasCartonVDA(jpanel,10,600);

		/*
		 * for (int i=0;i<carton1.BOLASTOTALES;i++) { carton1.mostrarBolaCarton(i); }
		 */
	}

	static void lanzarVentana() {
		// Creamos el scroll 
		JScrollPane scroll=new JScrollPane();
		
		// Creo la ventana principal
		jFM.setSize(842, 700);
		// Configuro panel. Disposición nula, control total
		jpanel.setLayout(null);
		jpanel.setBackground(Color.BLUE);

		//Creamos la dimension del JScroll 
		
		
		
		// añadimos  el Scroll a la ventana de la clase aplicacion 
		
		jFM.add(scroll);
		
		jFM.setVisible(true);
	}

}

package Java_Bingo_3_Cartones;

import java.awt.Component;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BolaBingo {

// Atributo de las numero de bolas de bolas_Bingo

	// Indice del array de bolas
	// public final int numBolasBingo;

	// Ruta de las imagenes de las bolas
	private final static String Ruta = "C:\\Users\\Profesor\\Desktop\\FP Grado Superior\\01 Programación\\02 Ejercicios Java\\Bingo_3_Cartones\\src\\imgBingo\\";

	// Array de Imagenes Bingo
	// ImageIcon ImagenesBolasBingo[];
	static ImageIcon[] imagenesBolasBingo = new ImageIcon[90];
	// Ruta de las Imagenes de las bolas Bingo
	int num;
	// ImageIcon NumBolas = new ImageIcon(Ruta + ".png");
	JLabel labelImagenes = new JLabel();

	private int numBolasBingo;
	int Index;
	String nombreImagen = (Ruta + (Index + 1) + ".png");
	// bolas totales de carton
	int bolasTotalesCarton = 15;

	public void inicializarImagenes() {
		for (int i = 0; i < 90; i++) {
			String nombreImagen = Ruta + (i + 1) + ".png";
			imagenesBolasBingo[i] = new ImageIcon(nombreImagen);
		}

		// generar 15 imagenes en el carton
		while (bolasTotalesCarton == 0) {
			for (int i = 0; i < bolasTotalesCarton; i++) {
				int numeroAleatorio = (int) (Math.random() * 90);
				ImageIcon imagen = imagenesBolasBingo[numeroAleatorio];
				labelImagenes.setIcon(imagen);
			}
			// salir del bucle

			bolasTotalesCarton = 1;
		}
	}

// Metodo que muestra las imagenes en los cartones con posiciones Fijas
	public void mostrarImagenes(JPanel panel, int posX, int posY) {
		
		/** @param_Descripcion: establecemos la posicion de las imagenes con filasX y columnasY en una array de posiciones */
		
		// Posiciones de las imágenes
		int[] filasX = { 139, 139, 200, 200, 262, 262, 324, 386, 386, 449, 449, 510, 572, 572, 635 };
		int[] columnasY = { 300, 382, 382, 464, 300, 464, 382, 300, 464, 300, 382, 464, 382, 464, 300 };
	

		for (int i = 0; i < 15; i++) {
			int numeroAleatorio = (int) (Math.random() * 90);
			ImageIcon mostrarImagen = imagenesBolasBingo[numeroAleatorio];

			JLabel labelImagenBingo = new JLabel(mostrarImagen);
			labelImagenBingo.setBounds(filasX[i]-posX, columnasY[i]-posY, 55, 55); // Ajusta el tamaño según tus necesidades

			panel.add(labelImagenBingo);
		}

		panel.repaint();
	}

	BolaBingo(int numBolasBingo) {

		this.numBolasBingo = numBolasBingo;
		inicializarImagenes();

	}

}
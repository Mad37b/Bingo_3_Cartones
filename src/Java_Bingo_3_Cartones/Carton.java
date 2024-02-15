package Java_Bingo_3_Cartones;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carton {
	// llamar a las imagenes de los cartones

	final static String Ruta = "C:\\Users\\Profesor\\Desktop\\FP Grado Superior\\01 Programación\\02 Ejercicios Java\\Bingo_3_Cartones\\src\\imgBingo\\";

	// Generar ImagenCartonBlanco

	ImageIcon MostrarCartonBlanco = new ImageIcon(Ruta + "cartonBingoEnBlanco.png");
	// Añadir CartonBlanco a la aplicacion
	JLabel JLabel_CartonBingoBlanco = new JLabel(MostrarCartonBlanco);

	public void MostrarCartonBlanco(JPanel Panel, int PosX, int PosY) {

		ImageIcon MostrarCartonBlanco = new ImageIcon(Ruta + "cartonBingoEnBlanco.png");
		JLabel_CartonBingoBlanco.setBounds(PosX, PosY, 600, 297);
		
		Panel.add(JLabel_CartonBingoBlanco);
		// TODO Auto-generated method stub

	}
	
}
package principal;

import javax.swing.JOptionPane;
import conversiones.MenuDeConversiones;


public class Principal {
	public static void main(String[] args) {
		
		MenuDeConversiones monedas = new MenuDeConversiones();
		 
		
		String opciones = JOptionPane.showInputDialog(null, "Conversor de monedas", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de Moneda" }, "Seleccion").toString();
		switch (opciones) {
		case "Conversor de Moneda":

			

			while (true) {
				
				String entrada = JOptionPane.showInputDialog("Ingrese su monto a convertir:");

				if (TrueoFalse(entrada) == true) {

					double Minput = Double.parseDouble(entrada);
					monedas.ConvertirMonedas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.YES_OPTION == respuesta) {
						entrada = JOptionPane.showInputDialog("Ingrese su monto a convertir:");
					} else {
							break;
					}
				}
			}
		}
	}

	public static boolean TrueoFalse(String entrada) {
		try {
			double x = Double.parseDouble(entrada);
			if (x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
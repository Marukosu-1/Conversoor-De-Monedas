package Conversiones;

import javax.swing.JOptionPane;

public class ConversionDeMonedasASoles {
	
	//Metodo dolares a soles
	public void ConvertirDolaresASoles(double valor) {
		double monedaDolar = valor * 3.59;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/ " +monedaDolar+ " Soles ");
	}
	
	
	//Metodo euros a soles
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 3.95;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaEuro+ " Soles");
		
	}
	
	
	//Metodo Libras a soles
	public void ConvertirLibrasASoles(double valor) {
		double monedaLibra = valor * 4.61;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaLibra+ " Soles");
	}
	
	
	//Metodo Yen a soles
	public void ConvertirYenASoles(double valor) {
		double monedaYen = valor * 0.025;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaYen+ " Soles");
	}
	
	
	//Metodo Won a soles
	
	public void ConvertirWonASoles(double valor) {
		double monedaWon = valor * 0.0028;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaWon+ " Soles");
	}
}
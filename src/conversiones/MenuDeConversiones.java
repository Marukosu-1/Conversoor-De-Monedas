package conversiones ;

import javax.swing.JOptionPane;



public class MenuDeConversiones {

	ConversionSolesAMonedas monedas = new ConversionSolesAMonedas();
	ConversionDeMonedasASoles soles = new ConversionDeMonedasASoles();
	
    public void ConvertirMonedas(double eleccion) {
    	
;    	String elegir =(JOptionPane.showInputDialog(null,"Elije su metodo de conversion:",
    			 
    			"CONVERSION",JOptionPane.QUESTION_MESSAGE, null, new Object[]
    			
    					{
    							
    					"De Soles a Dólar", 
    					"De Soles a Euro", 
    					"De Soles a Libras",
    					"De Soles a Yen",
    					"De Soles a Won Coreano",
    					"De Dólar a Soles", 
    					"De Euro a Soles", 
    					"De Libras a Soles",
    					"De Yen a Soles",
    					"De Won Coreano a Soles"
    					
    					},"Seleccion")).toString();
    	
    	
        switch(elegir) {
        case "De Soles a Dólar":
        	monedas.ConvertirSolesADolares(eleccion);
        	break;
        case "De Soles a Euro":
        	monedas.ConvertirSolesAEuros(eleccion);
        	break;
        case "De Soles a Libras":
        	monedas.ConvertirSolesALibras(eleccion);
        	break;
        case "De Soles a Yen":
        	monedas.ConvertirSolesAYen(eleccion);
        	break;
        case "De Soles a Won Coreano":
        	monedas.ConvertirSolesAWon(eleccion);
        	break;    	    	                          
        case "De Dólar a Soles":
        	soles.ConvertirDolaresASoles(eleccion);
        	break;
        case "De Euro a Soles":
        	soles.ConvertirEurosAPesos(eleccion);
        	break;
        case "De Libras a Soles":
        	soles.ConvertirLibrasASoles(eleccion);
        	break;
        case "De Yen a Soles":
        	soles.ConvertirYenASoles(eleccion);
        	break;
        case "De Won Coreano a Soles":
        	soles.ConvertirWonASoles(eleccion);
            break;
        }      
    }
        
}


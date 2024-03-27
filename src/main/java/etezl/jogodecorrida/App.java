package etezl.jogodecorrida;
import java.util.ArrayList;

import model.automovel;
import model.carro;
import model.corrida;
import model.moto;
import model.iautomovel;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	automovel carro1 = new carro("bmw ");
    	automovel carro2 = new carro("chevrolet ");
    	automovel carro3 = new carro("mustang" );
    	
    	
    	automovel moto1 = new moto ("bmw ");
    	automovel moto2 = new moto ("honda ");
    	automovel moto3 = new moto ("yamaha ");
    	
    	ArrayList<automovel> participantes = new ArrayList();
    	participantes.add(carro1);
    	participantes.add(carro2);
    	participantes.add(carro3);
    	
    	participantes.add(moto1);
    	participantes.add(moto2);
    	participantes.add(moto3);
    	 
    	
    	new corrida(participantes).startcorrida();
    	
      
    }
}

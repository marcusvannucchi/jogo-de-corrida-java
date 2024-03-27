package model;
import java.util.ArrayList;
import java.util.Iterator;
public class corrida {

	 ArrayList<automovel> automoveis = new ArrayList <automovel>();
	 
	 public corrida (ArrayList<automovel> autos) {
		 this.automoveis = autos;
		 
	 }
	 public void startcorrida() {
		 
		 for ( automovel a: this.automoveis ) {
			 System.out.println(a.modelo+ "\n" + a.acelerar() + "\n" + a.buzinar()+ "\n" +  a.freiar()+ "\n" + a.desligar());
			 
			 
		 }
		 
	 }
	 
}

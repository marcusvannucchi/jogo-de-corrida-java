package model;

public class carro extends automovel {

	public carro(String m) {
		super(m);
	
	}
	@Override
	public String ligar() {
		// TODO Auto-generated method stub
		return "Tcha Tcha TChe ";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "vrum vrum";
	}

	@Override
	public String freiar() {
		// TODO Auto-generated method stub
		return "airrrrr";
	}

	@Override
	public String buzinar() {
		// TODO Auto-generated method stub
		return "biiii, sai da frente";
	}
	@Override
	public String desligar() {
		// TODO Auto-generated method stub
		return "zzzzz";
	}




}

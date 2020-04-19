package org;

public class Color {

	private int red = 0;
	
	private int green = 0;
	
	private int blue = 0;
	
	public void color(int red,int green,int blue){
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public String colorPrimario() throws Exception{
		if(this.red == 0){
			throw new Exception("valor rojo no asignado");
		}
		if(this.green == 0){
			throw new Exception("valor verde no asignado");
		}
		if(this.blue == 0){
			throw new Exception("valor azul no asignado");
		}
		
		return "R"+this.red+"G"+this.green+"B"+this.blue;
		
	}

		
}

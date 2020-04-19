package org;


public class Prenda {
	
	private Color colorPrimario;
	
	private Color colorSecundario;
	
	private TipoPrenda tipoPrenda;
	
	private String material;
	
	private Categoria categoria;

	public Color getColor() {
		return colorPrimario;
	}

	public void setColor(Color color) {
		this.colorPrimario = color;
	}

	public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Color getColorSecundario() {
		return colorSecundario;
	}

	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	
	

}

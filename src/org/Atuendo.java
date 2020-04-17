package org;

import java.util.Collection;
import java.util.Date;

import xxx.sun.security.validator.ValidatorException;





public class Atuendo {

	private Collection<Prenda> prendas;
	
	private String clima;
	
	private Date fecha;
	
	public boolean vestir(Prenda prenda) throws Exception{
		if(this.validarPrenda(prenda)) {
		return this.prendas.add(prenda);
		}else throw new Exception("La prenda no se puede agregar");
		
	}

	private boolean validarPrenda(Prenda nuevaPrenda) throws ValidatorException{
		int errores = 0;
		if(this.prendas.contains(nuevaPrenda)) {
			throw new ValidatorException("La prenda que intenta agregar ya fue agregada");
		}
		for(Prenda prenda: this.prendas) {
			if((prenda.getCategoria() == nuevaPrenda.getCategoria()) && !nuevaPrenda.getCategoria().equals(Categoria.Accesorio)){ 
				throw new ValidatorException("La prenda que intenta agregar ya fue agregada");
			//throw new Exception("El atuendo ya tiene un/a prenda para "+nuevaPrenda.getCategoria().toString());
 
			}
		}
	/*	Este me tira errores
	 * this.prendas.stream().forEach(prenda-> {
			if((prenda.getCategoria() == nuevaPrenda.getCategoria()) && !nuevaPrenda.getCategoria().equals(Categoria.Accesorio)){ 
				throw new ValidatorException("La prenda que intenta agregar ya fue agregada");
			//throw new Exception("El atuendo ya tiene un/a prenda para "+nuevaPrenda.getCategoria().toString());
 
			}
		});
		*/
			
		if(errores == 0) {
			return true;
		}else return false;
	}
}

package br.com.solid.Dip.payment;

import br.com.solid.Dip.factory.DbProductFactory;
import br.com.solid.Dip.model.IDbProduct;
import br.com.solid.Dip.model.MySQLProduct;
import br.com.solid.Dip.model.TypeDb;

public class Payment {
	
	public void pay(String productID) {
		//Iversão de controle
		//MySQLProduct dbProduct = new MySQLProduct();
		//Método static chamando direto.
		IDbProduct dbProduct = DbProductFactory.create(TypeDb.MYSQL);
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}

}

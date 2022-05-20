package br.com.solid.Dip.model;

public class MySQLProduct implements IDbProduct {
	
	public String getProductById(String productID) {
		return "Mysql: Exibindo dados do Produto"+ productID;
	}

}

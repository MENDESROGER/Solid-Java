package br.com.solid.Dip.factory;

import br.com.solid.Dip.model.IDbProduct;
import br.com.solid.Dip.model.MongoDBProduct;
import br.com.solid.Dip.model.MySQLProduct;
import br.com.solid.Dip.model.TypeDb;

public class DbProductFactory {
	
	public static IDbProduct create(TypeDb typedb) {
		if(typedb == TypeDb.MYSQL ) {
		return new MySQLProduct();
		} else {
			return new MongoDBProduct();
			
		}
	}

}

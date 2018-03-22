package collectionDI.beans;

import java.util.Properties;
public class PropertyStore {
	private Properties products;

	public void setProducts(Properties products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "PropertyStore [products=" + products + "]";
	}

}

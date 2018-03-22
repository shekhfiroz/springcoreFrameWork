package collectionDI.beans;

import java.util.Map;

public class MapStore {
	private Map<String,Object>products;

	public void setProducts(Map<String, Object> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "MapStore [products=" + products + "]";
	}

}

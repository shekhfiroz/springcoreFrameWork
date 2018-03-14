package collectionDI.beans;

import java.util.Set;

public class SetStore {
	private Set<String> products;

	public void setProducts(Set<String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "SetStore [products=" + products + "]";
	}

}

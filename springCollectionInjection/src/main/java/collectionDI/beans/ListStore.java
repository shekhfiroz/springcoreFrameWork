package collectionDI.beans;

import java.util.List;

public class ListStore {
	private List<String> product;

	public void setProduct(List<String> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "JaiswalStore [product=" + product + "]";
	}
}

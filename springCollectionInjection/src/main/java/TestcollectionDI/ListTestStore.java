package TestcollectionDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import collectionDI.beans.ListStore;

public class ListTestStore {
	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("collectionDI/commom/application-context.xml"));
		ListStore store = factory.getBean("storelist", ListStore.class);
		System.out.println(store);
	}
}

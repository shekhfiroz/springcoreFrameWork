package testcollectionDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import collectionDI.beans.MapStore;

public class MapTestStore {
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("collectionDI/commom/map-application-context.xml"));
		MapStore mapstore = factory.getBean("mapStore", MapStore.class);
		System.out.println(mapstore);
		
	}
	
}

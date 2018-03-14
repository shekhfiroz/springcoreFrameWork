package testcollectionDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import collectionDI.beans.PropertyStore;

public class PropertyTestStore {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("collectionDI/common/properties-application-context.xml"));
		PropertyStore propertystore=factory.getBean("property-id",PropertyStore.class);
        System.out.println(propertystore);
	}

}

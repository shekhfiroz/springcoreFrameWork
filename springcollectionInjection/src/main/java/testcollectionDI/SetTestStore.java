package testcollectionDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import collectionDI.beans.SetStore;

public class SetTestStore {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("collectionDI/commom/set-application-context-.xml"));
		SetStore setstore = factory.getBean("setstore", SetStore.class);
		System.out.println(setstore);
	}

}

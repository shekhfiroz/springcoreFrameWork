package com.irefbeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	private IEngine engine;
	private String engineId;
	
   
	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public void drive() {
		System.out.println("drive() method is called.." );
		//we are creating container object to varify initially to save our application to terminate at run time
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/iref/common/application-context.xml"));
		engine=factory.getBean(engineId,IEngine.class);
		engine.accelerate("100");
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}

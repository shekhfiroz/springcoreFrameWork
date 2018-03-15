package com.main.cldi.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.cldi.beans.Games;
import com.main.cldi.beans.IccBoard;

public class TestCI2 {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/main/cldi/common/application-context-icc.xml"));
		// IccBoard iccBoard = factory.getBean("icc", IccBoard.class);
		// System.out.println(iccBoard);
		Games games = factory.getBean("games", Games.class);
		System.out.println(games);

	}

}

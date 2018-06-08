package com.nls.test;

import java.util.Locale;


public class SysProperties {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		String lang = locale.getDisplayLanguage();
		System.out.println(lang);
		
		String country = locale.getDisplayCountry();
		System.out.println(country);

	}

}

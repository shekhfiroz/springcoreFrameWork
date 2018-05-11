package com.cpe.editor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import com.cpe.beans.GeoLocation;

public class CustomPropertyEditorRegistar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(GeoLocation.class, new GeoLocationPropertyEditor());
	}

}

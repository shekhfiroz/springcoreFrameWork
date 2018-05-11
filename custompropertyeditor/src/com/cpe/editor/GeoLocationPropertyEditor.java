package com.cpe.editor;

import java.beans.PropertyEditorSupport;
import com.cpe.beans.GeoLocation;

public class GeoLocationPropertyEditor extends PropertyEditorSupport {
	GeoLocation geolocation = null;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split(":");
		int xCoordinate = Integer.parseInt(split[0]);
		int yCoordinate = Integer.parseInt(split[1]);
		setValue(geolocation);
	}

}

package selenium.helper.variation.imp;

import selenium.helper.variation.IVariation;

public class DeviceVariation extends IVariation {

	@Override
	public String getVariation(String variation) {
		return "M" + variation;
	}

}

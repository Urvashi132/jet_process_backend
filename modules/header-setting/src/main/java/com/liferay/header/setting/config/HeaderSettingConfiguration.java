package com.liferay.header.setting.config;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "com.liferay.header.setting.config.HeaderSettingConfiguration")
public interface HeaderSettingConfiguration {
	//----1
	@Meta.AD(required = false)
	public String title1();
	
	@Meta.AD(required = false)
	public String icon1();

	@Meta.AD(required = false)
	public String dataProviderURL1();
	
	@Meta.AD(required = false)
	public String displayTemplate1();

	// -----2
	@Meta.AD(required = false)
	public String title2();

	@Meta.AD(required = false)
	public String icon2();
	
	@Meta.AD(required = false)
	public String dataProviderURL2();

	@Meta.AD(required = false)
	public String displayTemplate2();
	
	// ---3
	@Meta.AD(required = false)
	public String title3();

	@Meta.AD(required = false)
	public String icon3();
	
	@Meta.AD(required = false)
	public String dataProviderURL3();
	
	@Meta.AD(required = false)
	public String displayTemplate3();

	// -----4
	@Meta.AD(required = false)
	public String title4();

	@Meta.AD(required = false)
	public String icon4();

	@Meta.AD(required = false)
	public String dataProviderURL4();
	
	@Meta.AD(required = false)
	public String displayTemplate4();

	// ----5
	@Meta.AD(required = false)
	public String title5();

	@Meta.AD(required = false)
	public String icon5();
	
	@Meta.AD(required = false)
	public String dataProviderURL5();
	
	@Meta.AD(required = false)
	public String displayTemplate5();

}
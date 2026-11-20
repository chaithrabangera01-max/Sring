package org.demo.intializer;

import org.demo.Config.MywebConfig;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Mywebinit extends AbstractAnnotationConfigDispatcherServletInitializer {
//used for the databases connections
	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//it tells the spring to where to find your web layer configuration
	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {MywebConfig.class};
	}

	
	//it setup the url pattern for the app's front controller
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return  new String[]{"/"};
	}

}


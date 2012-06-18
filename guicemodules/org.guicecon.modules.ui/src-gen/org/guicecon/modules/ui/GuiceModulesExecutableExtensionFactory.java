/*
 * generated by Xtext
 */
package org.guicecon.modules.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.guicecon.modules.ui.internal.GuiceModulesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GuiceModulesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GuiceModulesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GuiceModulesActivator.getInstance().getInjector(GuiceModulesActivator.ORG_GUICECON_MODULES_GUICEMODULES);
	}
	
}
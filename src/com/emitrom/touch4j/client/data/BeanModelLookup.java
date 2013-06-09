/************************************************************************
  BeanModelLookup.java is part of Touch4j 4.2.2.1  Copyright 2013 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/
package com.emitrom.touch4j.client.data;

import com.google.gwt.core.client.GWT;

/**
 * Returns <code>BeanModelFactories</code> for java beans. Java beans can be
 * converted to "models" via 2 methods. The first method requires a new
 * interface that extends <code>BeanModelMarker</code> and uses annotations.
 * This method does not require the JavaBean to be modified. With the second
 * method, your Java Bean implements the <code>BeanModelTag</code> interface.
 * 
 * @see BeanModelMarker
 * @see BeanModelTag
 */
public abstract class BeanModelLookup {

	private static BeanModelLookup instance;

	/**
	 * Returns the singleton bean model lookup.
	 * 
	 * @return the singleton instance
	 */
	public static BeanModelLookup get() {
		if (instance == null) {
			if (GWT.isClient()) {
				instance = GWT.create(BeanModelLookup.class);
			}
		}
		return instance;
	}

	/**
	 * Returns the factory for the given bean.
	 * 
	 * @param bean
	 *            the bean class
	 * @return the factory
	 */
	public abstract BeanModelFactory getFactory(Class<?> bean);

}

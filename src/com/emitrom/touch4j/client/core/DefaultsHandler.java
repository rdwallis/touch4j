/**
 Copyright (c) 2013 Emitrom LLC. All rights reserved.
 For licensing questions, please contact us at licensing@emitrom.com

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.emitrom.touch4j.client.core;

/**
 * Interface that is used by
 * {@link com.emitrom.touch4j.client.ui.Container#setDefaults(DefaultsHandler)}
 * . Users can pass in their own implementation of this interface where their
 * settings will apply to each component that is added to the container.
 */
public interface DefaultsHandler {

    /**
     * Apply default settings to components added to the container.
     * 
     * @param component
     *            the component being added
     */
    void apply(Component component);
    
}

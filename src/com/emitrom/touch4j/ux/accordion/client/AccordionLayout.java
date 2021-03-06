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
package com.emitrom.touch4j.ux.accordion.client;

import com.emitrom.touch4j.client.core.Component;
import com.emitrom.touch4j.client.layout.AbstractBox;
import com.emitrom.touch4j.client.layout.Type;
import com.google.gwt.core.client.JavaScriptObject;

class AccordionLayout extends AbstractBox {

    protected JavaScriptObject jso;
    private Component expandedItem;

    AccordionLayout() {
        setType(Type.ACCORDION);
        setMode(AccordionMode.MULTI);
    }

    void setMode(AccordionMode mode) {
        _setMode(mode.getValue());
    }

    private native void _setMode(String value) /*-{
		var jso = this.@com.emitrom.touch4j.ux.accordion.client.AccordionLayout::getJSO()();
		if (jso.setMode) {
			jso.setMode(value);
		} else {
			jso.mode = value;
		}

    }-*/;

    AccordionMode getMode() {
        return AccordionMode.fromValue(_getMode());
    }

    private native String _getMode() /*-{
		var jso = this.@com.emitrom.touch4j.ux.accordion.client.AccordionLayout::getJSO()();
		jso.getMode();
    }-*/;

    void setExpandedItem(Component component) {
        this.expandedItem = component;
        _setExpandedItem(component.getJsObj());
    }

    Component getExpandedItem() {
        return this.expandedItem;
    }

    private native void _setExpandedItem(JavaScriptObject component) /*-{
		var jso = this.@com.emitrom.touch4j.ux.accordion.client.AccordionLayout::getJSO()();
		jso.setExpandedItem(component);
    }-*/;

}

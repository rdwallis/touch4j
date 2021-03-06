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
package com.emitrom.touch4j.client.ui;

import com.emitrom.touch4j.client.core.config.XType;
import com.emitrom.touch4j.client.core.template.Template;
import com.emitrom.touch4j.client.data.Store;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Styled Disclosure list.
 * <p>
 * Deprecated in Touch4j 2.2. Use a disclosure list with a ListStyle of Round
 * instead.
 * 
 */
@Deprecated
public class RoundedDisclosureList extends ListDataView {

    private String listStyle;

    protected RoundedDisclosureList(JavaScriptObject config) {
        super(config);
    }

    @Override
    protected native void init()/*-{
		var c = new $wnd.Ext.dataview.List();
		this.@com.emitrom.touch4j.client.core.Component::configPrototype = c.initialConfig;
    }-*/;

    @Override
    public String getXType() {
        return XType.LIST.getValue();
    }

    /**
     * Create a new Disclosurelist.
     */
    public RoundedDisclosureList() {
    }

    public RoundedDisclosureList(Store store) {
        setStore(store);
    }

    public RoundedDisclosureList(String itemTemplate, Store store) {
        setStore(store);
        setItemTpl(itemTemplate);
    }

    public RoundedDisclosureList(String itemTemplate) {
        setItemTpl(itemTemplate);
    }

    public RoundedDisclosureList(Template itemTemplate, Store store) {
        setStore(store);
        setItemTpl(itemTemplate);
    }

    public RoundedDisclosureList(Template itemTemplate) {
        setItemTpl(itemTemplate);
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		config.onItemDisclosure = {};
		config.ui = "round";
		return new $wnd.Ext.dataview.List(config);
    }-*/;

}

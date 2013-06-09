/************************************************************************
  Email.java is part of Touch4j 4.2.2.1  Copyright 2013 Emitrom LLC

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
package com.emitrom.touch4j.client.ui;

import com.emitrom.touch4j.client.core.config.XType;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Email field creates an HTML5 email input and is usually created inside a
 * form. Because it creates an HTML email input field, most browsers will show a
 * specialized virtual keyboard for email address input. Aside from that, the
 * email field is just a normal text field
 * 
 */
public class Email extends Text<String> {
    
    @Override
    protected native void init()/*-{
        var c = new $wnd.Ext.field.Email();
        this.@com.emitrom.touch4j.client.core.Component::configPrototype = c.initialConfig;
    }-*/;

    @Override
    public String getXType() {
        return XType.EMAIL_FIELD.getValue();
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
        return new $wnd.Ext.field.Email(config);
    }-*/;

    public Email() {
    }

    protected Email(JavaScriptObject jso) {
        super(jso);
    }

}

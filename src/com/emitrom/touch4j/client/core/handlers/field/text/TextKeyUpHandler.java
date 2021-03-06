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
package com.emitrom.touch4j.client.core.handlers.field.text;

import com.emitrom.touch4j.client.core.EventObject;
import com.emitrom.touch4j.client.core.handlers.AbstractHandler;
import com.emitrom.touch4j.client.ui.Text;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class TextKeyUpHandler extends AbstractHandler {

    final JavaScriptObject jsoPeer = createPeer(this);

    private static native JavaScriptObject createPeer(TextKeyUpHandler listener) /*-{
		return function(source, event, eOpts) {
			var textField = @com.emitrom.touch4j.client.ui.Text::new(Lcom/google/gwt/core/client/JavaScriptObject;)(source);
			var eventObject = @com.emitrom.touch4j.client.core.EventObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
			listener.@com.emitrom.touch4j.client.core.handlers.field.text.TextKeyUpHandler::fireOnEvent(Lcom/emitrom/touch4j/client/ui/Text;Lcom/emitrom/touch4j/client/core/EventObject;Ljava/lang/Object;)(textField, eventObject, eOpts);
		};
    }-*/;

    // Called from JSNI
    private final void fireOnEvent(Text<String> text, EventObject event, Object eOpts) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        if (handler != null) {
            fireOnEventAndCatch(text, event, eOpts, handler);
        } else {
            onKeyUp(text, event, eOpts);
        }
    }

    private void fireOnEventAndCatch(Text<String> text, EventObject event, Object eOpts,
                    UncaughtExceptionHandler handler) {
        try {
            onKeyUp(text, event, eOpts);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    @Override
    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }

    public abstract void onKeyUp(Text<String> text, EventObject event, Object eOpts);

}

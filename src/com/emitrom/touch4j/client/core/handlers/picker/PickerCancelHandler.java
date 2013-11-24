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
package com.emitrom.touch4j.client.core.handlers.picker;

import com.emitrom.touch4j.client.core.handlers.AbstractHandler;
import com.emitrom.touch4j.client.ui.Picker;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class PickerCancelHandler extends AbstractHandler {

    final JavaScriptObject jsoPeer = createPeer(this);

    private static native JavaScriptObject createPeer(PickerCancelHandler listener) /*-{
		return function(source, eOpts) {
			var picker = @com.emitrom.touch4j.client.ui.Picker::new(Lcom/google/gwt/core/client/JavaScriptObject;)(source);
			listener.@com.emitrom.touch4j.client.core.handlers.picker.PickerCancelHandler::fireOnEvent(Lcom/emitrom/touch4j/client/ui/Picker;Ljava/lang/Object;)(picker, eOpts);
		};
    }-*/;

    // Called from JSNI
    private final void fireOnEvent(Picker picker, Object eOpts) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        if (handler != null) {
            fireOnEventAndCatch(picker, eOpts, handler);
        } else {
            onCancel(picker, eOpts);
        }
    }

    private void fireOnEventAndCatch(Picker picker, Object eOpts, UncaughtExceptionHandler handler) {
        try {
            onCancel(picker, eOpts);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    @Override
    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }

    public abstract void onCancel(Picker picker, Object eOpts);

}

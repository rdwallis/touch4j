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
package com.emitrom.touch4j.client.core.handlers.field.spinner;

import com.emitrom.touch4j.client.core.handlers.AbstractHandler;
import com.emitrom.touch4j.client.ui.Spinner;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class SpinnerSpinDownHandler extends AbstractHandler {

    final JavaScriptObject jsoPeer = createPeer(this);

    private static native JavaScriptObject createPeer(SpinnerSpinDownHandler listener) /*-{
		return function(source, value, eOpts) {
			var spinner = @com.emitrom.touch4j.client.ui.Spinner::new(Lcom/google/gwt/core/client/JavaScriptObject;)(source);
			listener.@com.emitrom.touch4j.client.core.handlers.field.spinner.SpinnerSpinDownHandler::fireOnEvent(Lcom/emitrom/touch4j/client/ui/Spinner;DLjava/lang/Object;)(spinner, value, eOpts);
		};
    }-*/;

    // Called from JSNI
    private final void fireOnEvent(Spinner<Double> spinner, double value, Object eOpts) {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        if (handler != null) {
            fireOnEventAndCatch(spinner, value, eOpts, handler);
        } else {
            onSpinDown(spinner, value, eOpts);
        }
    }

    private void fireOnEventAndCatch(Spinner<Double> spinner, double value, Object eOpts,
                    UncaughtExceptionHandler handler) {
        try {
            onSpinDown(spinner, value, eOpts);
        } catch (Throwable e) {
            handler.onUncaughtException(e);
        }
    }

    @Override
    public JavaScriptObject getJsoPeer() {
        return jsoPeer;
    }

    public abstract void onSpinDown(Spinner<Double> spinner, double value, Object eOpts);

}

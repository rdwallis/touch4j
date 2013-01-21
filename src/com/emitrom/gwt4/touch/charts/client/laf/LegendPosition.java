/**************************************************************************
   LegendPosition.java is part of Touch4j 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.touch.charts.client.laf;

import com.emitrom.gwt4.touch.client.laf.Position;
import com.emitrom.gwt4.touch.client.core.JsObject;
import com.emitrom.gwt4.touch.client.core.JsoHelper;

public class LegendPosition extends JsObject {

    public LegendPosition() {
        jsObj = JsoHelper.createObject();
    }

    public void setPortrait(Position position) {
        JsoHelper.setAttribute(jsObj, "portrait", position.getValue());
    }

    public void setLandscape(Position position) {
        JsoHelper.setAttribute(jsObj, "landscape", position.getValue());
    }
}

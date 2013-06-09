/************************************************************************
  RotatePie3D.java is part of Touch4j 4.2.2.1  Copyright 2013 Emitrom LLC

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
package com.emitrom.touch4j.charts.client.interactions;

import com.emitrom.touch4j.client.core.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class RotatePie3D extends Rotate {

    public RotatePie3D() {
        jsObj = JsoHelper.createObject();
        setType(InteractionType.ROTATE_PIE_3D);
    }

    RotatePie3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static RotatePie3D cast(AbstractInteraction peer) {
        return new RotatePie3D(peer.getJsObj());
    }

}

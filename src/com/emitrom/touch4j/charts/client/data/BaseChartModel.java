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
package com.emitrom.touch4j.charts.client.data;

import com.emitrom.touch4j.client.core.JsoHelper;
import com.emitrom.touch4j.client.data.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class to use for data in charts
 * 
 */
public class BaseChartModel extends BaseModel {

    protected BaseChartModel() {
        jsObj = JsoHelper.createObject();
    }

    protected BaseChartModel(JavaScriptObject obj) {
        super(obj);
    }
}

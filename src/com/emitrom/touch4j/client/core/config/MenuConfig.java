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
package com.emitrom.touch4j.client.core.config;

import com.emitrom.touch4j.client.core.JsoHelper;

/**
 * Config option to control the display of a menu
 */
public class MenuConfig extends BaseConfig {

    public MenuConfig() {
        jsObj = JsoHelper.createObject();
    }

    public void setCover(boolean value) {
        JsoHelper.setAttribute(jsObj, "cover", value);
    }

    public void setReveal(boolean value) {
        JsoHelper.setAttribute(jsObj, "reveal", value);
    }

    public void setSide(MenuSide side) {
        JsoHelper.setAttribute(jsObj, "side", side.getValue());
    }
}
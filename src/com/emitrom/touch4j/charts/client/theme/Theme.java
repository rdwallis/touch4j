/************************************************************************
  Theme.java is part of Touch4j 4.2.2.1  Copyright 2013 Emitrom LLC

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
package com.emitrom.touch4j.charts.client.theme;

import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public enum Theme {

    BASE("Base"), GREEN("Green"), SKY("Sky"), RED("Red"), PURPLE("Purple"), BLUE("Blue"), YELLOW("Yellow"), CATEGORY1(
                    "Category1"), CATEGORY2("Category2"), CATEGORY3("Category3"), CATEGORY4("Category4"), CATEGORY5(
                    "Category5"), CATEGORY6("Catwgory6"), DEFAULT("Demo");

    private Theme(String theme) {
        this.value = theme;
    }

    private String value;

    public String getValue() {
        return this.value;
    }

    public static void defineTheme(String themeName, String baseColor, ArrayList<String> colors) {
        JsArrayString values = JsArray.createArray().cast();
        for (String s : colors) {
            values.push(s);
        }
        defineTheme(themeName, baseColor, values);
    }

    public static void defineTheme(String themeName, String baseColor, String... colors) {
        JsArrayString values = JsArray.createArray().cast();
        for (String s : colors) {
            values.push(s);
        }
        defineTheme(themeName, baseColor, values);
    }

    private static native void defineTheme(String themeName, String baseColor, JavaScriptObject colors)/*-{
		var name = 'Ext.chart.theme.' + themeName;
		$wnd.Ext.define(name, {
			extend : 'Ext.chart.theme.Base',

			constructor : function(config) {
				this.callParent([ $wnd.Ext.apply({
					axis : {
						fill : baseColor,
						stroke : baseColor
					},
					axisLabelLeft : {
						fill : baseColor
					},
					axisLabelBottom : {
						fill : baseColor
					},
					axisTitleLeft : {
						fill : baseColor
					},
					axisTitleBottom : {
						fill : baseColor
					},
					colors : colors
				}, config) ]);
			}
		});
    }-*/;

}

/**
 *  (C) 2013-2014 Stephan Rauh http://www.beyondjava.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.beyondjava.angularFaces.flavors.kendo.puiPanel;

import java.util.logging.Logger;

import javax.faces.component.FacesComponent;
import javax.faces.component.StateHelper;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;

import de.beyondjava.angularFaces.common.IStyle;
import de.beyondjava.angularFaces.common.IStyleClass;

/**
 * A pui:panel is a field group with a caption.
 */
@FacesComponent("de.beyondjava.kendoFaces.puiPanel.PuiPanel")
public class PuiPanel extends UIOutput implements IStyle, IStyleClass {
	enum propertyKeys {
		collapsed, header, toggleable, toggleOrientation, height, width, style, styleClass, contentStyle, contentStyleClass
	}

	private static final Logger LOGGER = Logger
			.getLogger("de.beyondjava.kendoFaces.puiPanel.PuiPanel");

	/**
	 * This method is not as superfluous as it seems. We need it to be able to
	 * call getStateHelper() in defender methods.
	 */
	@Override
	public StateHelper getStateHelper() {
		return super.getStateHelper();
	}

	public String getCollapsed() {
		return (String) getStateHelper().eval(propertyKeys.collapsed, null);
	}

	public String getHeader() {
		return (String) getStateHelper().eval(propertyKeys.header, null);
	}
	public String getContentStyle() {
		return (String) getStateHelper().eval(propertyKeys.contentStyle, null);
	}
	public String getContentStyleClass() {
		return (String) getStateHelper().eval(propertyKeys.contentStyleClass, null);
	}
	public String getWidth() {
		return (String) getStateHelper().eval(propertyKeys.width, null);
	}

	public String getHeight() {
		return (String) getStateHelper().eval(propertyKeys.height, null);
	}

	public String getToggleable() {
		return (String) getStateHelper().eval(propertyKeys.toggleable, null);
	}

	public String getToggleOrientation() {
		return (String) getStateHelper().eval(propertyKeys.toggleOrientation,
				null);
	}

	public void setCollapsed(String isCollapsed) {
		getStateHelper().put(propertyKeys.collapsed, isCollapsed);
	}

	public void setHeader(String closeable) {
		getStateHelper().put(propertyKeys.header, closeable);
	}

	public void setHeight(String height) {
		getStateHelper().put(propertyKeys.height, height);
	}

	public void setToggleable(String selected) {
		getStateHelper().put(propertyKeys.toggleable, selected);
	}

	public void setToggleOrientation(String toggleOrientation) {
		getStateHelper().put(propertyKeys.toggleOrientation, toggleOrientation);
	}
	public void setWidth(String width) {
		getStateHelper().put(propertyKeys.width, width);
	}
	public void setContentStyle(String contentStyle) {
		getStateHelper().put(propertyKeys.contentStyle, contentStyle);
	}
	public void setContentStyleClass(String contentStyle) {
		getStateHelper().put(propertyKeys.contentStyleClass, contentStyle);
	}
}

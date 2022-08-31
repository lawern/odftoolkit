/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawConnectorElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawControlElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCustomShapeElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawLineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawMeasureElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRegularPolygonElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDdeSourceElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextConditionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDisplayAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextProtectedAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextProtectionKeyAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:section}.
 *
 */
public class TextSectionElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "section");

	/**
	 * Create the instance of <code>TextSectionElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextSectionElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.Section, OdfName.newName(OdfDocumentNamespace.TEXT, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:section}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextConditionAttribute</code> , See {@odf.attribute text:condition}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextConditionAttribute() {
		TextConditionAttribute attr = (TextConditionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "condition");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextConditionAttribute</code> , See {@odf.attribute text:condition}
	 *
	 * @param textConditionValue   The type is <code>String</code>
	 */
	public void setTextConditionAttribute(String textConditionValue) {
		TextConditionAttribute attr = new TextConditionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textConditionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDisplayAttribute</code> , See {@odf.attribute text:display}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextDisplayAttribute() {
		TextDisplayAttribute attr = (TextDisplayAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "display");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDisplayAttribute</code> , See {@odf.attribute text:display}
	 *
	 * @param textDisplayValue   The type is <code>String</code>
	 */
	public void setTextDisplayAttribute(String textDisplayValue) {
		TextDisplayAttribute attr = new TextDisplayAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textDisplayValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextNameAttribute() {
		TextNameAttribute attr = (TextNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextNameAttribute</code> , See {@odf.attribute text:name}
	 *
	 * @param textNameValue   The type is <code>String</code>
	 */
	public void setTextNameAttribute(String textNameValue) {
		TextNameAttribute attr = new TextNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextProtectedAttribute</code> , See {@odf.attribute text:protected}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextProtectedAttribute() {
		TextProtectedAttribute attr = (TextProtectedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "protected");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextProtectedAttribute</code> , See {@odf.attribute text:protected}
	 *
	 * @param textProtectedValue   The type is <code>Boolean</code>
	 */
	public void setTextProtectedAttribute(Boolean textProtectedValue) {
		TextProtectedAttribute attr = new TextProtectedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textProtectedValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextProtectionKeyAttribute</code> , See {@odf.attribute text:protection-key}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextProtectionKeyAttribute() {
		TextProtectionKeyAttribute attr = (TextProtectionKeyAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "protection-key");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextProtectionKeyAttribute</code> , See {@odf.attribute text:protection-key}
	 *
	 * @param textProtectionKeyValue   The type is <code>String</code>
	 */
	public void setTextProtectionKeyAttribute(String textProtectionKeyValue) {
		TextProtectionKeyAttribute attr = new TextProtectionKeyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textProtectionKeyValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute() {
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute(String textStyleNameValue) {
		TextStyleNameAttribute attr = new TextStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textStyleNameValue);
	}

	/**
	 * Create child element {@odf.element dr3d:scene}.
	 *
	 * @return the element {@odf.element dr3d:scene}
	 */
	public Dr3dSceneElement newDr3dSceneElement() {
		Dr3dSceneElement dr3dScene = ((OdfFileDom) this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
		this.appendChild(dr3dScene);
		return dr3dScene;
	}

	/**
	 * Create child element {@odf.element draw:a}.
	 *
	 * @param xlinkHrefValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @return the element {@odf.element draw:a}
	 */
	 public DrawAElement newDrawAElement(String xlinkHrefValue) {
		DrawAElement drawA = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawAElement.class);
		drawA.setXlinkHrefAttribute(xlinkHrefValue);
		this.appendChild(drawA);
		return drawA;
	}

	/**
	 * Create child element {@odf.element draw:caption}.
	 *
	 * @return the element {@odf.element draw:caption}
	 */
	public DrawCaptionElement newDrawCaptionElement() {
		DrawCaptionElement drawCaption = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCaptionElement.class);
		this.appendChild(drawCaption);
		return drawCaption;
	}

	/**
	 * Create child element {@odf.element draw:circle}.
	 *
	 * @return the element {@odf.element draw:circle}
	 */
	public DrawCircleElement newDrawCircleElement() {
		DrawCircleElement drawCircle = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCircleElement.class);
		this.appendChild(drawCircle);
		return drawCircle;
	}

	/**
	 * Create child element {@odf.element draw:connector}.
	 *
	 * @return the element {@odf.element draw:connector}
	 */
	public DrawConnectorElement newDrawConnectorElement() {
		DrawConnectorElement drawConnector = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawConnectorElement.class);
		this.appendChild(drawConnector);
		return drawConnector;
	}

	/**
	 * Create child element {@odf.element draw:control}.
	 *
	 * @param drawControlValue  the <code>String</code> value of <code>DrawControlAttribute</code>, see {@odf.attribute  draw:control} at specification
	 * @return the element {@odf.element draw:control}
	 */
	 public DrawControlElement newDrawControlElement(String drawControlValue) {
		DrawControlElement drawControl = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawControlElement.class);
		drawControl.setDrawControlAttribute(drawControlValue);
		this.appendChild(drawControl);
		return drawControl;
	}

	/**
	 * Create child element {@odf.element draw:custom-shape}.
	 *
	 * @return the element {@odf.element draw:custom-shape}
	 */
	public DrawCustomShapeElement newDrawCustomShapeElement() {
		DrawCustomShapeElement drawCustomShape = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawCustomShapeElement.class);
		this.appendChild(drawCustomShape);
		return drawCustomShape;
	}

	/**
	 * Create child element {@odf.element draw:ellipse}.
	 *
	 * @return the element {@odf.element draw:ellipse}
	 */
	public DrawEllipseElement newDrawEllipseElement() {
		DrawEllipseElement drawEllipse = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawEllipseElement.class);
		this.appendChild(drawEllipse);
		return drawEllipse;
	}

	/**
	 * Create child element {@odf.element draw:frame}.
	 *
	 * @return the element {@odf.element draw:frame}
	 */
	public DrawFrameElement newDrawFrameElement() {
		DrawFrameElement drawFrame = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawFrameElement.class);
		this.appendChild(drawFrame);
		return drawFrame;
	}

	/**
	 * Create child element {@odf.element draw:g}.
	 *
	 * @return the element {@odf.element draw:g}
	 */
	public DrawGElement newDrawGElement() {
		DrawGElement drawG = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawGElement.class);
		this.appendChild(drawG);
		return drawG;
	}

	/**
	 * Create child element {@odf.element draw:line}.
	 *
	 * @param svgX1Value  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2Value  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1Value  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2Value  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return the element {@odf.element draw:line}
	 */
	 public DrawLineElement newDrawLineElement(String svgX1Value, String svgX2Value, String svgY1Value, String svgY2Value) {
		DrawLineElement drawLine = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawLineElement.class);
		drawLine.setSvgX1Attribute(svgX1Value);
		drawLine.setSvgX2Attribute(svgX2Value);
		drawLine.setSvgY1Attribute(svgY1Value);
		drawLine.setSvgY2Attribute(svgY2Value);
		this.appendChild(drawLine);
		return drawLine;
	}

	/**
	 * Create child element {@odf.element draw:measure}.
	 *
	 * @param svgX1Value  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2Value  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1Value  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2Value  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return the element {@odf.element draw:measure}
	 */
	 public DrawMeasureElement newDrawMeasureElement(String svgX1Value, String svgX2Value, String svgY1Value, String svgY2Value) {
		DrawMeasureElement drawMeasure = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawMeasureElement.class);
		drawMeasure.setSvgX1Attribute(svgX1Value);
		drawMeasure.setSvgX2Attribute(svgX2Value);
		drawMeasure.setSvgY1Attribute(svgY1Value);
		drawMeasure.setSvgY2Attribute(svgY2Value);
		this.appendChild(drawMeasure);
		return drawMeasure;
	}

	/**
	 * Create child element {@odf.element draw:page-thumbnail}.
	 *
	 * @return the element {@odf.element draw:page-thumbnail}
	 */
	public DrawPageThumbnailElement newDrawPageThumbnailElement() {
		DrawPageThumbnailElement drawPageThumbnail = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPageThumbnailElement.class);
		this.appendChild(drawPageThumbnail);
		return drawPageThumbnail;
	}

	/**
	 * Create child element {@odf.element draw:path}.
	 *
	 * @param svgDValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:path}
	 */
	 public DrawPathElement newDrawPathElement(String svgDValue, int svgViewBoxValue) {
		DrawPathElement drawPath = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPathElement.class);
		drawPath.setSvgDAttribute(svgDValue);
		drawPath.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawPath);
		return drawPath;
	}

	/**
	 * Create child element {@odf.element draw:polygon}.
	 *
	 * @param drawPointsValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:polygon}
	 */
	 public DrawPolygonElement newDrawPolygonElement(String drawPointsValue, int svgViewBoxValue) {
		DrawPolygonElement drawPolygon = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPolygonElement.class);
		drawPolygon.setDrawPointsAttribute(drawPointsValue);
		drawPolygon.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawPolygon);
		return drawPolygon;
	}

	/**
	 * Create child element {@odf.element draw:polyline}.
	 *
	 * @param drawPointsValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxValue  the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return the element {@odf.element draw:polyline}
	 */
	 public DrawPolylineElement newDrawPolylineElement(String drawPointsValue, int svgViewBoxValue) {
		DrawPolylineElement drawPolyline = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawPolylineElement.class);
		drawPolyline.setDrawPointsAttribute(drawPointsValue);
		drawPolyline.setSvgViewBoxAttribute(svgViewBoxValue);
		this.appendChild(drawPolyline);
		return drawPolyline;
	}

	/**
	 * Create child element {@odf.element draw:rect}.
	 *
	 * @return the element {@odf.element draw:rect}
	 */
	public DrawRectElement newDrawRectElement() {
		DrawRectElement drawRect = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawRectElement.class);
		this.appendChild(drawRect);
		return drawRect;
	}

	/**
	 * Create child element {@odf.element draw:regular-polygon}.
	 *
	 * @param drawConcaveValue  the <code>Boolean</code> value of <code>DrawConcaveAttribute</code>, see {@odf.attribute  draw:concave} at specification
	 * @param drawCornersValue  the <code>Integer</code> value of <code>DrawCornersAttribute</code>, see {@odf.attribute  draw:corners} at specification
	 * @return the element {@odf.element draw:regular-polygon}
	 */
	 public DrawRegularPolygonElement newDrawRegularPolygonElement(boolean drawConcaveValue, int drawCornersValue) {
		DrawRegularPolygonElement drawRegularPolygon = ((OdfFileDom) this.ownerDocument).newOdfElement(DrawRegularPolygonElement.class);
		drawRegularPolygon.setDrawConcaveAttribute(drawConcaveValue);
		drawRegularPolygon.setDrawCornersAttribute(drawCornersValue);
		this.appendChild(drawRegularPolygon);
		return drawRegularPolygon;
	}

	/**
	 * Create child element {@odf.element office:dde-source}.
	 *
	 * @param officeDdeApplicationValue  the <code>String</code> value of <code>OfficeDdeApplicationAttribute</code>, see {@odf.attribute  office:dde-application} at specification
	 * @param officeDdeItemValue  the <code>String</code> value of <code>OfficeDdeItemAttribute</code>, see {@odf.attribute  office:dde-item} at specification
	 * @param officeDdeTopicValue  the <code>String</code> value of <code>OfficeDdeTopicAttribute</code>, see {@odf.attribute  office:dde-topic} at specification
	 * @return the element {@odf.element office:dde-source}
	 */
	 public OfficeDdeSourceElement newOfficeDdeSourceElement(String officeDdeApplicationValue, String officeDdeItemValue, String officeDdeTopicValue) {
		OfficeDdeSourceElement officeDdeSource = ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeDdeSourceElement.class);
		officeDdeSource.setOfficeDdeApplicationAttribute(officeDdeApplicationValue);
		officeDdeSource.setOfficeDdeItemAttribute(officeDdeItemValue);
		officeDdeSource.setOfficeDdeTopicAttribute(officeDdeTopicValue);
		this.appendChild(officeDdeSource);
		return officeDdeSource;
	}

	/**
	 * Create child element {@odf.element table:table}.
	 *
	 * @return the element {@odf.element table:table}
	 */
	public TableTableElement newTableTableElement() {
		TableTableElement tableTable = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableElement.class);
		this.appendChild(tableTable);
		return tableTable;
	}

	/**
	 * Create child element {@odf.element text:alphabetical-index}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:alphabetical-index}
	 */
	 public TextAlphabeticalIndexElement newTextAlphabeticalIndexElement(String textNameValue) {
		TextAlphabeticalIndexElement textAlphabeticalIndex = ((OdfFileDom) this.ownerDocument).newOdfElement(TextAlphabeticalIndexElement.class);
		textAlphabeticalIndex.setTextNameAttribute(textNameValue);
		this.appendChild(textAlphabeticalIndex);
		return textAlphabeticalIndex;
	}

	/**
	 * Create child element {@odf.element text:bibliography}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:bibliography}
	 */
	 public TextBibliographyElement newTextBibliographyElement(String textNameValue) {
		TextBibliographyElement textBibliography = ((OdfFileDom) this.ownerDocument).newOdfElement(TextBibliographyElement.class);
		textBibliography.setTextNameAttribute(textNameValue);
		this.appendChild(textBibliography);
		return textBibliography;
	}

	/**
	 * Create child element {@odf.element text:change}.
	 *
	 * @param textChangeIdValue  the <code>String</code> value of <code>TextChangeIdAttribute</code>, see {@odf.attribute  text:change-id} at specification
	 * @return the element {@odf.element text:change}
	 */
	 public TextChangeElement newTextChangeElement(String textChangeIdValue) {
		TextChangeElement textChange = ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangeElement.class);
		textChange.setTextChangeIdAttribute(textChangeIdValue);
		this.appendChild(textChange);
		return textChange;
	}

	/**
	 * Create child element {@odf.element text:change-end}.
	 *
	 * @param textChangeIdValue  the <code>String</code> value of <code>TextChangeIdAttribute</code>, see {@odf.attribute  text:change-id} at specification
	 * @return the element {@odf.element text:change-end}
	 */
	 public TextChangeEndElement newTextChangeEndElement(String textChangeIdValue) {
		TextChangeEndElement textChangeEnd = ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangeEndElement.class);
		textChangeEnd.setTextChangeIdAttribute(textChangeIdValue);
		this.appendChild(textChangeEnd);
		return textChangeEnd;
	}

	/**
	 * Create child element {@odf.element text:change-start}.
	 *
	 * @param textChangeIdValue  the <code>String</code> value of <code>TextChangeIdAttribute</code>, see {@odf.attribute  text:change-id} at specification
	 * @return the element {@odf.element text:change-start}
	 */
	 public TextChangeStartElement newTextChangeStartElement(String textChangeIdValue) {
		TextChangeStartElement textChangeStart = ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangeStartElement.class);
		textChangeStart.setTextChangeIdAttribute(textChangeIdValue);
		this.appendChild(textChangeStart);
		return textChangeStart;
	}

	/**
	 * Create child element {@odf.element text:h}.
	 *
	 * @param textOutlineLevelValue  the <code>Integer</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @return the element {@odf.element text:h}
	 */
	 public TextHElement newTextHElement(int textOutlineLevelValue) {
		TextHElement textH = ((OdfFileDom) this.ownerDocument).newOdfElement(TextHElement.class);
		textH.setTextOutlineLevelAttribute(textOutlineLevelValue);
		this.appendChild(textH);
		return textH;
	}

	/**
	 * Create child element {@odf.element text:illustration-index}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:illustration-index}
	 */
	 public TextIllustrationIndexElement newTextIllustrationIndexElement(String textNameValue) {
		TextIllustrationIndexElement textIllustrationIndex = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIllustrationIndexElement.class);
		textIllustrationIndex.setTextNameAttribute(textNameValue);
		this.appendChild(textIllustrationIndex);
		return textIllustrationIndex;
	}

	/**
	 * Create child element {@odf.element text:list}.
	 *
	 * @return the element {@odf.element text:list}
	 */
	public TextListElement newTextListElement() {
		TextListElement textList = ((OdfFileDom) this.ownerDocument).newOdfElement(TextListElement.class);
		this.appendChild(textList);
		return textList;
	}

	/**
	 * Create child element {@odf.element text:numbered-paragraph}.
	 *
	 * @return the element {@odf.element text:numbered-paragraph}
	 */
	public TextNumberedParagraphElement newTextNumberedParagraphElement() {
		TextNumberedParagraphElement textNumberedParagraph = ((OdfFileDom) this.ownerDocument).newOdfElement(TextNumberedParagraphElement.class);
		this.appendChild(textNumberedParagraph);
		return textNumberedParagraph;
	}

	/**
	 * Create child element {@odf.element text:object-index}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:object-index}
	 */
	 public TextObjectIndexElement newTextObjectIndexElement(String textNameValue) {
		TextObjectIndexElement textObjectIndex = ((OdfFileDom) this.ownerDocument).newOdfElement(TextObjectIndexElement.class);
		textObjectIndex.setTextNameAttribute(textNameValue);
		this.appendChild(textObjectIndex);
		return textObjectIndex;
	}

	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return the element {@odf.element text:p}
	 */
	public TextPElement newTextPElement() {
		TextPElement textP = ((OdfFileDom) this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild(textP);
		return textP;
	}

	/**
	 * Create child element {@odf.element text:section}.
	 *
	 * @param textDisplayValue  the <code>String</code> value of <code>TextDisplayAttribute</code>, see {@odf.attribute  text:display} at specification
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:section}
	 */
	 public TextSectionElement newTextSectionElement(String textDisplayValue, String textNameValue) {
		TextSectionElement textSection = ((OdfFileDom) this.ownerDocument).newOdfElement(TextSectionElement.class);
		textSection.setTextDisplayAttribute(textDisplayValue);
		textSection.setTextNameAttribute(textNameValue);
		this.appendChild(textSection);
		return textSection;
	}

	/**
	 * Create child element {@odf.element text:section-source}.
	 *
	 * @return the element {@odf.element text:section-source}
	 */
	public TextSectionSourceElement newTextSectionSourceElement() {
		TextSectionSourceElement textSectionSource = ((OdfFileDom) this.ownerDocument).newOdfElement(TextSectionSourceElement.class);
		this.appendChild(textSectionSource);
		return textSectionSource;
	}

	/**
	 * Create child element {@odf.element text:table-index}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:table-index}
	 */
	 public TextTableIndexElement newTextTableIndexElement(String textNameValue) {
		TextTableIndexElement textTableIndex = ((OdfFileDom) this.ownerDocument).newOdfElement(TextTableIndexElement.class);
		textTableIndex.setTextNameAttribute(textNameValue);
		this.appendChild(textTableIndex);
		return textTableIndex;
	}

	/**
	 * Create child element {@odf.element text:table-of-content}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:table-of-content}
	 */
	 public TextTableOfContentElement newTextTableOfContentElement(String textNameValue) {
		TextTableOfContentElement textTableOfContent = ((OdfFileDom) this.ownerDocument).newOdfElement(TextTableOfContentElement.class);
		textTableOfContent.setTextNameAttribute(textNameValue);
		this.appendChild(textTableOfContent);
		return textTableOfContent;
	}

	/**
	 * Create child element {@odf.element text:user-index}.
	 *
	 * @param textNameValue  the <code>String</code> value of <code>TextNameAttribute</code>, see {@odf.attribute  text:name} at specification
	 * @return the element {@odf.element text:user-index}
	 */
	 public TextUserIndexElement newTextUserIndexElement(String textNameValue) {
		TextUserIndexElement textUserIndex = ((OdfFileDom) this.ownerDocument).newOdfElement(TextUserIndexElement.class);
		textUserIndex.setTextNameAttribute(textNameValue);
		this.appendChild(textUserIndex);
		return textUserIndex;
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}

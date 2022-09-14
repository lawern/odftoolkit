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
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawZIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationClassNamesAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndXAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndYAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTableBackgroundAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAnchorPageNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextAnchorTypeAttribute;

/**
 * DOM implementation of OpenDocument base element
 *
 */
public abstract class DrawShapeElementBase extends OdfStyleableShapeElement {

	/**
	 * Create the instance of <code>DrawShapeElementBase</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 * @param  elementName	The type is <code>OdfName</code>
	 */
	public DrawShapeElementBase(OdfFileDom ownerDoc, OdfName elementName) {
		super(ownerDoc, elementName);
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawClassNamesAttribute</code> , See {@odf.attribute draw:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawClassNamesAttribute() {
		DrawClassNamesAttribute attr = (DrawClassNamesAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "class-names");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawClassNamesAttribute</code> , See {@odf.attribute draw:class-names}
	 *
	 * @param drawClassNamesValue   The type is <code>String</code>
	 */
	public void setDrawClassNamesAttribute(String drawClassNamesValue) {
		DrawClassNamesAttribute attr = new DrawClassNamesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawClassNamesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawIdAttribute</code> , See {@odf.attribute draw:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawIdAttribute() {
		DrawIdAttribute attr = (DrawIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawIdAttribute</code> , See {@odf.attribute draw:id}
	 *
	 * @param drawIdValue   The type is <code>String</code>
	 */
	public void setDrawIdAttribute(String drawIdValue) {
		DrawIdAttribute attr = new DrawIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute() {
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute(String drawNameValue) {
		DrawNameAttribute attr = new DrawNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleNameAttribute() {
		DrawStyleNameAttribute attr = (DrawStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleNameAttribute</code> , See {@odf.attribute draw:style-name}
	 *
	 * @param drawStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawStyleNameAttribute(String drawStyleNameValue) {
		DrawStyleNameAttribute attr = new DrawStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawZIndexAttribute</code> , See {@odf.attribute draw:z-index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawZIndexAttribute() {
		DrawZIndexAttribute attr = (DrawZIndexAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "z-index");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawZIndexAttribute</code> , See {@odf.attribute draw:z-index}
	 *
	 * @param drawZIndexValue   The type is <code>Integer</code>
	 */
	public void setDrawZIndexAttribute(Integer drawZIndexValue) {
		DrawZIndexAttribute attr = new DrawZIndexAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(drawZIndexValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationClassNamesAttribute</code> , See {@odf.attribute presentation:class-names}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationClassNamesAttribute() {
		PresentationClassNamesAttribute attr = (PresentationClassNamesAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "class-names");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationClassNamesAttribute</code> , See {@odf.attribute presentation:class-names}
	 *
	 * @param presentationClassNamesValue   The type is <code>String</code>
	 */
	public void setPresentationClassNamesAttribute(String presentationClassNamesValue) {
		PresentationClassNamesAttribute attr = new PresentationClassNamesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationClassNamesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>PresentationStyleNameAttribute</code> , See {@odf.attribute presentation:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getPresentationStyleNameAttribute() {
		PresentationStyleNameAttribute attr = (PresentationStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>PresentationStyleNameAttribute</code> , See {@odf.attribute presentation:style-name}
	 *
	 * @param presentationStyleNameValue   The type is <code>String</code>
	 */
	public void setPresentationStyleNameAttribute(String presentationStyleNameValue) {
		PresentationStyleNameAttribute attr = new PresentationStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(presentationStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndCellAddressAttribute</code> , See {@odf.attribute table:end-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndCellAddressAttribute() {
		TableEndCellAddressAttribute attr = (TableEndCellAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-cell-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndCellAddressAttribute</code> , See {@odf.attribute table:end-cell-address}
	 *
	 * @param tableEndCellAddressValue   The type is <code>String</code>
	 */
	public void setTableEndCellAddressAttribute(String tableEndCellAddressValue) {
		TableEndCellAddressAttribute attr = new TableEndCellAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableEndCellAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndXAttribute</code> , See {@odf.attribute table:end-x}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndXAttribute() {
		TableEndXAttribute attr = (TableEndXAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-x");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndXAttribute</code> , See {@odf.attribute table:end-x}
	 *
	 * @param tableEndXValue   The type is <code>String</code>
	 */
	public void setTableEndXAttribute(String tableEndXValue) {
		TableEndXAttribute attr = new TableEndXAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableEndXValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndYAttribute</code> , See {@odf.attribute table:end-y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndYAttribute() {
		TableEndYAttribute attr = (TableEndYAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "end-y");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndYAttribute</code> , See {@odf.attribute table:end-y}
	 *
	 * @param tableEndYValue   The type is <code>String</code>
	 */
	public void setTableEndYAttribute(String tableEndYValue) {
		TableEndYAttribute attr = new TableEndYAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableEndYValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTableBackgroundAttribute</code> , See {@odf.attribute table:table-background}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableTableBackgroundAttribute() {
		TableTableBackgroundAttribute attr = (TableTableBackgroundAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "table-background");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTableBackgroundAttribute</code> , See {@odf.attribute table:table-background}
	 *
	 * @param tableTableBackgroundValue   The type is <code>Boolean</code>
	 */
	public void setTableTableBackgroundAttribute(Boolean tableTableBackgroundValue) {
		TableTableBackgroundAttribute attr = new TableTableBackgroundAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableTableBackgroundValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAnchorPageNumberAttribute</code> , See {@odf.attribute text:anchor-page-number}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextAnchorPageNumberAttribute() {
		TextAnchorPageNumberAttribute attr = (TextAnchorPageNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "anchor-page-number");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAnchorPageNumberAttribute</code> , See {@odf.attribute text:anchor-page-number}
	 *
	 * @param textAnchorPageNumberValue   The type is <code>Integer</code>
	 */
	public void setTextAnchorPageNumberAttribute(Integer textAnchorPageNumberValue) {
		TextAnchorPageNumberAttribute attr = new TextAnchorPageNumberAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textAnchorPageNumberValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextAnchorTypeAttribute</code> , See {@odf.attribute text:anchor-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextAnchorTypeAttribute() {
		TextAnchorTypeAttribute attr = (TextAnchorTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "anchor-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextAnchorTypeAttribute</code> , See {@odf.attribute text:anchor-type}
	 *
	 * @param textAnchorTypeValue   The type is <code>String</code>
	 */
	public void setTextAnchorTypeAttribute(String textAnchorTypeValue) {
		TextAnchorTypeAttribute attr = new TextAnchorTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textAnchorTypeValue);
	}
}

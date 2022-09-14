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

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeBooleanValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDateValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTimeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextFixedAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextNameAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:user-defined}.
 *
 */
public class TextUserDefinedElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "user-defined");

	/**
	 * Create the instance of <code>TextUserDefinedElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextUserDefinedElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:user-defined}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> , See {@odf.attribute office:boolean-value}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getOfficeBooleanValueAttribute() {
		OfficeBooleanValueAttribute attr = (OfficeBooleanValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "boolean-value");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> , See {@odf.attribute office:boolean-value}
	 *
	 * @param officeBooleanValueValue   The type is <code>Boolean</code>
	 */
	public void setOfficeBooleanValueAttribute(Boolean officeBooleanValueValue) {
		OfficeBooleanValueAttribute attr = new OfficeBooleanValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(officeBooleanValueValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See {@odf.attribute office:date-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeDateValueAttribute() {
		OfficeDateValueAttribute attr = (OfficeDateValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "date-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See {@odf.attribute office:date-value}
	 *
	 * @param officeDateValueValue   The type is <code>String</code>
	 */
	public void setOfficeDateValueAttribute(String officeDateValueValue) {
		OfficeDateValueAttribute attr = new OfficeDateValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeDateValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See {@odf.attribute office:string-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeStringValueAttribute() {
		OfficeStringValueAttribute attr = (OfficeStringValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "string-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See {@odf.attribute office:string-value}
	 *
	 * @param officeStringValueValue   The type is <code>String</code>
	 */
	public void setOfficeStringValueAttribute(String officeStringValueValue) {
		OfficeStringValueAttribute attr = new OfficeStringValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeStringValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See {@odf.attribute office:time-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeTimeValueAttribute() {
		OfficeTimeValueAttribute attr = (OfficeTimeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "time-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See {@odf.attribute office:time-value}
	 *
	 * @param officeTimeValueValue   The type is <code>String</code>
	 */
	public void setOfficeTimeValueAttribute(String officeTimeValueValue) {
		OfficeTimeValueAttribute attr = new OfficeTimeValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeTimeValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueAttribute</code> , See {@odf.attribute office:value}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getOfficeValueAttribute() {
		OfficeValueAttribute attr = (OfficeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Double.valueOf(attr.doubleValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueAttribute</code> , See {@odf.attribute office:value}
	 *
	 * @param officeValueValue   The type is <code>Double</code>
	 */
	public void setOfficeValueAttribute(Double officeValueValue) {
		OfficeValueAttribute attr = new OfficeValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setDoubleValue(officeValueValue.doubleValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleDataStyleNameAttribute() {
		StyleDataStyleNameAttribute attr = (StyleDataStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "data-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> , See {@odf.attribute style:data-style-name}
	 *
	 * @param styleDataStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleDataStyleNameAttribute(String styleDataStyleNameValue) {
		StyleDataStyleNameAttribute attr = new StyleDataStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleDataStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextFixedAttribute() {
		TextFixedAttribute attr = (TextFixedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "fixed");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @param textFixedValue   The type is <code>Boolean</code>
	 */
	public void setTextFixedAttribute(Boolean textFixedValue) {
		TextFixedAttribute attr = new TextFixedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textFixedValue.booleanValue());
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

	/**
	 * Add text content. Only elements which are allowed to have text content offer this method.
	 */
	 public void newTextNode(String content) {
		if (content != null && !content.equals("")) {
			this.appendChild(this.getOwnerDocument().createTextNode(content));
		}
	 }
}

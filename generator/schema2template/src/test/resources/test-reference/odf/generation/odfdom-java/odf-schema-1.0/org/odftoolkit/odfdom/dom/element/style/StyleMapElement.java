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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.style.StyleApplyStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleBaseCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleConditionAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:map}.
 *
 */
public class StyleMapElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "map");

	/**
	 * Create the instance of <code>StyleMapElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleMapElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:map}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleApplyStyleNameAttribute</code> , See {@odf.attribute style:apply-style-name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleApplyStyleNameAttribute() {
		StyleApplyStyleNameAttribute attr = (StyleApplyStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "apply-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleApplyStyleNameAttribute</code> , See {@odf.attribute style:apply-style-name}
	 *
	 * @param styleApplyStyleNameValue   The type is <code>String</code>
	 */
	public void setStyleApplyStyleNameAttribute(String styleApplyStyleNameValue) {
		StyleApplyStyleNameAttribute attr = new StyleApplyStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleApplyStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleBaseCellAddressAttribute</code> , See {@odf.attribute style:base-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleBaseCellAddressAttribute() {
		StyleBaseCellAddressAttribute attr = (StyleBaseCellAddressAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "base-cell-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleBaseCellAddressAttribute</code> , See {@odf.attribute style:base-cell-address}
	 *
	 * @param styleBaseCellAddressValue   The type is <code>String</code>
	 */
	public void setStyleBaseCellAddressAttribute(String styleBaseCellAddressValue) {
		StyleBaseCellAddressAttribute attr = new StyleBaseCellAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleBaseCellAddressValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleConditionAttribute</code> , See {@odf.attribute style:condition}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleConditionAttribute() {
		StyleConditionAttribute attr = (StyleConditionAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "condition");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleConditionAttribute</code> , See {@odf.attribute style:condition}
	 *
	 * @param styleConditionValue   The type is <code>String</code>
	 */
	public void setStyleConditionAttribute(String styleConditionValue) {
		StyleConditionAttribute attr = new StyleConditionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleConditionValue);
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

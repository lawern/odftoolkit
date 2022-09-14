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
import org.odftoolkit.odfdom.dom.attribute.text.TextIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextOutlineLevelAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:toc-mark-start}.
 *
 */
public class TextTocMarkStartElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "toc-mark-start");

	/**
	 * Create the instance of <code>TextTocMarkStartElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextTocMarkStartElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:toc-mark-start}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIdAttribute() {
		TextIdAttribute attr = (TextIdAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @param textIdValue   The type is <code>String</code>
	 */
	public void setTextIdAttribute(String textIdValue) {
		TextIdAttribute attr = new TextIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextOutlineLevelAttribute() {
		TextOutlineLevelAttribute attr = (TextOutlineLevelAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "outline-level");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextOutlineLevelAttribute</code> , See {@odf.attribute text:outline-level}
	 *
	 * @param textOutlineLevelValue   The type is <code>Integer</code>
	 */
	public void setTextOutlineLevelAttribute(Integer textOutlineLevelValue) {
		TextOutlineLevelAttribute attr = new TextOutlineLevelAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(textOutlineLevelValue.intValue());
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

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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableAddEmptyLinesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLayoutModeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-layout-info}.
 *
 */
public class TableDataPilotLayoutInfoElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-layout-info");

	/**
	 * Create the instance of <code>TableDataPilotLayoutInfoElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotLayoutInfoElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-layout-info}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableAddEmptyLinesAttribute</code> , See {@odf.attribute table:add-empty-lines}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableAddEmptyLinesAttribute() {
		TableAddEmptyLinesAttribute attr = (TableAddEmptyLinesAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "add-empty-lines");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableAddEmptyLinesAttribute</code> , See {@odf.attribute table:add-empty-lines}
	 *
	 * @param tableAddEmptyLinesValue   The type is <code>Boolean</code>
	 */
	public void setTableAddEmptyLinesAttribute(Boolean tableAddEmptyLinesValue) {
		TableAddEmptyLinesAttribute attr = new TableAddEmptyLinesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableAddEmptyLinesValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLayoutModeAttribute</code> , See {@odf.attribute table:layout-mode}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableLayoutModeAttribute() {
		TableLayoutModeAttribute attr = (TableLayoutModeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "layout-mode");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLayoutModeAttribute</code> , See {@odf.attribute table:layout-mode}
	 *
	 * @param tableLayoutModeValue   The type is <code>String</code>
	 */
	public void setTableLayoutModeAttribute(String tableLayoutModeValue) {
		TableLayoutModeAttribute attr = new TableLayoutModeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableLayoutModeValue);
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

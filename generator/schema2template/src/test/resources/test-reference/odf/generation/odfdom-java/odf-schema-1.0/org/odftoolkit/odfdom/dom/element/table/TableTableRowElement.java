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

import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.w3c.dom.Node;
import org.odftoolkit.odfdom.dom.attribute.table.TableDefaultCellStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberRowsRepeatedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableVisibilityAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table-row}.
 *
 */
public class TableTableRowElement extends OdfStylableElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "table-row");

	/**
	 * Create the instance of <code>TableTableRowElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableRowElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME, OdfStyleFamily.TableRow, OdfName.newName(OdfDocumentNamespace.TABLE, "style-name"));
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table-row}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDefaultCellStyleNameAttribute</code> , See {@odf.attribute table:default-cell-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableDefaultCellStyleNameAttribute() {
		TableDefaultCellStyleNameAttribute attr = (TableDefaultCellStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "default-cell-style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDefaultCellStyleNameAttribute</code> , See {@odf.attribute table:default-cell-style-name}
	 *
	 * @param tableDefaultCellStyleNameValue   The type is <code>String</code>
	 */
	public void setTableDefaultCellStyleNameAttribute(String tableDefaultCellStyleNameValue) {
		TableDefaultCellStyleNameAttribute attr = new TableDefaultCellStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableDefaultCellStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberRowsRepeatedAttribute</code> , See {@odf.attribute table:number-rows-repeated}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberRowsRepeatedAttribute() {
		TableNumberRowsRepeatedAttribute attr = (TableNumberRowsRepeatedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "number-rows-repeated");
		if (attr != null && !attr.getValue().isEmpty()) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TableNumberRowsRepeatedAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberRowsRepeatedAttribute</code> , See {@odf.attribute table:number-rows-repeated}
	 *
	 * @param tableNumberRowsRepeatedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberRowsRepeatedAttribute(Integer tableNumberRowsRepeatedValue) {
		TableNumberRowsRepeatedAttribute attr = new TableNumberRowsRepeatedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableNumberRowsRepeatedValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStyleNameAttribute() {
		TableStyleNameAttribute attr = (TableStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @param tableStyleNameValue   The type is <code>String</code>
	 */
	public void setTableStyleNameAttribute(String tableStyleNameValue) {
		TableStyleNameAttribute attr = new TableStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableVisibilityAttribute</code> , See {@odf.attribute table:visibility}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableVisibilityAttribute() {
		TableVisibilityAttribute attr = (TableVisibilityAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "visibility");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableVisibilityAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableVisibilityAttribute</code> , See {@odf.attribute table:visibility}
	 *
	 * @param tableVisibilityValue   The type is <code>String</code>
	 */
	public void setTableVisibilityAttribute(String tableVisibilityValue) {
		TableVisibilityAttribute attr = new TableVisibilityAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableVisibilityValue);
	}

	/**
	 * Create child element {@odf.element table:covered-table-cell}.
	 *
	 * @param officeValueValue  the <code>Double</code> value of <code>OfficeValueAttribute</code>, see {@odf.attribute  office:value} at specification
	 * @param officeValueTypeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @return the element {@odf.element table:covered-table-cell}
	 */
	 public TableCoveredTableCellElement newTableCoveredTableCellElement(double officeValueValue, String officeValueTypeValue) {
		TableCoveredTableCellElement tableCoveredTableCell = ((OdfFileDom) this.ownerDocument).newOdfElement(TableCoveredTableCellElement.class);
		tableCoveredTableCell.setOfficeValueAttribute(officeValueValue);
		tableCoveredTableCell.setOfficeValueTypeAttribute(officeValueTypeValue);
		this.appendChild(tableCoveredTableCell);
		return tableCoveredTableCell;
	}

	/**
	 * Create child element {@odf.element table:table-cell}.
	 *
	 * @param officeValueValue  the <code>Double</code> value of <code>OfficeValueAttribute</code>, see {@odf.attribute  office:value} at specification
	 * @param officeValueTypeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @return the element {@odf.element table:table-cell}
	 */
	 public TableTableCellElement newTableTableCellElement(double officeValueValue, String officeValueTypeValue) {
		TableTableCellElement tableTableCell = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableCellElement.class);
		tableTableCell.setOfficeValueAttribute(officeValueValue);
		tableTableCell.setOfficeValueTypeAttribute(officeValueTypeValue);
		this.appendChild(tableTableCell);
		return tableTableCell;
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

  @Override
  public boolean isComponentRoot() {
    return true;
  }
}

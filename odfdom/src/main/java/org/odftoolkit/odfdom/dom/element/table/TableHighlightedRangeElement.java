/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableCellRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableContainsErrorAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDirectionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableMarkedInvalidAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:highlighted-range}. */
public class TableHighlightedRangeElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "highlighted-range");

  /**
   * Create the instance of <code>TableHighlightedRangeElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableHighlightedRangeElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:highlighted-range}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableCellRangeAddressAttribute
   * </code> , See {@odf.attribute table:cell-range-address}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableCellRangeAddressAttribute() {
    TableCellRangeAddressAttribute attr =
        (TableCellRangeAddressAttribute)
            getOdfAttribute(OdfDocumentNamespace.TABLE, "cell-range-address");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> ,
   * See {@odf.attribute table:cell-range-address}
   *
   * @param tableCellRangeAddressValue The type is <code>String</code>
   */
  public void setTableCellRangeAddressAttribute(String tableCellRangeAddressValue) {
    TableCellRangeAddressAttribute attr =
        new TableCellRangeAddressAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableCellRangeAddressValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableContainsErrorAttribute
   * </code> , See {@odf.attribute table:contains-error}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTableContainsErrorAttribute() {
    TableContainsErrorAttribute attr =
        (TableContainsErrorAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "contains-error");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TableContainsErrorAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableContainsErrorAttribute</code> ,
   * See {@odf.attribute table:contains-error}
   *
   * @param tableContainsErrorValue The type is <code>Boolean</code>
   */
  public void setTableContainsErrorAttribute(Boolean tableContainsErrorValue) {
    TableContainsErrorAttribute attr =
        new TableContainsErrorAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(tableContainsErrorValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableDirectionAttribute</code>
   * , See {@odf.attribute table:direction}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableDirectionAttribute() {
    TableDirectionAttribute attr =
        (TableDirectionAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "direction");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableDirectionAttribute</code> , See
   * {@odf.attribute table:direction}
   *
   * @param tableDirectionValue The type is <code>String</code>
   */
  public void setTableDirectionAttribute(String tableDirectionValue) {
    TableDirectionAttribute attr = new TableDirectionAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableDirectionValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableMarkedInvalidAttribute
   * </code> , See {@odf.attribute table:marked-invalid}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTableMarkedInvalidAttribute() {
    TableMarkedInvalidAttribute attr =
        (TableMarkedInvalidAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "marked-invalid");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableMarkedInvalidAttribute</code> ,
   * See {@odf.attribute table:marked-invalid}
   *
   * @param tableMarkedInvalidValue The type is <code>Boolean</code>
   */
  public void setTableMarkedInvalidAttribute(Boolean tableMarkedInvalidValue) {
    TableMarkedInvalidAttribute attr =
        new TableMarkedInvalidAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(tableMarkedInvalidValue.booleanValue());
  }

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

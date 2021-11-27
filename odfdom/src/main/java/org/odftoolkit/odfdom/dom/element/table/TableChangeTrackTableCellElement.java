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
import org.odftoolkit.odfdom.dom.attribute.office.OfficeBooleanValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeCurrencyAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDateValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTimeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFormulaAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableMatrixCoveredAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberMatrixColumnsSpannedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberMatrixRowsSpannedAttribute;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:change-track-table-cell}. */
public class TableChangeTrackTableCellElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "change-track-table-cell");

  /**
   * Create the instance of <code>TableChangeTrackTableCellElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableChangeTrackTableCellElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     table:change-track-table-cell}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeBooleanValueAttribute
   * </code> , See {@odf.attribute office:boolean-value}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getOfficeBooleanValueAttribute() {
    OfficeBooleanValueAttribute attr =
        (OfficeBooleanValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "boolean-value");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> ,
   * See {@odf.attribute office:boolean-value}
   *
   * @param officeBooleanValueValue The type is <code>Boolean</code>
   */
  public void setOfficeBooleanValueAttribute(Boolean officeBooleanValueValue) {
    OfficeBooleanValueAttribute attr =
        new OfficeBooleanValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(officeBooleanValueValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeCurrencyAttribute</code>
   * , See {@odf.attribute office:currency}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeCurrencyAttribute() {
    OfficeCurrencyAttribute attr =
        (OfficeCurrencyAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "currency");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeCurrencyAttribute</code> , See
   * {@odf.attribute office:currency}
   *
   * @param officeCurrencyValue The type is <code>String</code>
   */
  public void setOfficeCurrencyAttribute(String officeCurrencyValue) {
    OfficeCurrencyAttribute attr = new OfficeCurrencyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeCurrencyValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeDateValueAttribute</code>
   * , See {@odf.attribute office:date-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeDateValueAttribute() {
    OfficeDateValueAttribute attr =
        (OfficeDateValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "date-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See
   * {@odf.attribute office:date-value}
   *
   * @param officeDateValueValue The type is <code>String</code>
   */
  public void setOfficeDateValueAttribute(String officeDateValueValue) {
    OfficeDateValueAttribute attr = new OfficeDateValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeDateValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeStringValueAttribute
   * </code> , See {@odf.attribute office:string-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeStringValueAttribute() {
    OfficeStringValueAttribute attr =
        (OfficeStringValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "string-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See
   * {@odf.attribute office:string-value}
   *
   * @param officeStringValueValue The type is <code>String</code>
   */
  public void setOfficeStringValueAttribute(String officeStringValueValue) {
    OfficeStringValueAttribute attr =
        new OfficeStringValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeStringValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeTimeValueAttribute</code>
   * , See {@odf.attribute office:time-value}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeTimeValueAttribute() {
    OfficeTimeValueAttribute attr =
        (OfficeTimeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "time-value");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See
   * {@odf.attribute office:time-value}
   *
   * @param officeTimeValueValue The type is <code>String</code>
   */
  public void setOfficeTimeValueAttribute(String officeTimeValueValue) {
    OfficeTimeValueAttribute attr = new OfficeTimeValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeTimeValueValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeValueAttribute</code> ,
   * See {@odf.attribute office:value}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public Double getOfficeValueAttribute() {
    OfficeValueAttribute attr =
        (OfficeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value");
    if (attr != null) {
      return Double.valueOf(attr.doubleValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeValueAttribute</code> , See
   * {@odf.attribute office:value}
   *
   * @param officeValueValue The type is <code>Double</code>
   */
  public void setOfficeValueAttribute(Double officeValueValue) {
    OfficeValueAttribute attr = new OfficeValueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setDoubleValue(officeValueValue.doubleValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>OfficeValueTypeAttribute</code>
   * , See {@odf.attribute office:value-type}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getOfficeValueTypeAttribute() {
    OfficeValueTypeAttribute attr =
        (OfficeValueTypeAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value-type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See
   * {@odf.attribute office:value-type}
   *
   * @param officeValueTypeValue The type is <code>String</code>
   */
  public void setOfficeValueTypeAttribute(String officeValueTypeValue) {
    OfficeValueTypeAttribute attr = new OfficeValueTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(officeValueTypeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableCellAddressAttribute
   * </code> , See {@odf.attribute table:cell-address}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableCellAddressAttribute() {
    TableCellAddressAttribute attr =
        (TableCellAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "cell-address");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableCellAddressAttribute</code> , See
   * {@odf.attribute table:cell-address}
   *
   * @param tableCellAddressValue The type is <code>String</code>
   */
  public void setTableCellAddressAttribute(String tableCellAddressValue) {
    TableCellAddressAttribute attr = new TableCellAddressAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableCellAddressValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableFormulaAttribute</code> ,
   * See {@odf.attribute table:formula}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableFormulaAttribute() {
    TableFormulaAttribute attr =
        (TableFormulaAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "formula");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableFormulaAttribute</code> , See
   * {@odf.attribute table:formula}
   *
   * @param tableFormulaValue The type is <code>String</code>
   */
  public void setTableFormulaAttribute(String tableFormulaValue) {
    TableFormulaAttribute attr = new TableFormulaAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableFormulaValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableMatrixCoveredAttribute
   * </code> , See {@odf.attribute table:matrix-covered}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTableMatrixCoveredAttribute() {
    TableMatrixCoveredAttribute attr =
        (TableMatrixCoveredAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "matrix-covered");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TableMatrixCoveredAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableMatrixCoveredAttribute</code> ,
   * See {@odf.attribute table:matrix-covered}
   *
   * @param tableMatrixCoveredValue The type is <code>Boolean</code>
   */
  public void setTableMatrixCoveredAttribute(Boolean tableMatrixCoveredValue) {
    TableMatrixCoveredAttribute attr =
        new TableMatrixCoveredAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(tableMatrixCoveredValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TableNumberMatrixColumnsSpannedAttribute</code> , See {@odf.attribute
   * table:number-matrix-columns-spanned}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTableNumberMatrixColumnsSpannedAttribute() {
    TableNumberMatrixColumnsSpannedAttribute attr =
        (TableNumberMatrixColumnsSpannedAttribute)
            getOdfAttribute(OdfDocumentNamespace.TABLE, "number-matrix-columns-spanned");
    if (attr != null) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>
   * TableNumberMatrixColumnsSpannedAttribute</code> , See {@odf.attribute
   * table:number-matrix-columns-spanned}
   *
   * @param tableNumberMatrixColumnsSpannedValue The type is <code>Integer</code>
   */
  public void setTableNumberMatrixColumnsSpannedAttribute(
      Integer tableNumberMatrixColumnsSpannedValue) {
    TableNumberMatrixColumnsSpannedAttribute attr =
        new TableNumberMatrixColumnsSpannedAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tableNumberMatrixColumnsSpannedValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TableNumberMatrixRowsSpannedAttribute</code> , See {@odf.attribute
   * table:number-matrix-rows-spanned}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTableNumberMatrixRowsSpannedAttribute() {
    TableNumberMatrixRowsSpannedAttribute attr =
        (TableNumberMatrixRowsSpannedAttribute)
            getOdfAttribute(OdfDocumentNamespace.TABLE, "number-matrix-rows-spanned");
    if (attr != null) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableNumberMatrixRowsSpannedAttribute
   * </code> , See {@odf.attribute table:number-matrix-rows-spanned}
   *
   * @param tableNumberMatrixRowsSpannedValue The type is <code>Integer</code>
   */
  public void setTableNumberMatrixRowsSpannedAttribute(Integer tableNumberMatrixRowsSpannedValue) {
    TableNumberMatrixRowsSpannedAttribute attr =
        new TableNumberMatrixRowsSpannedAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tableNumberMatrixRowsSpannedValue.intValue());
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

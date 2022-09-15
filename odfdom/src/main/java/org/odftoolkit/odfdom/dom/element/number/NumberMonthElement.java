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
package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.number.NumberCalendarAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberPossessiveFormAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTextualAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element number:month}. */
public class NumberMonthElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.NUMBER, "month");

  /**
   * Create the instance of <code>NumberMonthElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public NumberMonthElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element number:month}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberCalendarAttribute</code>
   * , See {@odf.attribute number:calendar}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberCalendarAttribute() {
    NumberCalendarAttribute attr =
        (NumberCalendarAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "calendar");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberCalendarAttribute</code> , See
   * {@odf.attribute number:calendar}
   *
   * @param numberCalendarValue The type is <code>String</code>
   */
  public void setNumberCalendarAttribute(String numberCalendarValue) {
    NumberCalendarAttribute attr = new NumberCalendarAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberCalendarValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberPossessiveFormAttribute
   * </code> , See {@odf.attribute number:possessive-form}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getNumberPossessiveFormAttribute() {
    NumberPossessiveFormAttribute attr =
        (NumberPossessiveFormAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "possessive-form");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberPossessiveFormAttribute</code> ,
   * See {@odf.attribute number:possessive-form}
   *
   * @param numberPossessiveFormValue The type is <code>Boolean</code>
   */
  public void setNumberPossessiveFormAttribute(Boolean numberPossessiveFormValue) {
    NumberPossessiveFormAttribute attr =
        new NumberPossessiveFormAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(numberPossessiveFormValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberStyleAttribute</code> ,
   * See {@odf.attribute number:style}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberStyleAttribute() {
    NumberStyleAttribute attr =
        (NumberStyleAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "style");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberStyleAttribute</code> , See
   * {@odf.attribute number:style}
   *
   * @param numberStyleValue The type is <code>String</code>
   */
  public void setNumberStyleAttribute(String numberStyleValue) {
    NumberStyleAttribute attr = new NumberStyleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberStyleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberTextualAttribute</code> ,
   * See {@odf.attribute number:textual}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getNumberTextualAttribute() {
    NumberTextualAttribute attr =
        (NumberTextualAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "textual");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(NumberTextualAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberTextualAttribute</code> , See
   * {@odf.attribute number:textual}
   *
   * @param numberTextualValue The type is <code>Boolean</code>
   */
  public void setNumberTextualAttribute(Boolean numberTextualValue) {
    NumberTextualAttribute attr = new NumberTextualAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(numberTextualValue.booleanValue());
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

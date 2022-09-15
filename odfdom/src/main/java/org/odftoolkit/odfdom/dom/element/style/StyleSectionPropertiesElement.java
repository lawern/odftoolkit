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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.fo.FoBackgroundColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginLeftAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginRightAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleEditableAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleProtectAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleWritingModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDontBalanceTextColumnsAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;
import org.odftoolkit.odfdom.dom.element.text.TextNotesConfigurationElement;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element style:section-properties}. */
public class StyleSectionPropertiesElement extends OdfStylePropertiesBase {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.STYLE, "section-properties");

  /**
   * Create the instance of <code>StyleSectionPropertiesElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public StyleSectionPropertiesElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     style:section-properties}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  public static final OdfStyleProperty BackgroundColor =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "background-color"));

  public static final OdfStyleProperty MarginLeft =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "margin-left"));

  public static final OdfStyleProperty MarginRight =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "margin-right"));

  public static final OdfStyleProperty Editable =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "editable"));

  public static final OdfStyleProperty Protect =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "protect"));

  public static final OdfStyleProperty WritingMode =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "writing-mode"));

  public static final OdfStyleProperty DontBalanceTextColumns =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.SectionProperties,
          OdfName.newName(OdfDocumentNamespace.TEXT, "dont-balance-text-columns"));

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoBackgroundColorAttribute
   * </code> , See {@odf.attribute fo:background-color}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoBackgroundColorAttribute() {
    FoBackgroundColorAttribute attr =
        (FoBackgroundColorAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "background-color");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoBackgroundColorAttribute</code> , See
   * {@odf.attribute fo:background-color}
   *
   * @param foBackgroundColorValue The type is <code>String</code>
   */
  public void setFoBackgroundColorAttribute(String foBackgroundColorValue) {
    FoBackgroundColorAttribute attr =
        new FoBackgroundColorAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foBackgroundColorValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoMarginLeftAttribute</code> ,
   * See {@odf.attribute fo:margin-left}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoMarginLeftAttribute() {
    FoMarginLeftAttribute attr =
        (FoMarginLeftAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "margin-left");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See
   * {@odf.attribute fo:margin-left}
   *
   * @param foMarginLeftValue The type is <code>String</code>
   */
  public void setFoMarginLeftAttribute(String foMarginLeftValue) {
    FoMarginLeftAttribute attr = new FoMarginLeftAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foMarginLeftValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoMarginRightAttribute</code> ,
   * See {@odf.attribute fo:margin-right}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoMarginRightAttribute() {
    FoMarginRightAttribute attr =
        (FoMarginRightAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "margin-right");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoMarginRightAttribute</code> , See
   * {@odf.attribute fo:margin-right}
   *
   * @param foMarginRightValue The type is <code>String</code>
   */
  public void setFoMarginRightAttribute(String foMarginRightValue) {
    FoMarginRightAttribute attr = new FoMarginRightAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foMarginRightValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleEditableAttribute</code> ,
   * See {@odf.attribute style:editable}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getStyleEditableAttribute() {
    StyleEditableAttribute attr =
        (StyleEditableAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "editable");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleEditableAttribute</code> , See
   * {@odf.attribute style:editable}
   *
   * @param styleEditableValue The type is <code>Boolean</code>
   */
  public void setStyleEditableAttribute(Boolean styleEditableValue) {
    StyleEditableAttribute attr = new StyleEditableAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(styleEditableValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleProtectAttribute</code> ,
   * See {@odf.attribute style:protect}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleProtectAttribute() {
    StyleProtectAttribute attr =
        (StyleProtectAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "protect");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleProtectAttribute</code> , See
   * {@odf.attribute style:protect}
   *
   * @param styleProtectValue The type is <code>String</code>
   */
  public void setStyleProtectAttribute(String styleProtectValue) {
    StyleProtectAttribute attr = new StyleProtectAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleProtectValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleWritingModeAttribute
   * </code> , See {@odf.attribute style:writing-mode}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleWritingModeAttribute() {
    StyleWritingModeAttribute attr =
        (StyleWritingModeAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "writing-mode");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleWritingModeAttribute</code> , See
   * {@odf.attribute style:writing-mode}
   *
   * @param styleWritingModeValue The type is <code>String</code>
   */
  public void setStyleWritingModeAttribute(String styleWritingModeValue) {
    StyleWritingModeAttribute attr = new StyleWritingModeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleWritingModeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextDontBalanceTextColumnsAttribute</code> , See {@odf.attribute
   * text:dont-balance-text-columns}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextDontBalanceTextColumnsAttribute() {
    TextDontBalanceTextColumnsAttribute attr =
        (TextDontBalanceTextColumnsAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "dont-balance-text-columns");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextDontBalanceTextColumnsAttribute
   * </code> , See {@odf.attribute text:dont-balance-text-columns}
   *
   * @param textDontBalanceTextColumnsValue The type is <code>Boolean</code>
   */
  public void setTextDontBalanceTextColumnsAttribute(Boolean textDontBalanceTextColumnsValue) {
    TextDontBalanceTextColumnsAttribute attr =
        new TextDontBalanceTextColumnsAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textDontBalanceTextColumnsValue.booleanValue());
  }

  /**
   * Create child element {@odf.element style:background-image}.
   *
   * <p>Child element was added in ODF 1.2
   *
   * @return the element {@odf.element style:background-image}
   */
  public StyleBackgroundImageElement newStyleBackgroundImageElement() {
    StyleBackgroundImageElement styleBackgroundImage =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleBackgroundImageElement.class);
    this.appendChild(styleBackgroundImage);
    return styleBackgroundImage;
  }

  /**
   * Create child element {@odf.element style:columns}.
   *
   * @param foColumnCountValue the <code>Integer</code> value of <code>FoColumnCountAttribute</code>
   *     , see {@odf.attribute fo:column-count} at specification Child element was added in ODF 1.2
   * @return the element {@odf.element style:columns}
   */
  public StyleColumnsElement newStyleColumnsElement(int foColumnCountValue) {
    StyleColumnsElement styleColumns =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleColumnsElement.class);
    styleColumns.setFoColumnCountAttribute(foColumnCountValue);
    this.appendChild(styleColumns);
    return styleColumns;
  }

  /**
   * Create child element {@odf.element text:notes-configuration}.
   *
   * @param styleNumFormatValue the <code>String</code> value of <code>StyleNumFormatAttribute
   *     </code>, see {@odf.attribute style:num-format} at specification
   * @param textNoteClassValue the <code>String</code> value of <code>TextNoteClassAttribute</code>,
   *     see {@odf.attribute text:note-class} at specification Child element was added in ODF 1.2
   * @return the element {@odf.element text:notes-configuration}
   */
  public TextNotesConfigurationElement newTextNotesConfigurationElement(
      String styleNumFormatValue, String textNoteClassValue) {
    TextNotesConfigurationElement textNotesConfiguration =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextNotesConfigurationElement.class);
    textNotesConfiguration.setStyleNumFormatAttribute(styleNumFormatValue);
    textNotesConfiguration.setTextNoteClassAttribute(textNoteClassValue);
    this.appendChild(textNotesConfiguration);
    return textNotesConfiguration;
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

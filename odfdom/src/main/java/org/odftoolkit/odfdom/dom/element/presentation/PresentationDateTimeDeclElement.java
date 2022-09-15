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
package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationSourceAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDataStyleNameAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element presentation:date-time-decl}. */
public class PresentationDateTimeDeclElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.PRESENTATION, "date-time-decl");

  /**
   * Create the instance of <code>PresentationDateTimeDeclElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public PresentationDateTimeDeclElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     presentation:date-time-decl}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>PresentationNameAttribute
   * </code> , See {@odf.attribute presentation:name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationNameAttribute() {
    PresentationNameAttribute attr =
        (PresentationNameAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationNameAttribute</code> , See
   * {@odf.attribute presentation:name}
   *
   * @param presentationNameValue The type is <code>String</code>
   */
  public void setPresentationNameAttribute(String presentationNameValue) {
    PresentationNameAttribute attr = new PresentationNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>PresentationSourceAttribute
   * </code> , See {@odf.attribute presentation:source}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationSourceAttribute() {
    PresentationSourceAttribute attr =
        (PresentationSourceAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "source");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationSourceAttribute</code> ,
   * See {@odf.attribute presentation:source}
   *
   * @param presentationSourceValue The type is <code>String</code>
   */
  public void setPresentationSourceAttribute(String presentationSourceValue) {
    PresentationSourceAttribute attr =
        new PresentationSourceAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationSourceValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleDataStyleNameAttribute
   * </code> , See {@odf.attribute style:data-style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleDataStyleNameAttribute() {
    StyleDataStyleNameAttribute attr =
        (StyleDataStyleNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.STYLE, "data-style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleDataStyleNameAttribute</code> ,
   * See {@odf.attribute style:data-style-name}
   *
   * @param styleDataStyleNameValue The type is <code>String</code>
   */
  public void setStyleDataStyleNameAttribute(String styleDataStyleNameValue) {
    StyleDataStyleNameAttribute attr =
        new StyleDataStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleDataStyleNameValue);
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

  /** Add text content. Only elements which are allowed to have text content offer this method. */
  public void newTextNode(String content) {
    if (content != null && !content.equals("")) {
      this.appendChild(this.getOwnerDocument().createTextNode(content));
    }
  }
}

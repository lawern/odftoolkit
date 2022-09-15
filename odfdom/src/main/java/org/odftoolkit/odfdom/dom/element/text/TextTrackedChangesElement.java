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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextTrackChangesAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:tracked-changes}. */
public class TextTrackedChangesElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "tracked-changes");

  /**
   * Create the instance of <code>TextTrackedChangesElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextTrackedChangesElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element text:tracked-changes}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextTrackChangesAttribute
   * </code> , See {@odf.attribute text:track-changes}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextTrackChangesAttribute() {
    TextTrackChangesAttribute attr =
        (TextTrackChangesAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "track-changes");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextTrackChangesAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextTrackChangesAttribute</code> , See
   * {@odf.attribute text:track-changes}
   *
   * @param textTrackChangesValue The type is <code>Boolean</code>
   */
  public void setTextTrackChangesAttribute(Boolean textTrackChangesValue) {
    TextTrackChangesAttribute attr = new TextTrackChangesAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textTrackChangesValue.booleanValue());
  }

  /**
   * Create child element {@odf.element text:changed-region}.
   *
   * @param xmlIdValue the <code>String</code> value of <code>XmlIdAttribute</code>, see
   *     {@odf.attribute xml:id} at specification
   * @return the element {@odf.element text:changed-region}
   */
  public TextChangedRegionElement newTextChangedRegionElement(String xmlIdValue) {
    TextChangedRegionElement textChangedRegion =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangedRegionElement.class);
    textChangedRegion.setXmlIdAttribute(xmlIdValue);
    this.appendChild(textChangedRegion);
    return textChangedRegion;
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

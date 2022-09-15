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
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawPageNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationPlaceholderAttribute;
import org.odftoolkit.odfdom.dom.attribute.presentation.PresentationUserTransformedAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgXAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element draw:page-thumbnail}. */
public class DrawPageThumbnailElement extends DrawShapeElementBase {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.DRAW, "page-thumbnail");

  /**
   * Create the instance of <code>DrawPageThumbnailElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DrawPageThumbnailElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element draw:page-thumbnail}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> ,
   * See {@odf.attribute draw:caption-id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawCaptionIdAttribute() {
    DrawCaptionIdAttribute attr =
        (DrawCaptionIdAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "caption-id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See
   * {@odf.attribute draw:caption-id}
   *
   * @param drawCaptionIdValue The type is <code>String</code>
   */
  public void setDrawCaptionIdAttribute(String drawCaptionIdValue) {
    DrawCaptionIdAttribute attr = new DrawCaptionIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawCaptionIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawLayerAttribute</code> , See
   * {@odf.attribute draw:layer}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawLayerAttribute() {
    DrawLayerAttribute attr =
        (DrawLayerAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "layer");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawLayerAttribute</code> , See
   * {@odf.attribute draw:layer}
   *
   * @param drawLayerValue The type is <code>String</code>
   */
  public void setDrawLayerAttribute(String drawLayerValue) {
    DrawLayerAttribute attr = new DrawLayerAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawLayerValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawPageNumberAttribute</code>
   * , See {@odf.attribute draw:page-number}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getDrawPageNumberAttribute() {
    DrawPageNumberAttribute attr =
        (DrawPageNumberAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "page-number");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawPageNumberAttribute</code> , See
   * {@odf.attribute draw:page-number}
   *
   * @param drawPageNumberValue The type is <code>Integer</code>
   */
  public void setDrawPageNumberAttribute(Integer drawPageNumberValue) {
    DrawPageNumberAttribute attr = new DrawPageNumberAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(drawPageNumberValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DrawTransformAttribute</code> ,
   * See {@odf.attribute draw:transform}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDrawTransformAttribute() {
    DrawTransformAttribute attr =
        (DrawTransformAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "transform");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DrawTransformAttribute</code> , See
   * {@odf.attribute draw:transform}
   *
   * @param drawTransformValue The type is <code>String</code>
   */
  public void setDrawTransformAttribute(String drawTransformValue) {
    DrawTransformAttribute attr = new DrawTransformAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(drawTransformValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>PresentationClassAttribute
   * </code> , See {@odf.attribute presentation:class}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getPresentationClassAttribute() {
    PresentationClassAttribute attr =
        (PresentationClassAttribute) getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "class");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationClassAttribute</code> , See
   * {@odf.attribute presentation:class}
   *
   * @param presentationClassValue The type is <code>String</code>
   */
  public void setPresentationClassAttribute(String presentationClassValue) {
    PresentationClassAttribute attr =
        new PresentationClassAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(presentationClassValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * PresentationPlaceholderAttribute</code> , See {@odf.attribute presentation:placeholder}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getPresentationPlaceholderAttribute() {
    PresentationPlaceholderAttribute attr =
        (PresentationPlaceholderAttribute)
            getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "placeholder");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationPlaceholderAttribute</code>
   * , See {@odf.attribute presentation:placeholder}
   *
   * @param presentationPlaceholderValue The type is <code>Boolean</code>
   */
  public void setPresentationPlaceholderAttribute(Boolean presentationPlaceholderValue) {
    PresentationPlaceholderAttribute attr =
        new PresentationPlaceholderAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(presentationPlaceholderValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * PresentationUserTransformedAttribute</code> , See {@odf.attribute
   * presentation:user-transformed}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getPresentationUserTransformedAttribute() {
    PresentationUserTransformedAttribute attr =
        (PresentationUserTransformedAttribute)
            getOdfAttribute(OdfDocumentNamespace.PRESENTATION, "user-transformed");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>PresentationUserTransformedAttribute
   * </code> , See {@odf.attribute presentation:user-transformed}
   *
   * @param presentationUserTransformedValue The type is <code>Boolean</code>
   */
  public void setPresentationUserTransformedAttribute(Boolean presentationUserTransformedValue) {
    PresentationUserTransformedAttribute attr =
        new PresentationUserTransformedAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(presentationUserTransformedValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgHeightAttribute</code> , See
   * {@odf.attribute svg:height}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgHeightAttribute() {
    SvgHeightAttribute attr =
        (SvgHeightAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "height");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgHeightAttribute</code> , See
   * {@odf.attribute svg:height}
   *
   * @param svgHeightValue The type is <code>String</code>
   */
  public void setSvgHeightAttribute(String svgHeightValue) {
    SvgHeightAttribute attr = new SvgHeightAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgHeightValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgWidthAttribute</code> , See
   * {@odf.attribute svg:width}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgWidthAttribute() {
    SvgWidthAttribute attr = (SvgWidthAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "width");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgWidthAttribute</code> , See
   * {@odf.attribute svg:width}
   *
   * @param svgWidthValue The type is <code>String</code>
   */
  public void setSvgWidthAttribute(String svgWidthValue) {
    SvgWidthAttribute attr = new SvgWidthAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgWidthValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgXAttribute</code> , See
   * {@odf.attribute svg:x}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgXAttribute() {
    SvgXAttribute attr = (SvgXAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "x");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgXAttribute</code> , See
   * {@odf.attribute svg:x}
   *
   * @param svgXValue The type is <code>String</code>
   */
  public void setSvgXAttribute(String svgXValue) {
    SvgXAttribute attr = new SvgXAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgXValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See
   * {@odf.attribute svg:y}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgYAttribute() {
    SvgYAttribute attr = (SvgYAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "y");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See
   * {@odf.attribute svg:y}
   *
   * @param svgYValue The type is <code>String</code>
   */
  public void setSvgYAttribute(String svgYValue) {
    SvgYAttribute attr = new SvgYAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgYValue);
  }

  /**
   * Create child element {@odf.element svg:desc}.
   *
   * <p>Child element was added in ODF 1.1
   *
   * @return the element {@odf.element svg:desc}
   */
  public SvgDescElement newSvgDescElement() {
    SvgDescElement svgDesc = ((OdfFileDom) this.ownerDocument).newOdfElement(SvgDescElement.class);
    this.appendChild(svgDesc);
    return svgDesc;
  }

  /**
   * Create child element {@odf.element svg:title}.
   *
   * <p>Child element was added in ODF 1.1
   *
   * @return the element {@odf.element svg:title}
   */
  public SvgTitleElement newSvgTitleElement() {
    SvgTitleElement svgTitle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(SvgTitleElement.class);
    this.appendChild(svgTitle);
    return svgTitle;
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

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
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element draw:image-map}. */
public class DrawImageMapElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.DRAW, "image-map");

  /**
   * Create the instance of <code>DrawImageMapElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DrawImageMapElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element draw:image-map}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element draw:area-circle}.
   *
   * @param svgCxValue the <code>String</code> value of <code>SvgCxAttribute</code>, see
   *     {@odf.attribute svg:cx} at specification
   * @param svgCyValue the <code>String</code> value of <code>SvgCyAttribute</code>, see
   *     {@odf.attribute svg:cy} at specification
   * @param svgRValue the <code>String</code> value of <code>SvgRAttribute</code>, see
   *     {@odf.attribute svg:r} at specification
   * @return the element {@odf.element draw:area-circle}
   */
  public DrawAreaCircleElement newDrawAreaCircleElement(
      String svgCxValue, String svgCyValue, String svgRValue) {
    DrawAreaCircleElement drawAreaCircle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawAreaCircleElement.class);
    drawAreaCircle.setSvgCxAttribute(svgCxValue);
    drawAreaCircle.setSvgCyAttribute(svgCyValue);
    drawAreaCircle.setSvgRAttribute(svgRValue);
    this.appendChild(drawAreaCircle);
    return drawAreaCircle;
  }

  /**
   * Create child element {@odf.element draw:area-polygon}.
   *
   * @param drawPointsValue the <code>String</code> value of <code>DrawPointsAttribute</code>, see
   *     {@odf.attribute draw:points} at specification
   * @param svgHeightValue the <code>String</code> value of <code>SvgHeightAttribute</code>, see
   *     {@odf.attribute svg:height} at specification
   * @param svgViewBoxValue the <code>Integer</code> value of <code>SvgViewBoxAttribute</code>, see
   *     {@odf.attribute svg:viewBox} at specification
   * @param svgWidthValue the <code>String</code> value of <code>SvgWidthAttribute</code>, see
   *     {@odf.attribute svg:width} at specification
   * @param svgXValue the <code>String</code> value of <code>SvgXAttribute</code>, see
   *     {@odf.attribute svg:x} at specification
   * @param svgYValue the <code>String</code> value of <code>SvgYAttribute</code>, see
   *     {@odf.attribute svg:y} at specification
   * @return the element {@odf.element draw:area-polygon}
   */
  public DrawAreaPolygonElement newDrawAreaPolygonElement(
      String drawPointsValue,
      String svgHeightValue,
      int svgViewBoxValue,
      String svgWidthValue,
      String svgXValue,
      String svgYValue) {
    DrawAreaPolygonElement drawAreaPolygon =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawAreaPolygonElement.class);
    drawAreaPolygon.setDrawPointsAttribute(drawPointsValue);
    drawAreaPolygon.setSvgHeightAttribute(svgHeightValue);
    drawAreaPolygon.setSvgViewBoxAttribute(svgViewBoxValue);
    drawAreaPolygon.setSvgWidthAttribute(svgWidthValue);
    drawAreaPolygon.setSvgXAttribute(svgXValue);
    drawAreaPolygon.setSvgYAttribute(svgYValue);
    this.appendChild(drawAreaPolygon);
    return drawAreaPolygon;
  }

  /**
   * Create child element {@odf.element draw:area-rectangle}.
   *
   * @param svgHeightValue the <code>String</code> value of <code>SvgHeightAttribute</code>, see
   *     {@odf.attribute svg:height} at specification
   * @param svgWidthValue the <code>String</code> value of <code>SvgWidthAttribute</code>, see
   *     {@odf.attribute svg:width} at specification
   * @param svgXValue the <code>String</code> value of <code>SvgXAttribute</code>, see
   *     {@odf.attribute svg:x} at specification
   * @param svgYValue the <code>String</code> value of <code>SvgYAttribute</code>, see
   *     {@odf.attribute svg:y} at specification
   * @return the element {@odf.element draw:area-rectangle}
   */
  public DrawAreaRectangleElement newDrawAreaRectangleElement(
      String svgHeightValue, String svgWidthValue, String svgXValue, String svgYValue) {
    DrawAreaRectangleElement drawAreaRectangle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DrawAreaRectangleElement.class);
    drawAreaRectangle.setSvgHeightAttribute(svgHeightValue);
    drawAreaRectangle.setSvgWidthAttribute(svgWidthValue);
    drawAreaRectangle.setSvgXAttribute(svgXValue);
    drawAreaRectangle.setSvgYAttribute(svgYValue);
    this.appendChild(drawAreaRectangle);
    return drawAreaRectangle;
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

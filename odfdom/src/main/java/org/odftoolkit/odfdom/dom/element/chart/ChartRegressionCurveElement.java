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
package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element chart:regression-curve}. */
public class ChartRegressionCurveElement extends OdfStylableElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.CHART, "regression-curve");

  /**
   * Create the instance of <code>ChartRegressionCurveElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public ChartRegressionCurveElement(OdfFileDom ownerDoc) {
    super(
        ownerDoc,
        ELEMENT_NAME,
        OdfStyleFamily.Chart,
        OdfName.newName(OdfDocumentNamespace.CHART, "style-name"));
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element chart:regression-curve}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code>
   * , See {@odf.attribute chart:style-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getChartStyleNameAttribute() {
    ChartStyleNameAttribute attr =
        (ChartStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "style-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See
   * {@odf.attribute chart:style-name}
   *
   * @param chartStyleNameValue The type is <code>String</code>
   */
  public void setChartStyleNameAttribute(String chartStyleNameValue) {
    ChartStyleNameAttribute attr = new ChartStyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(chartStyleNameValue);
  }

  /**
   * Create child element {@odf.element chart:equation}.
   *
   * <p>Child element was added in ODF 1.2
   *
   * @return the element {@odf.element chart:equation}
   */
  public ChartEquationElement newChartEquationElement() {
    ChartEquationElement chartEquation =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartEquationElement.class);
    this.appendChild(chartEquation);
    return chartEquation;
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

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
import org.odftoolkit.odfdom.dom.attribute.chart.ChartClassAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartColumnMappingAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartRowMappingAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element chart:chart}. */
public class ChartChartElement extends OdfStylableElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.CHART, "chart");

  /**
   * Create the instance of <code>ChartChartElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public ChartChartElement(OdfFileDom ownerDoc) {
    super(
        ownerDoc,
        ELEMENT_NAME,
        OdfStyleFamily.Chart,
        OdfName.newName(OdfDocumentNamespace.CHART, "style-name"));
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element chart:chart}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>ChartClassAttribute</code> ,
   * See {@odf.attribute chart:class}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getChartClassAttribute() {
    ChartClassAttribute attr =
        (ChartClassAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "class");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>ChartClassAttribute</code> , See
   * {@odf.attribute chart:class}
   *
   * @param chartClassValue The type is <code>String</code>
   */
  public void setChartClassAttribute(String chartClassValue) {
    ChartClassAttribute attr = new ChartClassAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(chartClassValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>ChartColumnMappingAttribute
   * </code> , See {@odf.attribute chart:column-mapping}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getChartColumnMappingAttribute() {
    ChartColumnMappingAttribute attr =
        (ChartColumnMappingAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "column-mapping");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>ChartColumnMappingAttribute</code> ,
   * See {@odf.attribute chart:column-mapping}
   *
   * @param chartColumnMappingValue The type is <code>String</code>
   */
  public void setChartColumnMappingAttribute(String chartColumnMappingValue) {
    ChartColumnMappingAttribute attr =
        new ChartColumnMappingAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(chartColumnMappingValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>ChartRowMappingAttribute</code>
   * , See {@odf.attribute chart:row-mapping}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getChartRowMappingAttribute() {
    ChartRowMappingAttribute attr =
        (ChartRowMappingAttribute) getOdfAttribute(OdfDocumentNamespace.CHART, "row-mapping");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>ChartRowMappingAttribute</code> , See
   * {@odf.attribute chart:row-mapping}
   *
   * @param chartRowMappingValue The type is <code>String</code>
   */
  public void setChartRowMappingAttribute(String chartRowMappingValue) {
    ChartRowMappingAttribute attr = new ChartRowMappingAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(chartRowMappingValue);
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
   * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkHrefAttribute() {
    XlinkHrefAttribute attr =
        (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See
   * {@odf.attribute xlink:href}
   *
   * @param xlinkHrefValue The type is <code>String</code>
   */
  public void setXlinkHrefAttribute(String xlinkHrefValue) {
    XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkHrefValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXlinkTypeAttribute() {
    XlinkTypeAttribute attr =
        (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See
   * {@odf.attribute xlink:type}
   *
   * @param xlinkTypeValue The type is <code>String</code>
   */
  public void setXlinkTypeAttribute(String xlinkTypeValue) {
    XlinkTypeAttribute attr = new XlinkTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xlinkTypeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getXmlIdAttribute() {
    XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See
   * {@odf.attribute xml:id}
   *
   * @param xmlIdValue The type is <code>String</code>
   */
  public void setXmlIdAttribute(String xmlIdValue) {
    XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(xmlIdValue);
  }

  /**
   * Create child element {@odf.element chart:footer}.
   *
   * @return the element {@odf.element chart:footer}
   */
  public ChartFooterElement newChartFooterElement() {
    ChartFooterElement chartFooter =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartFooterElement.class);
    this.appendChild(chartFooter);
    return chartFooter;
  }

  /**
   * Create child element {@odf.element chart:legend}.
   *
   * @param chartLegendPositionValue the <code>String</code> value of <code>
   *     ChartLegendPositionAttribute</code>, see {@odf.attribute chart:legend-position} at
   *     specification
   * @param styleLegendExpansionValue the <code>String</code> value of <code>
   *     StyleLegendExpansionAttribute</code>, see {@odf.attribute style:legend-expansion} at
   *     specification
   * @return the element {@odf.element chart:legend}
   */
  public ChartLegendElement newChartLegendElement(
      String chartLegendPositionValue, String styleLegendExpansionValue) {
    ChartLegendElement chartLegend =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartLegendElement.class);
    chartLegend.setChartLegendPositionAttribute(chartLegendPositionValue);
    chartLegend.setStyleLegendExpansionAttribute(styleLegendExpansionValue);
    this.appendChild(chartLegend);
    return chartLegend;
  }

  /**
   * Create child element {@odf.element chart:plot-area}.
   *
   * <p>Child element is mandatory.
   *
   * @return the element {@odf.element chart:plot-area}
   */
  public ChartPlotAreaElement newChartPlotAreaElement() {
    ChartPlotAreaElement chartPlotArea =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartPlotAreaElement.class);
    this.appendChild(chartPlotArea);
    return chartPlotArea;
  }

  /**
   * Create child element {@odf.element chart:subtitle}.
   *
   * @return the element {@odf.element chart:subtitle}
   */
  public ChartSubtitleElement newChartSubtitleElement() {
    ChartSubtitleElement chartSubtitle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartSubtitleElement.class);
    this.appendChild(chartSubtitle);
    return chartSubtitle;
  }

  /**
   * Create child element {@odf.element chart:title}.
   *
   * @return the element {@odf.element chart:title}
   */
  public ChartTitleElement newChartTitleElement() {
    ChartTitleElement chartTitle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(ChartTitleElement.class);
    this.appendChild(chartTitle);
    return chartTitle;
  }

  /**
   * Create child element {@odf.element table:table}.
   *
   * @return the element {@odf.element table:table}
   */
  public TableTableElement newTableTableElement() {
    TableTableElement tableTable =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableElement.class);
    this.appendChild(tableTable);
    return tableTable;
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

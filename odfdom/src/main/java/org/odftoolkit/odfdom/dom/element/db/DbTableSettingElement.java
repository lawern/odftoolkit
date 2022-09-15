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
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsFirstRowHeaderLineAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbShowDeletedAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element db:table-setting}. */
public class DbTableSettingElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.DB, "table-setting");

  /**
   * Create the instance of <code>DbTableSettingElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DbTableSettingElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element db:table-setting}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbIsFirstRowHeaderLineAttribute
   * </code> , See {@odf.attribute db:is-first-row-header-line}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getDbIsFirstRowHeaderLineAttribute() {
    DbIsFirstRowHeaderLineAttribute attr =
        (DbIsFirstRowHeaderLineAttribute)
            getOdfAttribute(OdfDocumentNamespace.DB, "is-first-row-header-line");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(DbIsFirstRowHeaderLineAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbIsFirstRowHeaderLineAttribute</code>
   * , See {@odf.attribute db:is-first-row-header-line}
   *
   * @param dbIsFirstRowHeaderLineValue The type is <code>Boolean</code>
   */
  public void setDbIsFirstRowHeaderLineAttribute(Boolean dbIsFirstRowHeaderLineValue) {
    DbIsFirstRowHeaderLineAttribute attr =
        new DbIsFirstRowHeaderLineAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(dbIsFirstRowHeaderLineValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbShowDeletedAttribute</code> ,
   * See {@odf.attribute db:show-deleted}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getDbShowDeletedAttribute() {
    DbShowDeletedAttribute attr =
        (DbShowDeletedAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "show-deleted");
    if (attr != null && !attr.getValue().isEmpty()) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(DbShowDeletedAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbShowDeletedAttribute</code> , See
   * {@odf.attribute db:show-deleted}
   *
   * @param dbShowDeletedValue The type is <code>Boolean</code>
   */
  public void setDbShowDeletedAttribute(Boolean dbShowDeletedValue) {
    DbShowDeletedAttribute attr = new DbShowDeletedAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(dbShowDeletedValue.booleanValue());
  }

  /**
   * Create child element {@odf.element db:character-set}.
   *
   * <p>Child element was added in ODF 1.2
   *
   * @return the element {@odf.element db:character-set}
   */
  public DbCharacterSetElement newDbCharacterSetElement() {
    DbCharacterSetElement dbCharacterSet =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DbCharacterSetElement.class);
    this.appendChild(dbCharacterSet);
    return dbCharacterSet;
  }

  /**
   * Create child element {@odf.element db:delimiter}.
   *
   * <p>Child element was added in ODF 1.2
   *
   * @return the element {@odf.element db:delimiter}
   */
  public DbDelimiterElement newDbDelimiterElement() {
    DbDelimiterElement dbDelimiter =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DbDelimiterElement.class);
    this.appendChild(dbDelimiter);
    return dbDelimiter;
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

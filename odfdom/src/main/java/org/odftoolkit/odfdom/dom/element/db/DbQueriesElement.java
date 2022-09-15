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
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element db:queries}. */
public class DbQueriesElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "queries");

  /**
   * Create the instance of <code>DbQueriesElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DbQueriesElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element db:queries}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element db:query}.
   *
   * @param dbCommandValue the <code>String</code> value of <code>DbCommandAttribute</code>, see
   *     {@odf.attribute db:command} at specification
   * @param dbNameValue the <code>String</code> value of <code>DbNameAttribute</code>, see
   *     {@odf.attribute db:name} at specification Child element was added in ODF 1.2
   * @return the element {@odf.element db:query}
   */
  public DbQueryElement newDbQueryElement(String dbCommandValue, String dbNameValue) {
    DbQueryElement dbQuery = ((OdfFileDom) this.ownerDocument).newOdfElement(DbQueryElement.class);
    dbQuery.setDbCommandAttribute(dbCommandValue);
    dbQuery.setDbNameAttribute(dbNameValue);
    this.appendChild(dbQuery);
    return dbQuery;
  }

  /**
   * Create child element {@odf.element db:query-collection}.
   *
   * @param dbNameValue the <code>String</code> value of <code>DbNameAttribute</code>, see
   *     {@odf.attribute db:name} at specification Child element was added in ODF 1.2
   * @return the element {@odf.element db:query-collection}
   */
  public DbQueryCollectionElement newDbQueryCollectionElement(String dbNameValue) {
    DbQueryCollectionElement dbQueryCollection =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DbQueryCollectionElement.class);
    dbQueryCollection.setDbNameAttribute(dbNameValue);
    this.appendChild(dbQueryCollection);
    return dbQueryCollection;
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

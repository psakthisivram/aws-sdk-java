/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Reference that identifies an object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ObjectReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectReference implements Serializable, Cloneable {

    /**
     * <p>
     * Allows you to specify an object. You can identify an object in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>/some/path</i> - Identifies the object based on path
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>#SomeBatchReference</i> - Identifies the object in a batch call
     * </p>
     * </li>
     * </ul>
     */
    private String selector;

    /**
     * <p>
     * Allows you to specify an object. You can identify an object in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>/some/path</i> - Identifies the object based on path
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>#SomeBatchReference</i> - Identifies the object in a batch call
     * </p>
     * </li>
     * </ul>
     * 
     * @param selector
     *        Allows you to specify an object. You can identify an object in one of the following ways:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>/some/path</i> - Identifies the object based on path
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>#SomeBatchReference</i> - Identifies the object in a batch call
     *        </p>
     *        </li>
     */

    public void setSelector(String selector) {
        this.selector = selector;
    }

    /**
     * <p>
     * Allows you to specify an object. You can identify an object in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>/some/path</i> - Identifies the object based on path
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>#SomeBatchReference</i> - Identifies the object in a batch call
     * </p>
     * </li>
     * </ul>
     * 
     * @return Allows you to specify an object. You can identify an object in one of the following ways:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>/some/path</i> - Identifies the object based on path
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>#SomeBatchReference</i> - Identifies the object in a batch call
     *         </p>
     *         </li>
     */

    public String getSelector() {
        return this.selector;
    }

    /**
     * <p>
     * Allows you to specify an object. You can identify an object in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>/some/path</i> - Identifies the object based on path
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>#SomeBatchReference</i> - Identifies the object in a batch call
     * </p>
     * </li>
     * </ul>
     * 
     * @param selector
     *        Allows you to specify an object. You can identify an object in one of the following ways:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>$ObjectIdentifier</i> - Identifies the object by ObjectIdentifier
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>/some/path</i> - Identifies the object based on path
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>#SomeBatchReference</i> - Identifies the object in a batch call
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectReference withSelector(String selector) {
        setSelector(selector);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSelector() != null)
            sb.append("Selector: ").append(getSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectReference == false)
            return false;
        ObjectReference other = (ObjectReference) obj;
        if (other.getSelector() == null ^ this.getSelector() == null)
            return false;
        if (other.getSelector() != null && other.getSelector().equals(this.getSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelector() == null) ? 0 : getSelector().hashCode());
        return hashCode;
    }

    @Override
    public ObjectReference clone() {
        try {
            return (ObjectReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

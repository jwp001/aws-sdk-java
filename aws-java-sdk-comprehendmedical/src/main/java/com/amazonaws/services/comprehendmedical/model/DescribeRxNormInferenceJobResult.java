/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DescribeRxNormInferenceJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRxNormInferenceJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     */
    private ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     * 
     * @param comprehendMedicalAsyncJobProperties
     *        An object that contains the properties associated with a detection job.
     */

    public void setComprehendMedicalAsyncJobProperties(ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties) {
        this.comprehendMedicalAsyncJobProperties = comprehendMedicalAsyncJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     * 
     * @return An object that contains the properties associated with a detection job.
     */

    public ComprehendMedicalAsyncJobProperties getComprehendMedicalAsyncJobProperties() {
        return this.comprehendMedicalAsyncJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     * 
     * @param comprehendMedicalAsyncJobProperties
     *        An object that contains the properties associated with a detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRxNormInferenceJobResult withComprehendMedicalAsyncJobProperties(ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties) {
        setComprehendMedicalAsyncJobProperties(comprehendMedicalAsyncJobProperties);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getComprehendMedicalAsyncJobProperties() != null)
            sb.append("ComprehendMedicalAsyncJobProperties: ").append(getComprehendMedicalAsyncJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRxNormInferenceJobResult == false)
            return false;
        DescribeRxNormInferenceJobResult other = (DescribeRxNormInferenceJobResult) obj;
        if (other.getComprehendMedicalAsyncJobProperties() == null ^ this.getComprehendMedicalAsyncJobProperties() == null)
            return false;
        if (other.getComprehendMedicalAsyncJobProperties() != null
                && other.getComprehendMedicalAsyncJobProperties().equals(this.getComprehendMedicalAsyncJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComprehendMedicalAsyncJobProperties() == null) ? 0 : getComprehendMedicalAsyncJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRxNormInferenceJobResult clone() {
        try {
            return (DescribeRxNormInferenceJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

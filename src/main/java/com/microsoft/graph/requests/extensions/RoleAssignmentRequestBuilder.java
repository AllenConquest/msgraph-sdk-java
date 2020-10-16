// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleAssignment;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Assignment Request Builder.
 */
public class RoleAssignmentRequestBuilder extends BaseRequestBuilder<RoleAssignment> {

    /**
     * The request builder for the RoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the RoleAssignmentRequest instance
     */
    public RoleAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the RoleAssignmentRequest instance
     */
    public RoleAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.RoleAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for RoleDefinition
     *
     * @return the RoleDefinitionWithReferenceRequestBuilder instance
     */
    public RoleDefinitionWithReferenceRequestBuilder roleDefinition() {
        return new RoleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }
}

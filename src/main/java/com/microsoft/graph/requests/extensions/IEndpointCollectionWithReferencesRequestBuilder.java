// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.models.extensions.Endpoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Endpoint Collection With References Request Builder.
 */
public interface IEndpointCollectionWithReferencesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEndpointCollectionWithReferencesRequest instance
     */
    IEndpointCollectionWithReferencesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEndpointCollectionWithReferencesRequest instance
     */
    IEndpointCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IEndpointWithReferenceRequestBuilder byId(final String id);

    IEndpointCollectionReferenceRequestBuilder references();
}

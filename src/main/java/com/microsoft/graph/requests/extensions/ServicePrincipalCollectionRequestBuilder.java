// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection Request Builder.
 */
public class ServicePrincipalCollectionRequestBuilder extends BaseCollectionRequestBuilder<ServicePrincipal, ServicePrincipalRequestBuilder, ServicePrincipalCollectionResponse, ServicePrincipalCollectionPage, ServicePrincipalCollectionRequest> {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipalRequestBuilder.class, ServicePrincipalCollectionResponse.class, ServicePrincipalCollectionPage.class, ServicePrincipalCollectionRequest.class);
    }



    public ServicePrincipalDeltaCollectionRequestBuilder delta() {
        return new ServicePrincipalDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public ServicePrincipalDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new ServicePrincipalDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}

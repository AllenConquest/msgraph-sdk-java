// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DomainForceDeleteRequest;
import com.microsoft.graph.models.extensions.Domain;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Force Delete Request Builder.
 */
public class DomainForceDeleteRequestBuilder extends BaseActionRequestBuilder<Domain> {

    /**
     * The request builder for this DomainForceDelete
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param disableUserAccounts the disableUserAccounts
     */
    public DomainForceDeleteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean disableUserAccounts) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("disableUserAccounts", disableUserAccounts);
    }

    /**
     * Creates the DomainForceDeleteRequest
     *
     * @param requestOptions the options for the request
     * @return the DomainForceDeleteRequest instance
     */
    public DomainForceDeleteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DomainForceDeleteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DomainForceDeleteRequest instance
     */
    public DomainForceDeleteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DomainForceDeleteRequest request = new DomainForceDeleteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("disableUserAccounts")) {
            request.body.disableUserAccounts = getParameter("disableUserAccounts");
        }

        return request;
    }
}

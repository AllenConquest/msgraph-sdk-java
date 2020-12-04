// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.CallKeepAliveRequest;
import com.microsoft.graph.models.extensions.Call;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Keep Alive Request Builder.
 */
public class CallKeepAliveRequestBuilder extends BaseActionRequestBuilder<Call> {

    /**
     * The request builder for this CallKeepAlive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallKeepAliveRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the CallKeepAliveRequest
     *
     * @param requestOptions the options for the request
     * @return the CallKeepAliveRequest instance
     */
    @Nonnull
    public CallKeepAliveRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallKeepAliveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallKeepAliveRequest instance
     */
    @Nonnull
    public CallKeepAliveRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallKeepAliveRequest request = new CallKeepAliveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

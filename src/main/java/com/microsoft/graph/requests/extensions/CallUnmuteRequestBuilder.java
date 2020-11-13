// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.CallUnmuteRequest;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Unmute Request Builder.
 */
public class CallUnmuteRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this CallUnmute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param clientContext the clientContext
     */
    public CallUnmuteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the CallUnmuteRequest
     *
     * @param requestOptions the options for the request
     * @return the CallUnmuteRequest instance
     */
    @Nonnull
    public CallUnmuteRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallUnmuteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallUnmuteRequest instance
     */
    @Nonnull
    public CallUnmuteRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallUnmuteRequest request = new CallUnmuteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}

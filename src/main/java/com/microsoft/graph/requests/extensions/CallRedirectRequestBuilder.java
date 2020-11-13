// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.CallRedirectRequest;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Redirect Request Builder.
 */
public class CallRedirectRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this CallRedirect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param targets the targets
     * @param timeout the timeout
     * @param callbackUri the callbackUri
     */
    public CallRedirectRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<InvitationParticipantInfo> targets, @Nullable final Integer timeout, @Nullable final String callbackUri) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("targets", targets);
        bodyParams.put("timeout", timeout);
        bodyParams.put("callbackUri", callbackUri);
    }

    /**
     * Creates the CallRedirectRequest
     *
     * @param requestOptions the options for the request
     * @return the CallRedirectRequest instance
     */
    @Nonnull
    public CallRedirectRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallRedirectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallRedirectRequest instance
     */
    @Nonnull
    public CallRedirectRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallRedirectRequest request = new CallRedirectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("targets")) {
            request.body.targets = getParameter("targets");
        }

        if (hasParameter("timeout")) {
            request.body.timeout = getParameter("timeout");
        }

        if (hasParameter("callbackUri")) {
            request.body.callbackUri = getParameter("callbackUri");
        }

        return request;
    }
}

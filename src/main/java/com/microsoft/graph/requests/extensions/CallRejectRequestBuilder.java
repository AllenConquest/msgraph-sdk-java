// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.CallRejectRequest;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Reject Request Builder.
 */
public class CallRejectRequestBuilder extends BaseActionRequestBuilder<Call> {

    /**
     * The request builder for this CallReject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param reason the reason
     * @param callbackUri the callbackUri
     */
    public CallRejectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final RejectReason reason, final String callbackUri) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("reason", reason);
        bodyParams.put("callbackUri", callbackUri);
    }

    /**
     * Creates the CallRejectRequest
     *
     * @param requestOptions the options for the request
     * @return the CallRejectRequest instance
     */
    public CallRejectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallRejectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallRejectRequest instance
     */
    public CallRejectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallRejectRequest request = new CallRejectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reason")) {
            request.body.reason = getParameter("reason");
        }

        if (hasParameter("callbackUri")) {
            request.body.callbackUri = getParameter("callbackUri");
        }

        return request;
    }
}

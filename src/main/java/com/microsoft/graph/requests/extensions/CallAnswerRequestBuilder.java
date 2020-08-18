// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallAnswerRequest;
import com.microsoft.graph.requests.extensions.CallAnswerRequest;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Answer Request Builder.
 */
public class CallAnswerRequestBuilder extends BaseActionRequestBuilder implements ICallAnswerRequestBuilder {

    /**
     * The request builder for this CallAnswer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param callbackUri the callbackUri
     * @param mediaConfig the mediaConfig
     * @param acceptedModalities the acceptedModalities
     */
    public CallAnswerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String callbackUri, final MediaConfig mediaConfig, final java.util.List<Modality> acceptedModalities) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("callbackUri", callbackUri);
        bodyParams.put("mediaConfig", mediaConfig);
        bodyParams.put("acceptedModalities", acceptedModalities);
    }

    /**
     * Creates the ICallAnswerRequest
     *
     * @return the ICallAnswerRequest instance
     */
    public ICallAnswerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ICallAnswerRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallAnswerRequest instance
     */
    public ICallAnswerRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        CallAnswerRequest request = new CallAnswerRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("callbackUri")) {
            request.body.callbackUri = getParameter("callbackUri");
        }

        if (hasParameter("mediaConfig")) {
            request.body.mediaConfig = getParameter("mediaConfig");
        }

        if (hasParameter("acceptedModalities")) {
            request.body.acceptedModalities = getParameter("acceptedModalities");
        }

        return request;
    }
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestRemoteAssistanceRequest;
import com.microsoft.graph.models.extensions.ManagedDevice;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Request Remote Assistance Request Builder.
 */
public class ManagedDeviceRequestRemoteAssistanceRequestBuilder extends BaseActionRequestBuilder<ManagedDevice> {

    /**
     * The request builder for this ManagedDeviceRequestRemoteAssistance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRequestRemoteAssistanceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ManagedDeviceRequestRemoteAssistanceRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceRequestRemoteAssistanceRequest instance
     */
    public ManagedDeviceRequestRemoteAssistanceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceRequestRemoteAssistanceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceRequestRemoteAssistanceRequest instance
     */
    public ManagedDeviceRequestRemoteAssistanceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceRequestRemoteAssistanceRequest request = new ManagedDeviceRequestRemoteAssistanceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

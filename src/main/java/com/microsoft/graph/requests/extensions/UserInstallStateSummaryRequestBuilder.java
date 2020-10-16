// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Request Builder.
 */
public class UserInstallStateSummaryRequestBuilder extends BaseRequestBuilder<UserInstallStateSummary> {

    /**
     * The request builder for the UserInstallStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInstallStateSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserInstallStateSummaryRequest instance
     */
    public UserInstallStateSummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UserInstallStateSummaryRequest instance
     */
    public UserInstallStateSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserInstallStateSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public DeviceInstallStateCollectionRequestBuilder deviceStates() {
        return new DeviceInstallStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates"), getClient(), null);
    }

    public DeviceInstallStateRequestBuilder deviceStates(final String id) {
        return new DeviceInstallStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates") + "/" + id, getClient(), null);
    }
}

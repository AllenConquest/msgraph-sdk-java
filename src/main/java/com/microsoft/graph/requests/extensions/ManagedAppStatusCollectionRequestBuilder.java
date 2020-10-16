// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.ManagedAppStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Status Collection Request Builder.
 */
public class ManagedAppStatusCollectionRequestBuilder extends BaseCollectionRequestBuilder<ManagedAppStatus, ManagedAppStatusRequestBuilder, ManagedAppStatusCollectionResponse, ManagedAppStatusCollectionPage, ManagedAppStatusCollectionRequest> {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppStatusRequestBuilder.class, ManagedAppStatusCollectionResponse.class, ManagedAppStatusCollectionPage.class, ManagedAppStatusCollectionRequest.class);
    }


}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection Request Builder.
 */
public class ManagedDeviceCollectionRequestBuilder extends BaseCollectionRequestBuilder<ManagedDevice, ManagedDeviceRequestBuilder, ManagedDeviceCollectionResponse, ManagedDeviceCollectionPage, ManagedDeviceCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceRequestBuilder.class, ManagedDeviceCollectionResponse.class, ManagedDeviceCollectionPage.class, ManagedDeviceCollectionRequest.class);
    }


}

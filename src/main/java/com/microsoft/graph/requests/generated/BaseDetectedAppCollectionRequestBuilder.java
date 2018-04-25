// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Detected App Collection Request Builder.
 */
public class BaseDetectedAppCollectionRequestBuilder extends BaseRequestBuilder implements IBaseDetectedAppCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDetectedAppCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDetectedAppCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDetectedAppCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DetectedAppCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDetectedAppRequestBuilder byId(final String id) {
        return new DetectedAppRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}

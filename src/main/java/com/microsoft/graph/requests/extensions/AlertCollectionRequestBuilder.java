// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.Alert;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.AlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert Collection Request Builder.
 */
public class AlertCollectionRequestBuilder extends BaseCollectionRequestBuilder<Alert, AlertRequestBuilder, AlertCollectionResponse, AlertCollectionPage, AlertCollectionRequest> {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AlertCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AlertRequestBuilder.class, AlertCollectionResponse.class, AlertCollectionPage.class, AlertCollectionRequest.class);
    }


}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.models.extensions.ItemActivity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ItemActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Collection Request Builder.
 */
public class ItemActivityCollectionRequestBuilder extends BaseCollectionRequestBuilder<ItemActivity, ItemActivityRequestBuilder, ItemActivityCollectionResponse, ItemActivityCollectionPage, ItemActivityCollectionRequest> {

    /**
     * The request builder for this collection of ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityRequestBuilder.class, ItemActivityCollectionResponse.class, ItemActivityCollectionPage.class, ItemActivityCollectionRequest.class);
    }


}

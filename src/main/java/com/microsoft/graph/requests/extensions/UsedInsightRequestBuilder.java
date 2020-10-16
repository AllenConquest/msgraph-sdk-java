// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.requests.extensions.EntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight Request Builder.
 */
public class UsedInsightRequestBuilder extends BaseRequestBuilder<UsedInsight> {

    /**
     * The request builder for the UsedInsight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UsedInsightRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UsedInsightRequest instance
     */
    public UsedInsightRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UsedInsightRequest instance
     */
    public UsedInsightRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UsedInsightRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Entity
     *
     * @return the EntityWithReferenceRequestBuilder instance
     */
    public EntityWithReferenceRequestBuilder resource() {
        return new EntityWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("resource"), getClient(), null);
    }
}

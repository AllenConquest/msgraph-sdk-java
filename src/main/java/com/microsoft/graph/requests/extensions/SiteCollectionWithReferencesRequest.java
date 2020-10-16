// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.requests.extensions.SiteWithReferenceRequest;
import com.microsoft.graph.requests.extensions.SiteReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.SiteCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.SiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection With References Request.
 */
public class SiteCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<Site, SiteWithReferenceRequest, SiteReferenceRequestBuilder, SiteWithReferenceRequestBuilder, SiteCollectionResponse, SiteCollectionPage, SiteCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public SiteCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteCollectionResponse.class, SiteCollectionPage.class, SiteCollectionWithReferencesRequestBuilder.class);
    }

    public SiteCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public SiteCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public SiteCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public SiteCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public SiteCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

}

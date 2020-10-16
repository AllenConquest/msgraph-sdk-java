// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Collection With References Request.
 */
public class DirectoryObjectCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<DirectoryObject, DirectoryObjectWithReferenceRequest, DirectoryObjectReferenceRequestBuilder, DirectoryObjectWithReferenceRequestBuilder, DirectoryObjectCollectionResponse, DirectoryObjectCollectionPage, DirectoryObjectCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public DirectoryObjectCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectCollectionResponse.class, DirectoryObjectCollectionPage.class, DirectoryObjectCollectionWithReferencesRequestBuilder.class);
    }

    public DirectoryObjectCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public DirectoryObjectCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public DirectoryObjectCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public DirectoryObjectCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public DirectoryObjectCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

}

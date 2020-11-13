// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.MobileLobApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.MobileLobAppCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileLobAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileLobAppCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileLobAppCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Lob App Collection Request.
 */
public class MobileLobAppCollectionRequest extends BaseCollectionRequest<MobileLobAppCollectionResponse, MobileLobAppCollectionPage> {

    /**
     * The request builder for this collection of MobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileLobAppCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileLobAppCollectionResponse.class, MobileLobAppCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super MobileLobAppCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    @Nonnull
    public MobileLobAppCollectionPage get() throws ClientException {
        final MobileLobAppCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(@Nonnull final MobileLobApp newMobileLobApp, @Nonnull final ICallback<? super MobileLobApp> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileLobAppRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileLobApp, callback);
    }

    @Nonnull
    public MobileLobApp post(@Nonnull final MobileLobApp newMobileLobApp) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileLobAppRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileLobApp);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileLobAppCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MobileLobAppCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (MobileLobAppCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MobileLobAppCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MobileLobAppCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MobileLobAppCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public MobileLobAppCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (MobileLobAppCollectionRequest)this;
    }
    @Nonnull
    public MobileLobAppCollectionPage buildFromResponse(@Nonnull final MobileLobAppCollectionResponse response) {
        final MobileLobAppCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileLobAppCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileLobAppCollectionPage page = new MobileLobAppCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

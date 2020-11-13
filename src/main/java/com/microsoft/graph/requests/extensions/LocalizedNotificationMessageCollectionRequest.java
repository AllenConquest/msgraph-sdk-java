// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.LocalizedNotificationMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequest;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Localized Notification Message Collection Request.
 */
public class LocalizedNotificationMessageCollectionRequest extends BaseCollectionRequest<LocalizedNotificationMessageCollectionResponse, LocalizedNotificationMessageCollectionPage> {

    /**
     * The request builder for this collection of LocalizedNotificationMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LocalizedNotificationMessageCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LocalizedNotificationMessageCollectionResponse.class, LocalizedNotificationMessageCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super LocalizedNotificationMessageCollectionPage> callback) {
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
    public LocalizedNotificationMessageCollectionPage get() throws ClientException {
        final LocalizedNotificationMessageCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(@Nonnull final LocalizedNotificationMessage newLocalizedNotificationMessage, @Nonnull final ICallback<? super LocalizedNotificationMessage> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new LocalizedNotificationMessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newLocalizedNotificationMessage, callback);
    }

    @Nonnull
    public LocalizedNotificationMessage post(@Nonnull final LocalizedNotificationMessage newLocalizedNotificationMessage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new LocalizedNotificationMessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newLocalizedNotificationMessage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public LocalizedNotificationMessageCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (LocalizedNotificationMessageCollectionRequest)this;
    }
    @Nonnull
    public LocalizedNotificationMessageCollectionPage buildFromResponse(@Nonnull final LocalizedNotificationMessageCollectionResponse response) {
        final LocalizedNotificationMessageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new LocalizedNotificationMessageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final LocalizedNotificationMessageCollectionPage page = new LocalizedNotificationMessageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

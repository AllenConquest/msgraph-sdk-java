// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IChatMessageHostedContentCollectionPage;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionResponse;
import com.microsoft.graph.requests.extensions.IChatMessageHostedContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageHostedContentCollectionRequest;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Hosted Content Collection Request.
 */
public class ChatMessageHostedContentCollectionRequest extends BaseCollectionRequest<ChatMessageHostedContentCollectionResponse, IChatMessageHostedContentCollectionPage> implements IChatMessageHostedContentCollectionRequest {

    /**
     * The request builder for this collection of ChatMessageHostedContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageHostedContentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatMessageHostedContentCollectionResponse.class, IChatMessageHostedContentCollectionPage.class);
    }

    public void get(final ICallback<IChatMessageHostedContentCollectionPage> callback) {
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

    public IChatMessageHostedContentCollectionPage get() throws ClientException {
        final ChatMessageHostedContentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ChatMessageHostedContent newChatMessageHostedContent, final ICallback<ChatMessageHostedContent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ChatMessageHostedContentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newChatMessageHostedContent, callback);
    }

    public ChatMessageHostedContent post(final ChatMessageHostedContent newChatMessageHostedContent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ChatMessageHostedContentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newChatMessageHostedContent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IChatMessageHostedContentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ChatMessageHostedContentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IChatMessageHostedContentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ChatMessageHostedContentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IChatMessageHostedContentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ChatMessageHostedContentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IChatMessageHostedContentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ChatMessageHostedContentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IChatMessageHostedContentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IChatMessageHostedContentCollectionRequest)this;
    }
    public IChatMessageHostedContentCollectionPage buildFromResponse(final ChatMessageHostedContentCollectionResponse response) {
        final IChatMessageHostedContentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ChatMessageHostedContentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ChatMessageHostedContentCollectionPage page = new ChatMessageHostedContentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
